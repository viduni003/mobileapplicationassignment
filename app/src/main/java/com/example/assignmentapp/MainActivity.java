package com.example.assignmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button from activity_main.xml by its ID
        Button btnSecondActivity = findViewById(R.id.btnSecondActivity);

        // Set up the click listener to handle button clicks
        btnSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Explicit Intent to move from MainActivity to SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Start the SecondActivity
                startActivity(intent);
            }
        });
    }
}