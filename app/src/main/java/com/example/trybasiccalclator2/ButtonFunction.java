package com.example.trybasiccalclator2;

public interface ButtonFunction {
    // wrap methods
    void callOnNumberClick(String digit);
    void callOnOperatorCLick(String op);
    void callOnEqualClick();
    void callOnACClick();
}
