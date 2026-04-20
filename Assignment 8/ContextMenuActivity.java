package com.example.menuassignment;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ContextMenuActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        textView = findViewById(R.id.textViewContext);

        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Context Menu");
        menu.add(0, v.getId(), 0, "Edit");
        menu.add(0, v.getId(), 0, "Delete");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getTitle().equals("Edit")) {
            Toast.makeText(this, "Edit Selected", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle().equals("Delete")) {
            Toast.makeText(this, "Delete Selected", Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}