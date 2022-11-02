
/*
*Java Coding Date: 12th March 2022
*Created By: Ashish Agrawal
 */

package com.example.basiccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNum1, editTextNum2;
    TextView txtResult;
    Button btnAdd, btnSub, btnDiv, btnMul, btnReset;

    double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.editTxtNum1);
        editTextNum2 = findViewById(R.id.editTxtNum2);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);

        btnReset = findViewById(R.id.btnReset);

        txtResult = findViewById(R.id.txtResult);

    }
    /* Close Method: onCreate */

    /* Method BtnAdd */
    public void BtnAdd(View view) {

        num1 = Double.parseDouble(editTextNum1.getText().toString());
        num2 = Double.parseDouble(editTextNum2.getText().toString());
        txtResult.setText("Add Result: " + (int)(num1+num2));

    }/*Close Method BtnAdd */

    public void BtnSub(View view) {

        num1 = Double.parseDouble(editTextNum1.getText().toString());
        num2 = Double.parseDouble(editTextNum2.getText().toString());
        txtResult.setText("Sub Result: " + (int)(num1-num2));

    } /*Close Method BtnSub*/

    public void BtnDiv(View view) {

        num1 = Double.parseDouble(editTextNum1.getText().toString());
        num2 = Double.parseDouble(editTextNum2.getText().toString());

        if(num2 != 0)
            txtResult.setText("Div Result: " + (num1/num2));
        else
            txtResult.setText("Second Number Error: Can't Divide by Zero");

    } /*Close Method BtnDiv */

    public void BtnMul(View view) {

        num1 = Double.parseDouble(editTextNum1.getText().toString());
        num2 = Double.parseDouble(editTextNum2.getText().toString());
        txtResult.setText(" Mul Result: " + (int)(num1*num2));

    } /*Close Method BtnMul */

    public void BtnReset(View view) {

        editTextNum1.setText(null);
        editTextNum2.setText(null);
        txtResult.setText(null);

    } /*Close Method BtnReset */
} /* CLose Class: MainActivity */
