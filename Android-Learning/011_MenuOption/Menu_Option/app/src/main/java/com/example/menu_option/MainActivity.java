package com.example.menu_option;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //Inflate the menu; this add items to the action bar it it is present
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;

        /*return super.onCreateOptionsMenu(menu);*/
    }
    /* Close: onCreateOptionsMenu()*/

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id)
        {
            case R.id.search:
                Toast.makeText(getApplicationContext(), "Search Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.android:
                Toast.makeText(getApplicationContext(), "Android Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.about_us:
                Toast.makeText(getApplicationContext(), "About Us Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.settings:
                Toast.makeText(getApplicationContext(), "Settings Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.python:
                Toast.makeText(getApplicationContext(), "Python Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.java:
                Toast.makeText(getApplicationContext(), "Java Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.share:
                Toast.makeText(getApplicationContext(), "Share Selected", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
        /*switch case*/
    }
    /* Close: onOptionsItemSelected() */
}
/* Close: Class MainActivity */
