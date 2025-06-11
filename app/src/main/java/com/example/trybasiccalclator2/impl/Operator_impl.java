package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.Operator;

public class Operator_impl implements Operator {
    private String operator;
    private String sOpe; // stored operator

    public Operator_impl() {}

    @Override
    public String getOperator() {
        return operator;
    }

    @Override
    public String getSOpe() {
        return sOpe;
    }

    @Override
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public void setSOpe(String sOpe) {
        this.sOpe = sOpe;
    }
}
