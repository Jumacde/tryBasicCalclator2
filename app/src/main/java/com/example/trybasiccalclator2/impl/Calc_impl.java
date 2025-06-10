package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.Calc;

public class Calc_impl implements Calc {
    private double cNum; // inputted current number
    private double sNum; // stored number
    private boolean isInputNum;

    public Calc_impl() {
        clear();
    }

    @Override
    public double getCNum() {
        return cNum;
    }

    @Override
    public double getSNum() {
        return sNum;
    }

    @Override
    public boolean getIsInputNum() {
        return isInputNum;
    }

    @Override
    public void setCNum(double cNum) {
        this.cNum = cNum;
    }

    @Override
    public void setSNum(double sNum) {
        this.sNum = sNum;
    }

    @Override
    public void setIsInputNum(boolean isInputNum) {
        this.isInputNum = isInputNum;
    }

    @Override
    public void clear() {
        this.cNum = 0;
        this.sNum = 0;
        this.isInputNum = true;
    }
}
