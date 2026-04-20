package com.example.ise;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
public class Lab1 extends AppCompatActivity {
    Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab1);
        back1 = findViewById(R.id.back1);
        back1.setOnClickListener(v -> {
            Intent intent = new Intent(Lab1.this, Labs.class);
            startActivity(intent);
        });
    }
}