package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.ButtonFunction;
import com.example.trybasiccalclator2.CalculateLogic;
import com.example.trybasiccalclator2.Operators;
import com.example.trybasiccalclator2.TextDisplay;

public class ButtonFunction_impl implements ButtonFunction {

    public ButtonFunction_impl () {

    }

    /**
     * wrap method
     * @ Param: calculateLogic
     * - call the interface
     * */
    @Override
    public void callOnNumberClick(CalculateLogic calculateLogic) {
        onNumberClick(calculateLogic);
    }

    /**
     * wrap method
     * @ Param: operators
     * - call the interface
     * */
    @Override
    public void callOnOperatorCLick(Operators operators) {
        onOperatorCLick(operators);
    }

    /**
     * wrap method
     * @ Param: operators
     * - call the interface
     * */
    @Override
    public void callOnEqualClick(Operators operators) {
        onEqualClick(operators);
    }

    /**
     * wrap method
     * @ Param: textDisplay
     * - call the interface
     * */
    @Override
    public void callOnACClick(TextDisplay textDisplay) {
        onACClick(textDisplay);
    }

    private void onNumberClick(CalculateLogic calculateLogic) {

    }

    private void onOperatorCLick(Operators operators) {

    }

    private void onEqualClick(Operators operators) {

    }

    private void onACClick(TextDisplay textDisplay) {

    }

}
