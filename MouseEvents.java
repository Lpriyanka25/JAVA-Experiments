import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener {

    JTextArea textArea; // Creating a text area to display events
    Container contentPane; // Content pane to hold components

    // Constructor
    public MouseEvents() {
        // Set title of the frame
        setTitle("Mouse Events Example");

        // Setting up content pane and layout
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        // Creating a text area
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);

        // Adding the text area to the content pane
        contentPane.add(new JScrollPane(textArea));

        // Adding MouseListener and MouseMotionListener to the text area
        textArea.addMouseListener(this);
        textArea.addMouseMotionListener(this);

        // Frame properties
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Method to display mouse event messages
    public void display(String message) {
        textArea.append(message + "\n");
    }

    // Implementing MouseListener methods

    @Override
    public void mouseClicked(MouseEvent e) {
        display("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        display("Mouse Entered the Component");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        display("Mouse Exited the Component");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        display("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        display("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    // Implementing MouseMotionListener methods

    @Override
    public void mouseDragged(MouseEvent e) {
        display("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        display("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    // Main method to create the frame and set properties
    public static void main(String[] args) {
        new MouseEvents(); // Creating the frame and showing it
    }
}
