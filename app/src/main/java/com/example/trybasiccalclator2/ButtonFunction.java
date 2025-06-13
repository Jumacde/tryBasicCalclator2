package com.example.trybasiccalclator2;

public interface ButtonFunction {
    void callOnNumberClick(CalculateLogic calculateLogic);
    void callOnOperatorCLick(Operators operators);
    void callOnEqualClick(Operators operators);
    void callOnACClick(TextDisplay textDisplay);
}
