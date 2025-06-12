package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.CalculateLogic;
import com.example.trybasiccalclator2.Operators;

public class CalculateLogic_impl implements CalculateLogic {
    private String currentNumber;
    private double storedNumber;
    private String calcStep;
    private double calcResult;
    private double cNum;

    public CalculateLogic_impl() {
        this.currentNumber = "0";
        this.storedNumber = 0;
        this.calcStep = "";
        this.calcResult = 0;
        this.cNum = 0;

    }

    @Override
    public String getCurrentNumber() {
        return currentNumber;
    }

    @Override
    public double getCNum() {
        return cNum;
    }

    @Override
    public double getStoredNumber() {
        return storedNumber;
    }

    @Override
    public String getCalcStep() {
        return calcStep;
    }

    @Override
    public double getCalcResult() {
        return calcResult;
    }

    @Override
    public void setCurrentNumber(String currentNumber) {
        this.currentNumber = currentNumber;

        try {
            cNum = Double.parseDouble(currentNumber);
        } catch (NumberFormatException nFe) {
            this.cNum = Double.NaN; // the result shows none.
            System.err.println("Invalid number format for currentNumber: " + currentNumber);
        }
    }

    @Override
    public void setCNum(double cNum) {
        this.cNum = cNum;
    }

    @Override
    public void setStoredNumber(double storedNumber) {
        this.storedNumber = storedNumber;
    }

    @Override
    public void setCalcStep(String calcStep) {
        this.calcStep = calcStep;
    }

    @Override
    public void setCalcResult(double calcResult) {
        this.calcResult = calcResult;
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
        if (Double.isNaN(cNum)) {
            calcResult = Double.NaN;
            return;
        }

        calcStep = storedNumber + operator + cNum; // to show the calculate step on the display.

        if (operator.equals("+")) {
            calcResult = storedNumber + cNum;
        } else if (operator.equals("-")) {
            calcResult = storedNumber - cNum;
        } else if (operator.equals("*")) {
            calcResult = storedNumber * cNum;
        } else if (operator.equals("/")) {
            calcResult = storedNumber / cNum;
        }
    }
}
