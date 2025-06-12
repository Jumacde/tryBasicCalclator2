package com.example.trybasiccalclator2;

public interface CalculateLogic {
    String getCurrentNumber();
    double getCNum();
    double getStoredNumber();
    String getCalcStep();
    double getCalcResult();

    void setCurrentNumber(String currentNumber);
    void setCNum(double cNum);
    void setStoredNumber(double storedNumber);
    void setCalcStep(String calcStep);
    void setCalcResult(double calcResult);

    void callCalcStep(Operators operators); // wrap method
}
