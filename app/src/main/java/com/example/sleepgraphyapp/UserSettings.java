package com.example.sleepgraphyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserSettings extends AppCompatActivity {

    private Button button_logout;
    private ImageView button_back;

    FirebaseUser firebaseUser;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings);

        button_logout = findViewById(R.id.logout_button);
        button_back = findViewById(R.id.back_button);

        auth = FirebaseAuth.getInstance();
        firebaseUser = auth.getCurrentUser();

        button_logout.setOnClickListener(v -> {
            auth.signOut();
            Toast.makeText(UserSettings.this, "Logout successful.", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(UserSettings.this, LoginActivity.class));
        });

        button_back.setOnClickListener(v -> startActivity(new Intent(UserSettings.this, Clock.class)));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}