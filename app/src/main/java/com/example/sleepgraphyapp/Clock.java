package com.example.sleepgraphyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Clock extends AppCompatActivity {

    private ImageView button_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);

        button_profile = findViewById(R.id.profile);

        button_profile.setOnClickListener(v -> startActivity(new Intent(Clock.this, UserSettings.class)));

    }
}