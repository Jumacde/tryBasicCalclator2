package com.example.trybasiccalclator2;

public interface TextDisplay {
    String getDisplay();
    void setDisplay(String display);

    void displayClear(); // clear the display
    void callShowingDisplay(); // wrap method
}
