package com.example.andriodcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSquare(View v) {
        startActivity(new Intent(this, SquareActivity.class));
    }

    public void openRectangle(View v) {
        startActivity(new Intent(this, RectangleActivity.class));
    }

    public void openCircle(View v) {
        startActivity(new Intent(this, CircleActivity.class));
    }

    public void openTriangle(View v) {
        startActivity(new Intent(this, TriangleActivity.class));
    }
}
