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

        displayClear();
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
    public void displayClear() {
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
    public void callShowingDisplay(CalculateLogic calculateLogic, Operators operators) {
        showingDisplay(calculateLogic, operators);
    }

    /**
     * method: define the showing calculate-step and -result on the display
     * @ param: calculateLogic, operators
     * - call variables from other classes via calling the interface classes.
     * */
    private void showingDisplay(CalculateLogic calculateLogic, Operators operators) {
        String currentNumber = calculateLogic.getCurrentNumber();
        double cNum = calculateLogic.getCNum();
        double storedNumber = calculateLogic.getStoredNumber();
        String operator = operators.getOperator();
        double result = calculateLogic.getCalcResult();
        String step = calculateLogic.getCalcStep();
        boolean isInputNum = calculateLogic.getIsInputNum(); // true

        if (!operator.equals("=")) { // 1.showing the inputted number and the calculate step
            if (isInputNum) {
                if (operator.isEmpty()) {

                }

            }

        }
    }


}
