package com.example.ise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab12 extends AppCompatActivity {
    Button back12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab12);
        back12 = findViewById(R.id.back12);
        back12.setOnClickListener(v -> {
            Intent intent = new Intent(Lab12.this, Labs.class);
            startActivity(intent);
        });
    }
}