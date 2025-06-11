package com.example.trybasiccalclator2;

public interface ClickFunction {
    // wrap methods
    void callDigitClick(Calc calc, Operator operator, Display display, int digit);
    void callOperatorClick(Calc calc, Operator operator, Display display);

}
