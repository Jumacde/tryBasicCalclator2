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

    private void onNumberClick(String digit) {
        String currentNumber = calculateLogic.getCurrentNumber();
        boolean isInputNum = calculateLogic.getIsInputNum();
        // if the user can´t input any number or if the display shows the initialized number by "0">
        if(!isInputNum || currentNumber.equals("0")) {
            calculateLogic.setCurrentNumber(digit);
        } else {
            calculateLogic.setCurrentNumber(currentNumber + digit);
        }
        calculateLogic.setIsInputNum(true);
        textDisplay.callShowingDisplay();

    }

    private void onOperatorCLick(String op) {

    }

    private void onEqualClick() {

    }

    private void onACClick() {

    }

}
