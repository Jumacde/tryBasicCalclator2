package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.CalculateLogic;
import com.example.trybasiccalclator2.Operators;
import com.example.trybasiccalclator2.TextDisplay;

public class TextDisplay_impl implements TextDisplay {
    private String display;
    private final CalculateLogic calculateLogic;
    private final Operators operators;

    public TextDisplay_impl(CalculateLogic calculateLogic,Operators operators) {
        this.calculateLogic = calculateLogic;
        this.operators = operators;
        clearDisplay(); // initialize showing the displays using this method.
    }

    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void setDisplay(String display) {
        this.display = display;
    }

    // method: clear display
    @Override
    public void clearDisplay() {
        this.display = "0";
        this.calculateLogic.setCurrentNumber("0");
        this.calculateLogic.setCNum(0);
        this.calculateLogic.setStoredNumber(0);
        this.calculateLogic.setCalcResult(0);
        this.calculateLogic.setCalcStep("");
        this.operators.setOperator("");
    }

    /**
     * wrap method
     * @ param: calculateLogic, operators
     * - call variables from other classes via calling the interface classes.
     * */
    @Override
    public void callShowingDisplay() {
        showingDisplay();
    }

    /**
     * method: define the showing calculate-step and -result on the display
     * @ param: calculateLogic, operators
     * - call variables from other classes via calling the interface classes.
     * 1. if the user input "=", shows the display you the calculate result.
     * 2. if the user input a arithmetic operator(+, -, *, /) or only a number, shows you the calculate step.
     * */
    private void showingDisplay() {
        String currentNumber = calculateLogic.getCurrentNumber();
        //double cNum = calculateLogic.getCNum();
        double storedNumber = calculateLogic.getStoredNumber();
        String operator = operators.getOperator();
        double result = calculateLogic.getCalcResult(); // ex: calcResult = storedNumber + cNum;
        String step = calculateLogic.getCalcStep(); // calcStep = storedNumber + operator + cNum;
        boolean isInputNum = calculateLogic.getIsInputNum(); // true

        if (operator.equals("=")) { // if the user enter "=", shows the calculate result on the display.
            display = String.valueOf(result); // showing the inputted number and the calculate step
        } else if (!operator.isEmpty() && !isInputNum) { // if only a arithmetic operator is there.
            display = formatNumber(storedNumber) + operator;
        } else if (!operator.isEmpty() && isInputNum) { // if the user inputted only a number.
            display = formatNumber(storedNumber) + operator + currentNumber;
        } else {
            display = currentNumber;
        }
    }

    /**
     * - method: float number format to a integer
     * @ param: double num
     * - set each number(storedNumber)
     * **/
    private String formatNumber(double num) {
        if (num == (long) num) {
            return String.format("%d", (long) num);
        } else {
            return String.format("%s", num);
        }
    }

}
