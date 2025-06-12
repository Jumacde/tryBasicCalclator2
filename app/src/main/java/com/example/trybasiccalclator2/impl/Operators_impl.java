package com.example.trybasiccalclator2.impl;

import com.example.trybasiccalclator2.Operators;

public class Operators_impl implements Operators {
    String operator;
    public Operators_impl() {
        this.operator = "";
    }

    @Override
    public String getOperator() {
        return operator;
    }

    @Override
    public void setOperator(String operator) {
        this.operator = operator;
    }
}
