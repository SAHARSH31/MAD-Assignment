package com.example.assignment7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;

public class ProgBar extends AppCompatActivity {

    ProgressBar progressBarDeterminate;
    Button btnIncrease;
    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarDeterminate = findViewById(R.id.progressBarDeterminate);
        btnIncrease = findViewById(R.id.btnIncrease);

        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (progress < 100) {
                    progress += 10;
                    progressBarDeterminate.setProgress(progress);
                }
            }
        });
    }
}