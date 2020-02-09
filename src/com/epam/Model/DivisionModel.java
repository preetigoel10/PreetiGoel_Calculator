package com.epam.Model;

public class DivisionModel implements CalculatorModel {
    double divisionValue;
    @Override
    public void result(Double firstNumber, Double secondNumber) {
        divisionValue = firstNumber/secondNumber;
    }

    public double getDivisionValue() {
        return divisionValue;
    }
}
