package ua.java.fain;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Maistrenko on 09.01.2017.
 */
public class Calculator {
    //Declaration of all calc components
    JPanel windowContent;
    JTextField displayField;
    JFormattedTextField displayFieldFormated;

    JButton buttons[];

    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPls;
    JButton buttonMin;
    JButton buttonDiv;
    JButton buttonMult;


    JPanel p1;
    JPanel p2;

    Calculator(){
      //new panel (global)
        windowContent = new JPanel();

      //set layout manager ti this panel
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
      //create the display field & place it in the north of the window
        displayField = new JTextField(30);

        displayFieldFormated = new JFormattedTextField();
        displayFieldFormated.setColumns(30);
        displayFieldFormated.setHorizontalAlignment(JTextField.RIGHT);

        windowContent.add("North",displayFieldFormated);

        CalculatorEngine calcEngine = new CalculatorEngine(this);
        //create buttons
        buttons = new JButton[10];
        for (int index = 0; index < buttons.length; index++) {
            buttons[index] = new JButton(Integer.toString(index));
            buttons[index].addActionListener(calcEngine);
        }

        buttonPoint = new JButton(".");
        buttonPoint.addActionListener(calcEngine);
        buttonEqual = new JButton("=");
        buttonEqual.addActionListener(calcEngine);
        buttonPls = new JButton("+");
        buttonPls.addActionListener(calcEngine);
        buttonMin = new JButton("-");
        buttonMin.addActionListener(calcEngine);
        buttonDiv = new JButton("/");
        buttonDiv.addActionListener(calcEngine);
        buttonMult = new JButton("*");
        buttonMult.addActionListener(calcEngine);



      // create penel with the gridLayout that will contain buttons
        p1 = new JPanel(new GridLayout(4,3,2,2));
        for (int index = 1; index <= buttons.length ; index++) {
            p1.add(index==10?buttons[0]:buttons[index]);
          //  index==10 ? p1.add(buttons[0]) : p1.add(buttons[index]);
        }

        p1.add(buttonPoint);
        p1.add(buttonEqual);

      //add the pael p1 to center area of the window
        windowContent.add("Center",p1);

        p2 = new JPanel(new GridLayout(4,1,2,2));
        p2.add(buttonPls);
        p2.add(buttonMin);
        p2.add(buttonDiv);
        p2.add(buttonMult);

        windowContent.add("East",p2);

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
