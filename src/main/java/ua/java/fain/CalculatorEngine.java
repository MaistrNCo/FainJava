package ua.java.fain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by maistrenko on 17.01.2017.
 */
public class CalculatorEngine implements ActionListener {
    Calculator parent;
    char selectedAction = ' ';
    double currentResult = 0;
    CalculatorEngine(Calculator parent){
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e) {
        JButton clckBtn = (JButton) e.getSource();
        String dispFieldText = parent.displayFieldFormated.getText();
        double displayValue = 0;
        if (!dispFieldText.equals("")){
            displayValue = Double.parseDouble(dispFieldText);
        }

        Object src = e.getSource();

        if(src==parent.buttonDiv){
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayFieldFormated.setText("");
        }else if (src==parent.buttonMin) {
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayFieldFormated.setText("");
        }else if (src==parent.buttonMult) {
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayFieldFormated.setText("");
        }else if (src==parent.buttonPls) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayFieldFormated.setText("");
        }else if(src==parent.buttonEqual){
                if (selectedAction=='+'){
                    currentResult +=displayValue;
                }else if(selectedAction=='-'){
                    currentResult -=displayValue;
                }else if(selectedAction=='*'){
                    currentResult *=displayValue;
                }else if(selectedAction=='/'){
                    currentResult /=displayValue;
                }
            parent.displayFieldFormated.setText(""+currentResult);
        } else {
            String clickedBtn = clckBtn.getText();
            parent.displayFieldFormated.setText(dispFieldText+clickedBtn);
        }


    }
}
