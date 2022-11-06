package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] countries = {"India", "USA", "UK", "France", "Italy"};

    /*Important Note: To fill the data in a spinner we need to implement an adapter class
    * A spinner is mainly used to display only text field so we can implement array adapter for that.
    * We can also use Base adapter and other custom adapter to display a spinner with more customize list.
    *
    * Array Adapter:
    * An adapter is a bridge between UI component and data source that helps us to fill data in UI component.
    * IT Holds the data and send the data to adapter view then view can takes the data from teh adapter
    * view and show that data on different views like as list view, grid view, spinner.
    * Whenever you have a list of single items which is backed by an array, you cna use Array adapter*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting hte instance of spinner and applying OnItemSelectedListener on it.
        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country name list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countries);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Connecting the adapter with spinner
        spin.setAdapter(aa);

    }
    /*Close: onCreate Method*/

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {

        Toast.makeText(getApplicationContext(), countries[position], Toast.LENGTH_SHORT).show();
    }
    /*Close: onItemSelected() */

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();
    }

}
/*Close: Class MainActivity*/