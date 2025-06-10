package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.Calc;

public class Calc_impl implements Calc {
    private double cNum; // inputted current number
    private double sNum; // stored number
    private double result; // calculate result
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
    public double getResult() {
        return result;
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
    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void setIsInputNum(boolean isInputNum) {
        this.isInputNum = isInputNum;
    }

    @Override
    public void clear() {
        this.cNum = 0;
        this.sNum = 0;
        this.result = 0;
        this.isInputNum = true;
    }

    /**
     * - Wrapper method
     * allow to access other classes private method
     * @ Param: operator: +, -, *, /
     * **/
    @Override
    public void callCalcResult(String operator) {
        calcResult(operator);
    }

    /**
     * method: define calculate rule.
     * @ param: operator
     *  use the String operator from the class Operator_impl
     *  to avoid cross-reference issues
     * **/
    private double calcResult(String operator) {
        if (!operator.isEmpty()) {
            if (operator.equals("+")) {
                result = sNum + cNum;
            } else if (operator.equals("-")) {
                result = sNum - cNum;
            } else if (operator.equals("*")) {
                result = sNum * cNum;
            } else if (operator.equals("/")) {
                result = sNum / cNum;
            }
        }
        return result;
    };
}
