package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.Display;

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
    public void callShowDigit() {

    }

    private void showDigit() {}

}
