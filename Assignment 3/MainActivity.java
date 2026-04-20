package com.example.intent;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnContact, btnGoogle, btnYoutube, btnLinkedin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContact = findViewById(R.id.btnContact);
        btnGoogle = findViewById(R.id.btnGoogle);
        btnYoutube = findViewById(R.id.btnYoutube);
        btnLinkedin = findViewById(R.id.btnLinkedIn);

        btnContact.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    ContactsContract.Contacts.CONTENT_URI);
            startActivity(intent);
        });

        btnGoogle.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com"));
            startActivity(intent);
        });

        btnYoutube.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com"));
            startActivity(intent);
        });

        btnLinkedin.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com"));
            startActivity(intent);
        });
    }
}
