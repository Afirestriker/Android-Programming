
/*
* Date: 21th March 2022
* Created By: Ashish Agrawal
* Topic: MainActivity.java file for activity_main.xml file */

package com.example.activityandlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate MainActivity");
    }
    /*Close: onCreate Method */

    @Override
    protected void onStart() {
        Toast.makeText(this, "onStart MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart MainActivity");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(this, "onRestart MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart MainActivity");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "onResume MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume MainActivity");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this, "onPause MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause MainActivity");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "onStop MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop MainActivity");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy MainActivity", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy MainActivity");
        super.onDestroy();
    }

    /* Method to go to Next Activity */
    public void goToActivity2(View view){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    /*Close: goToActivity2 Method */

}
/* Cloe: MainActivity java class */