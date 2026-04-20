package com.example.ise;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageButton;
import android.content.Intent;
public class Labs extends AppCompatActivity {
    ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_labs);

        btn1 = findViewById(R.id.lab1Btn);
        btn2 = findViewById(R.id.lab2Btn);
        btn3 = findViewById(R.id.lab3Btn);
        btn4 = findViewById(R.id.lab4Btn);
        btn5 = findViewById(R.id.lab5Btn);
        btn6 = findViewById(R.id.lab6Btn);
        btn7 = findViewById(R.id.lab7Btn);
        btn8 = findViewById(R.id.lab8Btn);
        btn9 = findViewById(R.id.lab9Btn);
        btn10 = findViewById(R.id.lab10Btn);
        btn11 = findViewById(R.id.lab11Btn);
        btn12 = findViewById(R.id.lab12Btn);

        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab1.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab2.class);
            startActivity(intent);
        });
        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab3.class);
            startActivity(intent);
        });
        btn4.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab4.class);
            startActivity(intent);
        });
        btn5.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab5.class);
            startActivity(intent);
        });
        btn6.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab6.class);
            startActivity(intent);
        });
        btn7.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab7.class);
            startActivity(intent);
        });
        btn8.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab8.class);
            startActivity(intent);
        });
        btn9.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab9.class);
            startActivity(intent);
        });
        btn10.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab10.class);
            startActivity(intent);
        });
        btn11.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab11.class);
            startActivity(intent);
        });
        btn12.setOnClickListener(v -> {
            Intent intent = new Intent(Labs.this, Lab12.class);
            startActivity(intent);
        });
    }
}