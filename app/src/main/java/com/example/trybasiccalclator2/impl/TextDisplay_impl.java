package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.CalculateLogic;
import com.example.trybasiccalclator2.Operators;
import com.example.trybasiccalclator2.TextDisplay;

public class TextDisplay_impl implements TextDisplay {
    private String display;
    private CalculateLogic calculateLogic;
    private Operators operators;

    public TextDisplay_impl(CalculateLogic calculateLogic,Operators operators) {
        calculateLogic = new CalculateLogic_impl();
        operators = new Operators_impl();

        displayClear(calculateLogic, operators);
    }


    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public void displayClear(CalculateLogic calculateLogic, Operators operators) {
        String currentNumber = calculateLogic.getCurrentNumber();
        double storedNumber = calculateLogic.getStoredNumber();
        String operator = operators.getOperator();

        currentNumber = "0";
        storedNumber = 0;
        operator = "";

        this.display = "0";
    }
}
