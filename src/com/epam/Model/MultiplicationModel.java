package com.epam.Model;

public class MultiplicationModel implements CalculatorModel {
    double multiplicationValue;
    @Override
    public void result(Double firstNumber, Double secondNumber){
        multiplicationValue = firstNumber*secondNumber;
    }

    public double getMultiplicationValue() {
        return multiplicationValue;
    }
}
