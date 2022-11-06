package com.example.intent2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etxText, etxMessage;
    private TextView txtRes;
    private Button btnText, btnSendMessage;

    //Global
    public static final String KEY = "MESSAGE";

    public MainActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Init View*/
        /*Explicit Intent ViewGroup */
        etxText = findViewById(R.id.etxText);
        etxMessage = findViewById(R.id.etxMessage);
        btnText = (Button) findViewById(R.id.btnNewActivity);

        /* Implicit Intent ViewGroup*/
        txtRes = (TextView) findViewById(R.id.txtRes);
        btnSendMessage = (Button) findViewById(R.id.btnSendMessage);


/*OnClick Event for Button (Example of Explicit Intent) */
        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Get data from EditText*/
                String message = etxText.getText().toString();

                /*Code to Start new Activity (Explicit)*/
                Intent newActivity = new Intent(MainActivity.this, SecondActivity.class);

                /*putExtra is used to send message, whenever we want to pass message we use putExtra */
                newActivity.putExtra(KEY, message);

                /*
                *Whenever we want to just open or send message to another activity we used startActivity()*/
                //startActivity(newActivity)

                /*Whenever we want to send as well as receive message we used */
                startActivityForResult(newActivity, 2);
            }
        });
/*Close: btnText onClick Listener*/


/*onClick Listener for btnSendMessage (Example of Implicit Intent) */
        btnSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Grab value from EditText etxMessage*/
                String url = etxMessage.getText().toString();

                /*Code to start Implicit Activity*/
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                /*Start Activity*/
                startActivity(intent);

            }
        });
/*Close: btnSendMessage onClick Listener */

    }
/*Close Method onCreate()*/

/*Method for message retrieving onActivityResult*/
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        /*Check if the request code is same as what is passed here it is 2*/
        if(requestCode==2)
        {
            String message = data.getStringExtra("MESSAGE");
            txtRes.setText(message);
        }
    }
/*Close: Method for Message retrieving*/

}
/*Close: MainActivity Class*/