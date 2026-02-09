package com.example.andriodcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class TriangleActivity extends AppCompatActivity {

    EditText base, height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        base = findViewById(R.id.base);
        height = findViewById(R.id.height);
    }

    public void calculate(View v) {
        double b = Double.parseDouble(base.getText().toString());
        double h = Double.parseDouble(height.getText().toString());

        double area = 0.5 * b * h;

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("shape", "Triangle");
        i.putExtra("area", area);
        startActivity(i);
    }
}
