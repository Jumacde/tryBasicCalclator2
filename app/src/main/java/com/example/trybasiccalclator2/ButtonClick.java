package com.example.trybasiccalclator2;

public interface ButtonClick {
    // wrap methods
    void callOnNumberClick(String digit);
    void callOnOperatorCLick(String op);
    void callOnEqualClick();
    void callOnACClick();
}
