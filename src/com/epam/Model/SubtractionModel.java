package com.epam.Model;

public class SubtractionModel implements CalculatorModel{
    double subtractionValue;
    @Override
    public void result(Double firstNumber, Double secondNumber) {
        subtractionValue = firstNumber-secondNumber;
    }

    public double getSubtractionValue() {
        return subtractionValue;
    }
}
