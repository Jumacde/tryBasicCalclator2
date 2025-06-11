package com.example.trybasiccalclator2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.trybasiccalclator2.impl.Calc_impl;
import com.example.trybasiccalclator2.impl.ClickFunction_impl;
import com.example.trybasiccalclator2.impl.Display_impl;
import com.example.trybasiccalclator2.impl.Operator_impl;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button pl, mi, mu, di, eq;

    private Calc calc;
    private Operator operator;
    private Display display;
    private ClickFunction clickFunction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        calc = new Calc_impl();
        operator = new Operator_impl();
        display = new Display_impl();
        clickFunction = new ClickFunction_impl();

        textView = findViewById(R.id.text);
        pl = findViewById(R.id.plass);
        mi = findViewById(R.id.min);
        mu = findViewById(R.id.mul);
        di = findViewById(R.id.div);
        eq = findViewById(R.id.equal);

        updateDisplay();

        pl.setOnClickListener(v -> clickFunction.operatorClick(calc, display, operator, "+"));
        mi.setOnClickListener(v -> clickFunction.operatorClick(calc, display, operator, "-"));
        mu.setOnClickListener(v -> clickFunction.operatorClick(calc, display, operator, "*"));
        di.setOnClickListener(v -> clickFunction.operatorClick(calc, display, operator, "/"));
        eq.setOnClickListener(v -> clickFunction.operatorClick(calc, display, operator, "="));


    }

    public void press00(View view) {
        clickFunction.callDigitClick(calc, display, operator, 0);
        clickFunction.callDigitClick(calc, display, operator, 0);
        updateDisplay();
    }

    public void press0(View view) {
        clickFunction.callDigitClick(calc, display, operator, 0);
        updateDisplay();
    }

    public void press1(View view) {
        clickFunction.callDigitClick(calc, display, operator, 1);
        updateDisplay();
    }

    public void press2(View view) {
        clickFunction.callDigitClick(calc, display, operator, 2);
        updateDisplay();
    }

    public void press3(View view) {
        clickFunction.callDigitClick(calc, display, operator, 3);
        updateDisplay();
    }

    public void press4(View view) {
        clickFunction.callDigitClick(calc, display, operator, 4);
        updateDisplay();
    }

    public void press5(View view) {
        clickFunction.callDigitClick(calc, display, operator, 5);
        updateDisplay();
    }

    public void press6(View view) {
        clickFunction.callDigitClick(calc, display, operator, 6);
        updateDisplay();
    }

    public void press7(View view) {
        clickFunction.callDigitClick(calc, display, operator, 7);
        updateDisplay();
    }

    public void press8(View view) {
        clickFunction.callDigitClick(calc, display, operator, 8);
        updateDisplay();
    }

    public void press9(View view) {
        clickFunction.callDigitClick(calc, display, operator, 9);
        updateDisplay();
    }

    public void pressAc(View view) {
        clickFunction.callACClick(calc, display, operator);
        updateDisplay();
    }

    public void updateDisplay() {
        textView.setText(display.getDisplay());
    }

}