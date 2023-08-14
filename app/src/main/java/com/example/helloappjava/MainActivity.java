package com.example.helloappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "HELLOAPPJAVA_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");
        Log.d(TAG, "onCreate: started from github");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: started");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: started");
    }
}