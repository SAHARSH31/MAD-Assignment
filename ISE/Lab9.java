package com.example.ise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab9 extends AppCompatActivity {
    Button back9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab9);
        back9 = findViewById(R.id.back9);
        back9.setOnClickListener(v -> {
            Intent intent = new Intent(Lab9.this, Labs.class);
            startActivity(intent);
        });
    }
}