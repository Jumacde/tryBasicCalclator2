package com.example.trybasiccalclator2;

public interface Calc {
    double getCNum();
    double getSNum();
    double getResult();
    boolean getIsInputNum();

    void setCNum(double cNum);
    void setSNum(double sNum);
    void setResult(double result);
    void setIsInputNum(boolean isInputNum);

    void clear();
    // wrap method
    void callCalcResult(String operator);
}
