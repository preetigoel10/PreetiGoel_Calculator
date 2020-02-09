package com.epam.View;

import com.epam.Controller.CalculationController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {

    private JTextField calculationSolution = new JTextField(10);
    private JButton b0 = new JButton("0");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");

    private JButton button_equal = new JButton("=");


    private JButton button_add = new JButton("+");
    private JButton button_sub = new JButton("-");
    private JButton button_divide = new JButton("/");
    private JButton button_multiply = new JButton("*");
    private JButton beq = new JButton("C");

    private JButton button_dot = new JButton(".");

    JPanel addToPanel(JPanel calculatorPanel) {
        calculatorPanel.add(calculationSolution);
        calculatorPanel.add(button_add);
        calculatorPanel.add(b1);
        calculatorPanel.add(b2);
        calculatorPanel.add(b3);
        calculatorPanel.add(button_sub);
        calculatorPanel.add(b4);
        calculatorPanel.add(b5);
        calculatorPanel.add(b6);
        calculatorPanel.add(button_multiply);
        calculatorPanel.add(b7);
        calculatorPanel.add(b8);
        calculatorPanel.add(b9);
        calculatorPanel.add(button_divide);

        calculatorPanel.add(button_dot);
        calculatorPanel.add(b0);

        calculatorPanel.add(beq);
        calculatorPanel.add(button_equal);

        calculatorPanel.setBackground(Color.blue);
        return calculatorPanel;
    }

    public CalculatorView() {
        JPanel calculatorPanel = addToPanel(new JPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(215, 235);
        setCalculationSolution("");
        this.add(calculatorPanel);
    }
    public void setCalculationSolution(String solution) {
        calculationSolution.setText(solution);
    }

    public void addCalculationListener(ActionListener calculationController) {
        button_add.addActionListener(calculationController);
        button_multiply.addActionListener(calculationController);
        button_divide.addActionListener(calculationController);
        button_sub.addActionListener(calculationController);
        button_dot.addActionListener(calculationController);
        button_equal.addActionListener(calculationController);
        b0.addActionListener(calculationController);
        b1.addActionListener(calculationController);
        b2.addActionListener(calculationController);
        b3.addActionListener(calculationController);
        b4.addActionListener(calculationController);
        b5.addActionListener(calculationController);
        b6.addActionListener(calculationController);
        b7.addActionListener(calculationController);
        b8.addActionListener(calculationController);
        b9.addActionListener(calculationController);
        beq.addActionListener(calculationController);
    }
}
