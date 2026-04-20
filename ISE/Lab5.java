package com.example.ise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab5 extends AppCompatActivity {
    Button back5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab5);
        back5 = findViewById(R.id.back5);
        back5.setOnClickListener(v -> {
            Intent intent = new Intent(Lab5.this, Labs.class);
            startActivity(intent);
        });
    }
}