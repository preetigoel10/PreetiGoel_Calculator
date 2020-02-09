package com.epam.Controller;

import com.epam.Model.*;
import com.epam.View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationController {
    private CalculatorView theView;
    private AdditionModel theAdditionModel;
    private SubtractionModel theSubractionModel;
    private MultiplicationModel theMultiplicationModel;
    private DivisionModel theDivisionModel;
    private String s0, s1, s2;
    private double result;


    public CalculationController(CalculatorView theView, AdditionModel theAdditionModel, SubtractionModel theSubractionModel, MultiplicationModel theMultiplicationModel, DivisionModel theDivisionModel) {
        this.theView = theView;
        this.theAdditionModel = theAdditionModel;
        this.theSubractionModel = theSubractionModel;
        this.theMultiplicationModel = theMultiplicationModel;
        this.theDivisionModel = theDivisionModel;
        s0 = "";
        s1 = "";
        s2 = "";
        this.theView.addCalculationListener(new CalculateListener());
    }
    void calculateResult(){
       if (s1.equals("+")) {
            theAdditionModel.result(Double.parseDouble(s0), Double.parseDouble(s2));
            result = theAdditionModel.getAdditionValue();
        } else if (s1.equals("-")) {
            theSubractionModel.result(Double.parseDouble(s0), Double.parseDouble(s2));
            result = theSubractionModel.getSubtractionValue();
        } else if (s1.equals("/")) {
            theDivisionModel.result(Double.parseDouble(s0), Double.parseDouble(s2));
            result = theDivisionModel.getDivisionValue();
        } else {
            theMultiplicationModel.result(Double.parseDouble(s0), Double.parseDouble(s2));
            result = theMultiplicationModel.getMultiplicationValue();
        }
    }


    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String s = arg0.getActionCommand();
            if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                if (!s1.equals(""))
                    s2 = s2 + s;
                else
                    s0 = s0 + s;

                theView.setCalculationSolution(s0 + s1 + s2);
            } else if (s.charAt(0) == 'C') {
                s0 = s1 = s2 = "";
                theView.setCalculationSolution(s0 + s1 + s2);
            } else if (s.charAt(0) == '=') {
                calculateResult();

                theView.setCalculationSolution(s0 + s1 + s2 + "=" + result);
                s0 = Double.toString(result);

                s1 = s2 = "";
            } else {
                if (s1.equals("") || s2.equals(""))
                    s1 = s;
                else{
                    calculateResult();
                    s0 = Double.toString(result);
                    s1 = s;
                    s2 = "";
                }
                theView.setCalculationSolution(s0 + s1 + s2);
            }
        }
    }
}
