package com.example.ise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab4 extends AppCompatActivity {
    Button back4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab4);
        back4 = findViewById(R.id.back4);
        back4.setOnClickListener(v -> {
            Intent intent = new Intent(Lab4.this, Labs.class);
            startActivity(intent);
        });
    }
}