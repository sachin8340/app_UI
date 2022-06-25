package com.example.newapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); // to apply full screen

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iStart = new Intent(MainActivity.this,Login.class);
                startActivity(iStart);
                finish();
            }
        },500);
    }
}