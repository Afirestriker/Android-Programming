package com.example.addnumber;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* declare view group object */
    EditText editTextNum1, editTextNum2;
    Button btnSubmit;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* connect view group object with xml view */
        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtResult = findViewById(R.id.txtResult);

        /* onClickListener for Submit button */
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Get the enter numbers and save into int variable */
                int num1, num2;
                if(editTextNum1.getText().toString().length() != 0 && editTextNum2.getText().toString().length() !=0)
                {
                    num1 = Integer.parseInt(editTextNum1.getText().toString());
                    num2 = Integer.parseInt(editTextNum2.getText().toString());
                }
                else
                {
                    num1 = 0;
                    num2 = 0;
                }


                /* Create intent activity which point to CalculateAndReturnSum Activity */
                Intent newActivity = new Intent(MainActivity.this, CalculateAndReturnSum.class);

                /* Pass message to newActivity */
                newActivity.putExtra("NUM1", num1);
                newActivity.putExtra("NUM2", num2);

                /* Call activity and Set listener for receiving msg */
                startActivityForResult(newActivity, 2);
            }
        });

    }
    /*Close: onCreate() */

    /* method to fetched receive msg */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==2)
        {
            if(data != null)
            {
                String getResult = data.getStringExtra("calResult");
                txtResult.setText("Result: " + getResult);
            }
        }
    }

}
/* close: MainActivity class*/