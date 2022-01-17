package com.geekbrains;

import javax.swing.*;

public class Calculator extends JFrame {
    public Calculator() {
        setBounds(100, 100, 265, 350);
        setTitle("Калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new CalcPanel());
        setVisible(true);
    }

    public double calc(double n1, String operator, double n2) {
        double result = 0;
        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1*n2;
                break;
            case "/":
                result = n1/n2;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
