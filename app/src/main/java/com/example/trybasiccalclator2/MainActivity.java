package com.example.trybasiccalclator2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trybasiccalclator2.impl.ButtonFunction_impl;
import com.example.trybasiccalclator2.impl.CalculateLogic_impl;
import com.example.trybasiccalclator2.impl.Operators_impl;
import com.example.trybasiccalclator2.impl.TextDisplay_impl;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button pl, mi, mu, di, eq;
    private CalculateLogic calculateLogic;
    private Operators operators;
    private TextDisplay textDisplay;
    private ButtonFunction buttonFunction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        calculateLogic = new CalculateLogic_impl();
        operators = new Operators_impl();
        textDisplay = new TextDisplay_impl(calculateLogic, operators);
        buttonFunction = new ButtonFunction_impl(calculateLogic, operators, textDisplay);


    }



}