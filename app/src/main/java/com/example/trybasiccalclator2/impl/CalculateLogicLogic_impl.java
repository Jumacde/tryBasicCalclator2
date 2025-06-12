package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.CalculateLogic;

public class CalculateLogicLogic_impl implements CalculateLogic {
    private double currentNumber;
    private double storedNumber;

    public CalculateLogicLogic_impl() {
        this.currentNumber = 0;
        this.storedNumber = 0;

    }

    @Override
    public double getCurrentNumber() {
        return currentNumber;
    }

    @Override
    public double getStoredNumber() {
        return storedNumber;
    }

    @Override
    public void setCurrentNumber(double currentNumber) {
        this.currentNumber = currentNumber;
    }

    @Override
    public void setStoredNumber(double storedNumber) {
        this.storedNumber = storedNumber;
    }
}
