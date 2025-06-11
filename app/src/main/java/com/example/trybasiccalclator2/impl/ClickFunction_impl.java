package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.Calc;
import com.example.trybasiccalclator2.ClickFunction;
import com.example.trybasiccalclator2.Display;
import com.example.trybasiccalclator2.Operator;

public class ClickFunction_impl implements ClickFunction {

    public ClickFunction_impl() {}


    @Override
    public void callDigitClick(Calc calc, Operator operator, Display display) {
        digitClick(calc, operator, display);
    }

    private void digitClick(Calc calc, Operator operator, Display display) {

    };
}
