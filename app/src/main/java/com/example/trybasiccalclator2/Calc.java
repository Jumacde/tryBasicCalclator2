package com.example.trybasiccalclator2;

public interface Calc {
    double getCNum();
    double getSNum();
    boolean getIsInputNum();

    void setCNum(double cNum);
    void setSNum(double sNum);
    void setIsInputNum(boolean isInputNum);

    void clear();
}
