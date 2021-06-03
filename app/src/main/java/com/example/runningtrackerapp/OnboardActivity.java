package com.example.runningtrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class OnboardActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);

        mAuth = FirebaseAuth.getInstance();

        if(mAuth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
            finish();
        }

    }

    public void loginMenu(View view) {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}