package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.Calc;
import com.example.trybasiccalclator2.Display;
import com.example.trybasiccalclator2.Operator;

public class Display_impl implements Display {
    private String display;

    public Display_impl() {
        this.display = "0";
    }

    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void setDisplay() {
        this.display = display;
    }

    // wrap method
    @Override
    public void callShowDigit(Calc calc, Operator operator, int digit) {
        showDigit(calc, operator, digit);
    }

    // wrap method
    @Override
    public void callShowCalcStep(Calc calc, Operator operator) {
        ShowCalcStep(calc, operator);
    }

    private void showDigit(Calc calc, Operator operator, int digit) {
        String sOpe = operator.getSOpe();
        if (sOpe.isEmpty()) {
            return;
        }
        String calcStep = calc.getCalcStep();

        if (!sOpe.isEmpty()) {
            if (display.equals(calcStep)) {
                display += String.valueOf(digit);
            } else if (display.endsWith("+")
                    || display.endsWith("-")
                    || display.endsWith("*")
                    || display.endsWith("/")) {
                display += digit;
            }
        }
    }

    private void ShowCalcStep(Calc calc, Operator operator) {

    }

}
