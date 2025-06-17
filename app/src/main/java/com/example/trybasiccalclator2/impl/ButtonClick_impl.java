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
     * - this value works to set a inputted arithmetic operator.
     * - premise this methods: the user has been inputted a number and input a arithmetic operator.
     * < about this method >
     *     1. calculate the stored number(first the storedNumber is "0", so the currentNumber is used.)
     *          calculateLogic.callCalculate(operators);
     *              ex: storedNumber(0) + cNum(5)
     *              => calcStep = 0 + 5, calcResult = 5
     *     2. the calculate result is stored in StoredNumber.
     *          calculateLogic.setStoredNumber(result);
     *     3. next inputted arithmetic operator is stored in the setter.
     *          operators.setOperator(op);
     *     4. in oder to start to input next number, reset "currentNumber"
     *          calculateLogic.setCurrentNumber("0");
     *     5. set the state "not entering a number"
     *          calculateLogic.setIsInputNum(false);
     *     6. update the display.
     *          textDisplay.callShowingDisplay();
     ***/
    private void onOperatorCLick(String op) {
        String operator = operators.getOperator();
        double result = calculateLogic.getCalcResult();
        boolean isInputNum = calculateLogic.getIsInputNum();

        String currentNumber = calculateLogic.getCurrentNumber();
        double cNum = Double.parseDouble(currentNumber);
        double storedNumber = calculateLogic.getStoredNumber();
        String sNum = String.valueOf(storedNumber);

        if (!operator.isEmpty() && (currentNumber.isEmpty() || sNum.isEmpty())) { // if the user input nothing


        }

        textDisplay.callShowingDisplay(); // update the display.
    }

    /**
     * method: set input operator "="
     *  < about this method >
     *  if the user enter "=", show the calculate result.
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
