package com.example.andriodcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RectangleActivity extends AppCompatActivity {

    EditText length, breadth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        length = findViewById(R.id.length);
        breadth = findViewById(R.id.breadth);
    }

    public void calculate(View v) {
        double l = Double.parseDouble(length.getText().toString());
        double b = Double.parseDouble(breadth.getText().toString());

        double area = l * b;

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("shape", "Rectangle");
        i.putExtra("area", area);
        startActivity(i);
    }
}
