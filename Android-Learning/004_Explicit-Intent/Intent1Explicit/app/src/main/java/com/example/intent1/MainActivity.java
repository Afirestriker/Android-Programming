package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtUserName, txtUserPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUserName = findViewById(R.id.editTextUN);
        txtUserPassword = findViewById(R.id.editTextUP);

    }
/* Close: Method OnCreate() */


/* Login Button OnClick Event */
    public void login(View view) {

        String user = txtUserName.getText().toString();
        String pass = txtUserPassword.getText().toString();

        if(user.isEmpty() || pass.isEmpty())
        {
            Toast.makeText(this, "Empty Username 0r Password", Toast.LENGTH_LONG).show();
        }

        if(user.equals("Android") && pass.equals("Password"))
        {
            //use Intent to perform Navigation
            Intent intent = new Intent(this, WelcomeActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "User Credentials Does not match", Toast.LENGTH_LONG).show();
        }
    }
/* Close: Method login */

}
/* CLose: Class MainActivity */