package com.example.newapp;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        //startActivity(new Intent(MainActivity.this,Login.class));
        getSupportActionBar().hide(); // to apply full screen

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iStart = new Intent(Start.this,Login.class);
                startActivity(iStart);
                finish();
            }
        },500);
    }
}