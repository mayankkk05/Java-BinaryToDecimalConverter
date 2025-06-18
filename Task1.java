import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BinaryToDecimal implements ActionListener{
    
    JFrame frame = new JFrame("Binary to Decimal Converter");
    JLabel instructionLabel = new JLabel("Enter a binary number:");
    JTextField input = new JTextField();
    JLabel resultLabel = new JLabel("Decimal Value: ");
    JButton convertButton = new JButton("Convert");

    BinaryToDecimal() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 1));

        convertButton.addActionListener(this);

        frame.add(instructionLabel);
        frame.add(input);
        frame.add(convertButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        String binaryStr = input.getText().trim();
        
        if (!binaryStr.matches("[01]+")) {
            resultLabel.setText("Invalid binary number!");
        } else {
            int decimal = Integer.parseInt(binaryStr, 2);
            resultLabel.setText("Decimal Value: " + decimal);
        }
    }
}

public class Task1{
    public static void main(String[] args) {
        new BinaryToDecimal();
    }
}
