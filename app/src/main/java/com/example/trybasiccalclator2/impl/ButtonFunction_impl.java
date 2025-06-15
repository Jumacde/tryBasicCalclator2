package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.ButtonFunction;
import com.example.trybasiccalclator2.CalculateLogic;
import com.example.trybasiccalclator2.Operators;
import com.example.trybasiccalclator2.TextDisplay;

public class ButtonFunction_impl implements ButtonFunction {
    private final CalculateLogic calculateLogic;
    private final Operators operators;
    private final TextDisplay textDisplay;

    public ButtonFunction_impl (CalculateLogic calculateLogic, Operators operators, TextDisplay textDisplay) {
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
     *      String currentNumber:
     *  using
     ***/
    private void onNumberClick(String digit) {
        String currentNumber = calculateLogic.getCurrentNumber(); // every first input is "0". ex: input "1" -> "0"
        boolean isInputNum = calculateLogic.getIsInputNum(); // check whether the user input a number.
        // if the user don´t input a number or if the display shows the initialized number by "0".
        if(!isInputNum || currentNumber.equals("0")) {
            calculateLogic.setCurrentNumber(digit); // the currentNumber will be override. ex: 0 -> 5
        } else {
            calculateLogic.setCurrentNumber(currentNumber + digit); // if the user input another number further. ex: 51
        }
        calculateLogic.setIsInputNum(true); // allow the state "entering a number". ex: 9 after pressing 5.
        textDisplay.callShowingDisplay(); // update the display
    }

    /**
     * method: set input arithmetic operators
     * @ Param: String op
     * - this value works to set
     *  < about this method >
     *  using
     ***/
    private void onOperatorCLick(String op) {
        String operator = operators.getOperator();
        double result = calculateLogic.getCalcResult();
        calculateLogic.callCalculate(operators);
        calculateLogic.setStoredNumber(result); // the calculate result is stored in the value "storedNumber"
        operators.setOperator(op); // save the new operator.
        calculateLogic.setCurrentNumber("0");
        calculateLogic.setIsInputNum(false);
        textDisplay.callShowingDisplay(); // update the display.
    }

    /**
     * method: set input operator "="
     *  < about this method >
     *  using
     ***/
    private void onEqualClick() {
        double result = calculateLogic.getCalcResult(); // set to get the calculate result.
        calculateLogic.callCalculate(operators); // execute the calculate method.
        calculateLogic.setStoredNumber(result); // set the calculate result as the starting value for the next calculate
        operators.setOperator("=");
        calculateLogic.setIsInputNum(false); // set a next inputted number is a new input.
        textDisplay.callShowingDisplay(); // update the display.
    }

    // method: Ac button click => clear the display.
    private void onACClick() {
        textDisplay.displayClear(); // clear the display.
    }

}
