package com.epam.Model;

public class AdditionModel implements CalculatorModel{
    double additionValue;
    @Override
    public void result(Double firstNumber,Double secondNumber){
        additionValue = firstNumber+secondNumber;
    }
    public double getAdditionValue(){
        return additionValue;
    }
}
