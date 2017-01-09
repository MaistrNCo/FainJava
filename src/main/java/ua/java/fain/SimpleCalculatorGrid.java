package ua.java.fain;

import javax.swing.*;
import java.awt.GridLayout;
/**
 * Created by Maistrenko on 09.01.2017.
 */
public class SimpleCalculatorGrid {
    public static void main(String[] args) {
        //Create panel
        JPanel windowContent = new JPanel();
        //layout manager for this panel
        GridLayout gl = new GridLayout(4,2);
        windowContent.setLayout(gl);

        //controls in memory
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        //add controls to the panel
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);
        //create the frame and add the panel to it
        JFrame frame = new JFrame("My first calculator");
        frame.setContentPane(windowContent);

        frame.setSize(400,100);
        frame.setVisible(true);
    }
}
