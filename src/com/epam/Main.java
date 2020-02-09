package com.epam;

import com.epam.Controller.CalculationController;
import com.epam.Model.*;
import com.epam.View.CalculatorView;

public class Main {

    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
         AdditionModel theAdditionModel = new AdditionModel();
        SubtractionModel theSubractionModel = new SubtractionModel();
        MultiplicationModel theMultiplicationModel = new MultiplicationModel();
         DivisionModel theDivisionModel = new DivisionModel();

        CalculationController theController = new CalculationController(theView,theAdditionModel,theSubractionModel,theMultiplicationModel,theDivisionModel);
        theView.setVisible(true);
    }

}
