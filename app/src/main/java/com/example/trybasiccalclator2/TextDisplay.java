package com.example.trybasiccalclator2;

public interface TextDisplay {
    String getDisplay();
    void setDisplay(String display);

    void displayClear(CalculateLogic calculateLogic, Operators operators);
}
