package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.CalculateLogic;
import com.example.trybasiccalclator2.Operators;

public class CalculateLogic_impl implements CalculateLogic {
    private String currentNumber;
    private double storedNumber;

    public CalculateLogic_impl() {
        this.currentNumber = "0";
        this.storedNumber = 0;

    }

    @Override
    public String getCurrentNumber() {
        return currentNumber;
    }

    @Override
    public double getStoredNumber() {
        return storedNumber;
    }

    @Override
    public void setCurrentNumber(String currentNumber) {
        this.currentNumber = currentNumber;
    }

    @Override
    public void setStoredNumber(double storedNumber) {
        this.storedNumber = storedNumber;
    }

    /**
     * wrap method
     * @ Param: operators
     * - call the interface
     * */
    @Override
    public void callCalcStep(Operators operators) {
        calcStep(operators);
    }

    /**
     * method: calculate method
     * - to calculate and to show the calculate step
     * * @ Param: operators
     * * - call the interface
     */
    private void calcStep(Operators operators) {
        String operator = operators.getOperator();
        if (operator.isEmpty()) {
            return;
        }
        double result;
        String step;
        double cNum = 0;
        try {
            cNum = Double.parseDouble(currentNumber);
        } catch (NumberFormatException nFe) {
            System.err.println("Invalid number format for currentNumber: " + currentNumber);
            result = Double.NaN; // the result shows none.
            return;
        }
        step = storedNumber + operator + cNum; // to show the calculate step on the display.

        if (operator.equals("+")) {
            result = storedNumber + cNum;
        } else if (operator.equals("-")) {
            result = storedNumber - cNum;
        } else if (operator.equals("*")) {
            result = storedNumber * cNum;
        } else if (operator.equals("/")) {
            result = storedNumber / cNum;
        }
    }
}
