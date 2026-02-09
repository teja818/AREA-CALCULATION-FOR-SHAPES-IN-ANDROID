package com.example.andriodcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class CircleActivity extends AppCompatActivity {

    EditText radius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        radius = findViewById(R.id.radius);
    }

    public void calculate(View v) {
        double r = Double.parseDouble(radius.getText().toString());
        double area = Math.PI * r * r;

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("shape", "Circle");
        i.putExtra("area", area);
        startActivity(i);
    }
}
