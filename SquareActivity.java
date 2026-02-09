package com.example.andriodcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SquareActivity extends AppCompatActivity {

    EditText side;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        side = findViewById(R.id.side);
    }

    public void calculate(View v) {
        double s = Double.parseDouble(side.getText().toString());
        double area = s * s;

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("shape", "Square");
        i.putExtra("area", area);
        startActivity(i);
    }
}
