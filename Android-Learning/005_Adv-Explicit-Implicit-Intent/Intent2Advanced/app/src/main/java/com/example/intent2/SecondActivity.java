package com.example.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView txtRecData;
    private EditText txtSendData;
    private Button btnSendMsgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Init TextView
        txtRecData = (TextView) findViewById(R.id.txtRecData);
        txtSendData = (EditText) findViewById(R.id.txtSendData);
        btnSendMsgBack = (Button) findViewById(R.id.btnSendMsgBack);

        /* Get Data from calling Activity (In this case it is MainActivity) */
        Intent recIntent = getIntent();
        //Store the data in string variable
        String recMessage = recIntent.getStringExtra(MainActivity.KEY);
        
        //Print Message in Toast
        Toast.makeText(SecondActivity.this, recMessage, Toast.LENGTH_LONG).show();

        txtRecData.setText(recMessage);

        /* button onclick listener for Button btnSendMsgBack */
        btnSendMsgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = txtSendData.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("MESSAGE", message);
                setResult(2,intent);
                finish();
            }
        });

    }
    /* Close: onCreate Method */

} /* Close: SecondActivity Class */