package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.Calc;
import com.example.trybasiccalclator2.ClickFunction;
import com.example.trybasiccalclator2.Display;
import com.example.trybasiccalclator2.Operator;

public class ClickFunction_impl implements ClickFunction {

    public ClickFunction_impl() {}


    @Override
    public void callDigitClick(Calc calc, Operator operator, Display display, int digit) {
        digitClick(calc, operator, display, digit);
    }

    @Override
    public void operatorClick(Calc calc, Operator operator, Display display) {
        operatorClick(calc, operator, display);
    }

    private void digitClick(Calc calc, Operator operator, Display display, int digit) {
        boolean isInputNum = calc.getIsInputNum();
        double cNum = calc.getCNum();
        if (isInputNum) {
            calc.setSNum(digit);
            calc.setIsInputNum(false);
            display.callShowDisplay(calc, operator, digit);
        } else {
            calc.setCNum(cNum * 10 + digit);
            display.callShowDisplay(calc, operator, digit);
        }
    }

    private void operatorClick(Calc calc, Operator operator, Display display) {
        String op = operator.getSOpe();
        if (op.equals("=")) {
            String x;
            x =
        }

    }

}
