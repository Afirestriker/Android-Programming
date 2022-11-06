
/*
 * Date: 21th March 2022
 * Created By: Ashish Agrawal
 * Topic: Activity2.java file for activity_2.xml file */


package com.example.activityandlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    private static final String TAG = "Activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Toast.makeText(this, "onCreate Activity2", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate Activity2");
    }
    /* Close: onCreate Method */


    @Override
    protected void onStart() {
        Toast.makeText(this, "onStart Activity2", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart Activity2");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(this, "onRestart Activity2", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart Activity2");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(this, "onResume Activity2", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume Activity2");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(this, "onPause Activity2", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause Activity2");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "onStop Activity2", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop Activity2");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy Activity2", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy Activity2");
        super.onDestroy();
    }


}
/* Close: Class Activity2 */