package com.example.runningtrackerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

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
        mBatalDaftar = findViewById(R.id.batal_daftar);

        mAuth = FirebaseAuth.getInstance();
        mBatalDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });
    }

    public void daftarAplikasi(View view) {
        String email = mEmail.getText().toString().trim();
        String username = mUsername.getText().toString().trim();
        String password = mPassword.getText().toString().trim();
        String c_password = mPasswordUlang.getText().toString().trim();

        if (username.isEmpty()) {
            mUsername.setError("Username dibutuhkan");
            mUsername.requestFocus();
            return;
        }

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

        if (!password.equals(c_password)) {
            mPasswordUlang.setError("Password tidak sama");
            mPasswordUlang.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(DaftarActivity.this, "Pendaftaran berhasil", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(), LoginTestActivity.class));
//                            User user = new User(username, email);
//
//                            FirebaseDatabase.getInstance().getReference("Users")
//                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
//                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
//                                @Override
//                                public void onComplete(@NonNull @NotNull Task<Void> task) {
//                                    if(task.isSuccessful()){
//                                        Toast.makeText(DaftarActivity.this, "Pendaftaran berhasil", Toast.LENGTH_LONG).show();
//                                        startActivity(new Intent(getApplicationContext(), LoginTestActivity.class));
//                                    } else {
//                                        Toast.makeText(DaftarActivity.this, "Pendaftaran gagal. Coba lagi", Toast.LENGTH_LONG).show();
//                                    }
//                                }
//                            });
                        } else {
                            Toast.makeText(DaftarActivity.this, "Pendaftaran gagal.", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}