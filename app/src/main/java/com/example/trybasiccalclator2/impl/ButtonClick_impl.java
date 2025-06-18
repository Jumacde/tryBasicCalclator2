package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.ButtonClick;
import com.example.trybasiccalclator2.CalculateLogic;
import com.example.trybasiccalclator2.Operators;
import com.example.trybasiccalclator2.TextDisplay;

public class ButtonClick_impl implements ButtonClick {
    private final CalculateLogic calculateLogic;
    private final Operators operators;
    private final TextDisplay textDisplay;

    public ButtonClick_impl(CalculateLogic calculateLogic, Operators operators, TextDisplay textDisplay) {
        this.calculateLogic = calculateLogic;
        this.operators = operators;
        this.textDisplay = textDisplay;
    }

    /**
     * wrap method
     * @ Param: calculateLogic
     * - call the interface
     * */
    @Override
    public void callOnNumberClick(String digit) {
        onNumberClick(digit);
    }

    /**
     * wrap method
     * @ Param: operators
     * - call the interface
     * */
    @Override
    public void callOnOperatorCLick(String op) {
        onOperatorCLick(op);
    }

    /**
     * wrap method
     * @ Param: operators
     * - call the interface
     * */
    @Override
    public void callOnEqualClick() {
        onEqualClick();
    }

    /**
     * wrap method
     * @ Param: textDisplay
     * - call the interface
     * */
    @Override
    public void callOnACClick() {
        onACClick();
    }

    /**
     * method: set input number
     * @ Param: String digit
     * - this value works to set a additional digit
     *  < about this method >
     *      input a number
     *      1. if the user input no number still.
     *      2. or if the user input a number after a arithmetic operator.(before input "=").
     ***/
    private void onNumberClick(String digit) {
        String currentNumber = calculateLogic.getCurrentNumber();
        String operator = operators.getOperator();
        boolean isInputNum = calculateLogic.getIsInputNum();

        if (!isInputNum || currentNumber.equals("0") || !operator.isEmpty()) {
            calculateLogic.setCurrentNumber(digit);
            if (!isInputNum || currentNumber.equals("0")) {
                calculateLogic.setIsInputNum(true);
            }
        } else {
            calculateLogic.setCurrentNumber(currentNumber + digit);
        }
        textDisplay.callShowingDisplay(); // update the display
    }

    /**
     * method: set input arithmetic operators
     * @ Param: String op
     * - this value works to set a inputted arithmetic operator.
     * - premise this methods: the user has been inputted a number and input a arithmetic operator.
     * < about this method >
     ***/
    private void onOperatorCLick(String op) {
        String operator = operators.getOperator();
        double result = calculateLogic.getCalcResult();
        boolean isInputNum = calculateLogic.getIsInputNum();

        String currentNumber = calculateLogic.getCurrentNumber();
        double cNum = Double.parseDouble(currentNumber);
        double storedNumber = calculateLogic.getStoredNumber();
        String sNum = String.valueOf(storedNumber);

        if (!operator.isEmpty() && isInputNum) {
            calculateLogic.callCalculate(operators);
            calculateLogic.setStoredNumber(result);
        } else {
            calculateLogic.setStoredNumber(cNum);
        }
        operators.setOperator(op);
        calculateLogic.setCurrentNumber("0");
        calculateLogic.setIsInputNum(false);
        textDisplay.callShowingDisplay(); // update the display.
    }

    /**
     * method: set input operator "="
     *  < about this method >
     *  if the user enter "=", show the calculate result.
     ***/
    private void onEqualClick() {
        calculateLogic.callCalculate(operators);
        double result = calculateLogic.getCalcResult();
        calculateLogic.setStoredNumber(result);
        operators.setOperator("=");
        calculateLogic.setIsInputNum(false);

        textDisplay.callShowingDisplay(); // update the display.
    }

    // method: Ac button click => clear the display.
    private void onACClick() {
        textDisplay.displayClear(); // clear the display.
    }

}
