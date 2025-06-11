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

    private void showDigit(Calc calc, Operator operator, int digit) {

    }

}
