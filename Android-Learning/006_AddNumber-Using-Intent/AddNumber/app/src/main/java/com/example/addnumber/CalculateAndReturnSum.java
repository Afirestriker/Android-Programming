package com.example.addnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculateAndReturnSum extends AppCompatActivity {

    TextView txtDisplayResult;
    Button  btnSendResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_and_return_sum);

        txtDisplayResult = findViewById(R.id.txtDisplayResult);
        btnSendResult = findViewById(R.id.btnSendResult);

        /* Get data from calling activity */
        Intent recIntent = getIntent();

        /* Fetch data from calling activity and store it in variable */
        int num1 = recIntent.getIntExtra("NUM1", 0);
        int num2 = recIntent.getIntExtra("NUM2", 0);

        /*Calculate and store data int sum variable and display result on txtDisplayResult TextView*/
        int sum = num1 + num2;
        txtDisplayResult.setText(num1 + " + " + num2 + ": " + sum);

        /* onClickListener for button send result back*/
        btnSendResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callMainActivity = new Intent();
                callMainActivity.putExtra("calResult", String.valueOf(sum));
                setResult(2, callMainActivity);
                finish();
            }
        });
    }
}