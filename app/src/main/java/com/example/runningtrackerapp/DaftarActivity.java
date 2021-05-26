package com.example.runningtrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class DaftarActivity extends AppCompatActivity {
    private EditText mUsername, mEmail, mPassword, mPasswordUlang;
    private TextView mBatalDaftar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        mUsername = findViewById(R.id.username_editText);
        mEmail = findViewById(R.id.email_editText);
        mPassword = findViewById(R.id.password_editText);
        mPasswordUlang = findViewById(R.id.password_ulang_editText);

        mAuth = FirebaseAuth.getInstance();
    }

    public void daftarAplikasi(View view) {
        
    }
}