package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView firstNameView, lastNameView, telNumberView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String firstName = extras.getString("firstName");
            String lastName = extras.getString("lastName");
            int telNumber = extras.getInt("telNumber");

            firstNameView = findViewById(R.id.firstNameID);
            lastNameView = findViewById(R.id.lastNameID);
            telNumberView = findViewById(R.id.telNumberID);

            firstNameView.setText("First Name: " + firstName);
            lastNameView.setText("Last Name: " + lastName);
            telNumberView.setText("Phone Number: " + telNumber);
        }

    }
}