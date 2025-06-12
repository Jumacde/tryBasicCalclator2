package com.example.trybasiccalclator2;

public interface CalculateLogic {
    String getCurrentNumber();
    double getStoredNumber();
    void setCurrentNumber(String currentNumber);
    void setStoredNumber(double storedNumber);
    void callCalcStep(Operators operators); // wrap method
}
