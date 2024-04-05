package com.example.lightmessenger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MainActivity999";
    private static final String PASSWORD = "99999999";
    private static final String GMAIL = "rodion.44454@gmail.com";
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
}