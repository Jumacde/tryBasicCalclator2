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
     *      3. if the user input a new number after end the calculates, reset the display and all calculate steps.
     ***/
    private void onNumberClick(String digit) {
        String currentNumber = calculateLogic.getCurrentNumber();
        String operator = operators.getOperator();
        boolean isInputNum = calculateLogic.getIsInputNum();

        if (operator.equals("=")) { // if you input a number after calculate.
            textDisplay.clearDisplay(); // reset display
            calculateLogic.setCurrentNumber(digit); // set a new number
            calculateLogic.setIsInputNum(true); // input state allows
            operators.setOperator(""); // reset operators
        } else if (!operator.isEmpty() && !isInputNum) {
            calculateLogic.setCurrentNumber(digit);
            calculateLogic.setIsInputNum(true);
        } else if (currentNumber.equals("0")) {
            calculateLogic.setCurrentNumber(digit);
            calculateLogic.setIsInputNum(true);
        } else {
            calculateLogic.setCurrentNumber(currentNumber + digit);
            calculateLogic.setIsInputNum(true);
        }
        textDisplay.callShowingDisplay(); // update the display
    }

    /**
     * method: set input arithmetic operators
     * @ Param: String op
     * - this value works to set a inputted arithmetic operator.
     * - premise this methods: the user has been inputted a number and input a arithmetic operator.
     * < about this method >
     *     if the user inout a number, you can input a arithmetic operator(+, -, *, /).
     *     if you input a arithmetic operator after calculate, you can calculate still.
     *     ex: 1 + 1 = 2
     *     you input * and a number
     *     1 + 1 = 2 * 3
     ***/
    private void onOperatorCLick(String op) {
        String operator = operators.getOperator();
        double result = calculateLogic.getCalcResult();
        boolean isInputNum = calculateLogic.getIsInputNum();

        String currentNumber = calculateLogic.getCurrentNumber();
        double cNum = Double.parseDouble(currentNumber);

        if (isInputNum) {
            if (!operator.equals("=")) {
                calculateLogic.callCalculate(operators);
                calculateLogic.setStoredNumber(result);
            }
        } else {
            if (!currentNumber.equals("0")) {
                calculateLogic.setStoredNumber(cNum);
            }
        }

        operators.setOperator(op); // store a new arithmetic operator.
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
        String finalResult = String.valueOf(result);
        calculateLogic.setStoredNumber(result);
        operators.setOperator("=");
        calculateLogic.setIsInputNum(false);
        textDisplay.setDisplay(finalResult); // show only the calculate result on the display.
    }

    // method: Ac button click => clear the display.
    private void onACClick() {
        textDisplay.clearDisplay(); // clear the display.
    }

}
