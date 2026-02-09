package com.example.andriodcalculator;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView result = findViewById(R.id.resultText);

        String shape = getIntent().getStringExtra("shape");
        double area = getIntent().getDoubleExtra("area", 0);

        result.setText("Area of " + shape + " = " + area);
    }
}
