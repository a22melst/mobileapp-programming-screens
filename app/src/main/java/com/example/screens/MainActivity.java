package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              runActivity2();
            }
        });
        }
        public void runActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("firstName", "Rutger");
        intent.putExtra("lastName", "Andersson");
        intent.putExtra("telNumber", 12345);
        startActivity(intent);
        }

    }

