package com.example.ise;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submitBtn;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(v -> {

            String user = username.getText().toString().trim();
            String pass = password.getText().toString().trim();

            if (user.equals("RST") && pass.equals("789@2000")) {

                Intent intent = new Intent(MainActivity.this, Labs.class);
                startActivity(intent);

            } else {
                username.setError("Invalid Username");
                password.setError("Invalid Password");
            }
        });
    }
}
