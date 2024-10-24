import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    // Creating a frame
    JFrame frame;
    JTextField textField;
    
    // Creating buttons
    JButton[] numberButtons = new JButton[10];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;

    // Variables to store operands and result
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    // Constructor
    public Calculator() {
        // Creating a frame
        frame = new JFrame("Calculator");
        frame.setSize(400, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Creating the text field
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        frame.add(textField);

        // Creating buttons and adding action listeners
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("DEL");
        clrButton = new JButton("CLR");

        // Adding action listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        decButton.addActionListener(this);
        equButton.addActionListener(this);
        delButton.addActionListener(this);
        clrButton.addActionListener(this);

        // Setting button positions
        numberButtons[1].setBounds(50, 100, 100, 50);
        numberButtons[2].setBounds(150, 100, 100, 50);
        numberButtons[3].setBounds(250, 100, 100, 50);
        numberButtons[4].setBounds(50, 150, 100, 50);
        numberButtons[5].setBounds(150, 150, 100, 50);
        numberButtons[6].setBounds(250, 150, 100, 50);
        numberButtons[7].setBounds(50, 200, 100, 50);
        numberButtons[8].setBounds(150, 200, 100, 50);
        numberButtons[9].setBounds(250, 200, 100, 50);
        numberButtons[0].setBounds(150, 250, 100, 50);

        decButton.setBounds(50, 250, 100, 50);
        equButton.setBounds(250, 250, 100, 50);
        addButton.setBounds(50, 300, 100, 50);
        subButton.setBounds(150, 300, 100, 50);
        mulButton.setBounds(250, 300, 100, 50);
        divButton.setBounds(50, 350, 100, 50);
        delButton.setBounds(150, 350, 100, 50);
        clrButton.setBounds(250, 350, 100, 50);

        // Adding buttons to the frame
        frame.add(numberButtons[1]);
        frame.add(numberButtons[2]);
        frame.add(numberButtons[3]);
        frame.add(numberButtons[4]);
        frame.add(numberButtons[5]);
        frame.add(numberButtons[6]);
        frame.add(numberButtons[7]);
        frame.add(numberButtons[8]);
        frame.add(numberButtons[9]);
        frame.add(numberButtons[0]);
        frame.add(decButton);
        frame.add(equButton);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);
        frame.add(delButton);
        frame.add(clrButton);

        // Setting frame visible
        frame.setVisible(true);
    }

    // Defining the actionPerformed method
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }
        if (e.getSource() == decButton) {
            textField.setText(textField.getText() + ".");
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clrButton) {
            textField.setText("");
        }
        if (e.getSource() == delButton) {
            String temp = textField.getText();
            textField.setText(temp.substring(0, temp.length() - 1));
        }
    }

    // Main method
    public static void main(String[] args) {
        new Calculator();
    }
}
