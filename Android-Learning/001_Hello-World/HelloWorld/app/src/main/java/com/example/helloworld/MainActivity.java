package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

//contains all widget
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //linking xml file with the coding file
        setContentView(R.layout.activity_main);
    }
}