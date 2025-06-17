package com.example.trybasiccalclator2;

import android.os.Bundle;
import android.view.View;
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
    //private Button pl, mi, mu, di, eq;
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

        textView = findViewById(R.id.text);

        // set up numbers buttons
        setUpNumberButton(R.id.b00, "00");
        setUpNumberButton(R.id.b0, "0");
        setUpNumberButton(R.id.b1, "1");
        setUpNumberButton(R.id.b2, "2");
        setUpNumberButton(R.id.b3, "3");
        setUpNumberButton(R.id.b4, "4");
        setUpNumberButton(R.id.b5, "5");
        setUpNumberButton(R.id.b6, "6");
        setUpNumberButton(R.id.b7, "7");
        setUpNumberButton(R.id.b8, "8");
        setUpNumberButton(R.id.b9, "9");

        // set up arithmetic operators buttons
        setUpOperatorButton(R.id.plass, "+");
        setUpOperatorButton(R.id.min, "-");
        setUpOperatorButton(R.id.mul, "*");
        setUpOperatorButton(R.id.div, "/");

        // set up equal button
        setUpEqualButton(R.id.equal);

        // set up AC(clear) button
        setUpACButton(R.id.ac);

    }

    // method: update display
    private void updateDisplay() {
        textView.setText(textDisplay.getDisplay());
    }


    private void setUpNumberButton(int bId, final String digit) {
        Button button = findViewById(bId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonFunction.callOnNumberClick(digit); // send the inputted integer
                updateDisplay(); // update display
            }
        });
    }

    private void setUpOperatorButton(int bId, final String op) {
        Button button = findViewById(bId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonFunction.callOnOperatorCLick(op); // send the inputted operator
                updateDisplay(); // update display
            }
        });
    }

    private void setUpEqualButton(int bId) {
        Button button = findViewById(bId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonFunction.callOnEqualClick();
                updateDisplay(); // update display
            }
        });
    }

    private void setUpACButton(int bId) {
        Button button = findViewById(bId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonFunction.callOnACClick();
                updateDisplay(); // update display
            }
        });
    }


}