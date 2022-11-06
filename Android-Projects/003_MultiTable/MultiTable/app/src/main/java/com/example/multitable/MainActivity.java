package com.example.multitable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEnterNumber;
    private TextView textViewResult1;
    private TextView textViewResult2;
    private TextView textViewResult3;
    private TextView textViewResult4;
    private TextView textViewResult5;
    private TextView textViewResult6;
    private TextView textViewResult7;
    private TextView textViewResult8;
    private TextView textViewResult9;
    private TextView textViewResult10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEnterNumber = findViewById(R.id.editTextEnterNumber);
        textViewResult1 = findViewById(R.id.textViewResult1);
        textViewResult2 = findViewById(R.id.textViewResult2);
        textViewResult3 = findViewById(R.id.textViewResult3);
        textViewResult4 = findViewById(R.id.textViewResult4);
        textViewResult5 = findViewById(R.id.textViewResult5);
        textViewResult6 = findViewById(R.id.textViewResult6);
        textViewResult7 = findViewById(R.id.textViewResult7);
        textViewResult8 = findViewById(R.id.textViewResult8);
        textViewResult9 = findViewById(R.id.textViewResult9);
        textViewResult10 = findViewById(R.id.textViewResult10);
    }

    public void showTable(View view) {
        int number = Integer.parseInt(editTextEnterNumber.getText().toString());

        textViewResult1.setText(number + " X " + 1 + " = " + (number*1));
        textViewResult2.setText(number + " X " + 2 + " = " + (number*2));
        textViewResult3.setText(number + " X " + 3 + " = " + (number*3));
        textViewResult4.setText(number + " X " + 4 + " = " + (number*4));
        textViewResult5.setText(number + " X " + 5 + " = " + (number*5));
        textViewResult6.setText(number + " X " + 6 + " = " + (number*6));
        textViewResult7.setText(number + " X " + 7 + " = " + (number*7));
        textViewResult8.setText(number + " X " + 8 + " = " + (number*8));
        textViewResult9.setText(number + " X " + 9 + " = " + (number*9));
        textViewResult10.setText(number + " X " + 10 + " = " + (number*10));
    }
}