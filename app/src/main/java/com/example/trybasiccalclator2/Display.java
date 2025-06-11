package com.example.trybasiccalclator2;

public interface Display {
    String getDisplay();
    void setDisplay();
    // wrap methods
    void callShowDisplay(Calc calc, Operator operator, int digit);
}
