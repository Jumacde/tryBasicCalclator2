package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.CalculateLogic;
import com.example.trybasiccalclator2.Operators;

public class CalculateLogic_impl implements CalculateLogic {
    private String currentNumber; // the inputted number could. ex) input 1 and 2 => 12
    private double storedNumber;
    private String calcStep;
    private double calcResult;
    private double cNum;
    private boolean isInputNum; // input state. true => allow input, false => reject input

    public CalculateLogic_impl() {
        this.currentNumber = "0";
        this.storedNumber = 0;
        this.calcStep = "";
        this.calcResult = 0;
        this.cNum = 0;
        this.isInputNum = true;
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
    public boolean getIsInputNum() {
        return isInputNum;
    }

    @Override
    public void setCurrentNumber(String currentNumber) {
        this.currentNumber = currentNumber;
        this.cNum = Double.parseDouble(currentNumber);
        this.isInputNum = true;
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

    @Override
    public void setIsInputNum(boolean isInputNum) {
        this.isInputNum = isInputNum;
    }

    /**
     * wrap method
     * @ Param: operators
     * - call the interface
     * */
    @Override
    public void callCalculate(Operators operators) {
        calculate(operators);
    }

    /**
     * method: calculate method
     * - to calculate and to show the calculate step
     * * @ Param: operators
     * * - call the interface
     */
    private void calculate(Operators operators) {
        String operator = operators.getOperator();
        if (operator.isEmpty()) {
            return;
        }
        // to show the calculate step on the display.
        calcStep = storedNumber + operator + cNum;

        if (operator.equals("+")) {
            calcResult = storedNumber + cNum;
        } else if (operator.equals("-")) {
            calcResult = storedNumber - cNum;
        } else if (operator.equals("*")) {
            calcResult = storedNumber * cNum;
        } else if (operator.equals("/")) { // if the denominator or numerator is 0 => 0
            if(cNum == 0 || storedNumber == 0) {
                calcResult = 0;
            } else {
                calcResult = storedNumber / cNum;
            }
        }
        this.isInputNum = false;
    }
}
