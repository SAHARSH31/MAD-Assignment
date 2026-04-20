package com.example.ise;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.widget.Button;
public class Lab2 extends AppCompatActivity {
    Button back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab2);
        back2 = findViewById(R.id.back2);
        back2.setOnClickListener(v -> {
            Intent intent = new Intent(Lab2.this, Labs.class);
            startActivity(intent);
        });
    }
}