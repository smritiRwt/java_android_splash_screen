package com.example.crud_java_android.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.crud_java_android.MainActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        long time=2000;

     new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent intent =new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
     },time);

    }

    }


