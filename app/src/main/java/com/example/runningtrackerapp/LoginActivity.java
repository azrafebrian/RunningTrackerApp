package com.example.runningtrackerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

public class LoginActivity extends AppCompatActivity {
    EditText mEmail, mPassword;
    Button mLoginButton, mDaftarButton;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEmail = findViewById(R.id.loginEmail_editText);
        mPassword = findViewById(R.id.loginPassword_editText);
        mAuth = FirebaseAuth.getInstance();
        mLoginButton = findViewById(R.id.button_masuk);
        mDaftarButton = findViewById(R.id.button_daftar_screen);

        mDaftarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DaftarActivity.class));
            }
        });

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

                if (email.isEmpty()) {
                    mEmail.setError("Email dibutuhkan");
                    mEmail.requestFocus();
                    return;
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    mEmail.setError("Email harus valid");
                    mEmail.requestFocus();
                    return;
                }

                if (password.isEmpty()) {
                    mPassword.setError("Password dibutuhkan");
                    mPassword.requestFocus();
                    return;
                }

                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(LoginActivity.this, "berhasil masuk", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
                        } else {
                            Toast.makeText(LoginActivity.this, "Gagal masuk", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });


    }
}