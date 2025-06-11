package com.example.trybasiccalclator2;

public interface Display {
    String getDisplay();
    void setDisplay();
    // wrap methods
    void callShowDigit(double cNum, double sNum, String operator, int digit); // wrap method

}
