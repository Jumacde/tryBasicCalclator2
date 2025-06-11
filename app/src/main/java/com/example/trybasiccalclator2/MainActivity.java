package com.example.trybasiccalclator2;

import android.os.Bundle;
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

    }
}