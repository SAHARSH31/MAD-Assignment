package com.example.filehandlingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.io.*;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button btnSave, btnRead;

    String fileName = "myfile.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        btnSave = findViewById(R.id.btnSave);
        btnRead = findViewById(R.id.btnRead);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data = editText.getText().toString();

                try {
                    FileOutputStream fos = openFileOutput(fileName, MODE_PRIVATE);
                    fos.write(data.getBytes());
                    fos.close();

                    Toast.makeText(MainActivity.this, "File Saved", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    FileInputStream fis = openFileInput(fileName);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

                    String line;
                    StringBuilder data = new StringBuilder();

                    while ((line = reader.readLine()) != null) {
                        data.append(line).append("\n");
                    }

                    textView.setText(data.toString());
                    fis.close();

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "File not found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
