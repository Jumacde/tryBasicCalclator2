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
    public void callShowDisplay(Calc calc, Operator operator, int digit) {
        showDisplay(calc, operator, digit);
    }

    private void showDisplay(Calc calc, Operator operator, int digit) {
        String sOpe = operator.getSOpe();
        double sNum = calc.getSNum();
        double cNum = calc.getCNum();
        if (sOpe.isEmpty() && sNum != 0) { // if no operation is there
            display += sNum; // show the stored number
        } else if (sOpe.isEmpty() && cNum != 0) {
            display += cNum; // show the current number
        }

        // show the calc-step on the display
        String calcStep = calc.getCalcStep();
        if (!sOpe.isEmpty() && sNum != 0) {
            display += calcStep;
        }

        // show the calc-step on the display
        String result = String.valueOf(calc.getResult());
        if (!sOpe.isEmpty() && sOpe.equals("=")) {
            display += result;
        }
    }



}
