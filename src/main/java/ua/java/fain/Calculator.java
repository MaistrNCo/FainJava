package ua.java.fain;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
/**
 * Created by Maistrenko on 09.01.2017.
 */
public class Calculator {
    //Declaration of all calc components
    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JPanel p1;

    Calculator(){
      //new panel (global)
        windowContent = new JPanel();

      //set layout manager ti this panel
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

      //create the display field & place it in the north of the window
        displayField = new JTextField(30);
        windowContent.add("North",displayField);

      //create buttons
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

      // create penel with the gridLayout that will contain buttons
        p1 = new JPanel(new GridLayout(4,3,2,2));
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

      //add the pael p1 to center area of the window
        windowContent.add("Center",p1);
      // create the frame & set its content
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
      //set size of the window to be big enough to accomodate all controls
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

}
