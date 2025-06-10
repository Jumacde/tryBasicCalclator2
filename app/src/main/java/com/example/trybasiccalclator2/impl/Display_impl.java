package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.Display;

public class Display_impl implements Display {
    private String display;
    private String calcStep;

    public Display_impl() {
        this.display = "0";
        this.calcStep = "0";
    }

    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public String getCalcStep() {
        return calcStep;
    }

    @Override
    public void setDisplay() {
        this.display = display;
    }

    @Override
    public void setCalcStep() {
        this.calcStep = calcStep;
    }

}
