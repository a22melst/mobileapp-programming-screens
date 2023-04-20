package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra ("firstName");
        String lastName = intent.getStringExtra ("lastName");
        String telNumber = intent.getStringExtra ("telNumber");
    }
}