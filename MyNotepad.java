import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MyNotepad extends JFrame {
    private JTextArea textArea;

    public MyNotepad() {
        // Set up the frame
        setTitle("MyNotepad");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        add(new JScrollPane(textArea));
        
        // Create the menu bar and menus
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu formatMenu = new JMenu("Format");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        setJMenuBar(menuBar);

        // File menu items
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        
        openItem.addActionListener(e -> openFile());
        saveItem.addActionListener(e -> saveFile());
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Format menu items
        JMenuItem fontItem = new JMenuItem("Font");
        fontItem.addActionListener(e -> chooseFont());
        formatMenu.add(fontItem);
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                textArea.read(reader, null);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void saveFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                textArea.write(writer);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void chooseFont() {
        JFontChooser fontChooser = new JFontChooser();
        int result = fontChooser.showDialog(this);
        if (result == JFontChooser.OK_OPTION) {
            Font font = fontChooser.getSelectedFont();
            textArea.setFont(font);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyNotepad notepad = new MyNotepad();
            notepad.setVisible(true);
        });
    }
}
