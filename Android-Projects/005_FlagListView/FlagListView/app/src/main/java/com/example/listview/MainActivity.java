package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;

    /*String Array for storing Country Name */
    String countryList[] = {"India", "China", "France", "Germany", "UK", "America (US)"};

    /* int array for storing Flag Images*/
    int flags[] = {R.drawable.imgindia, R.drawable.imgchina, R.drawable.imgfrance, R.drawable.imggermany, R.drawable.imggb, R.drawable.imgusa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = findViewById(R.id.simpleListView);

        /* Coding for CustomAdapter.java file */
        /* Passing countryList and flags array to CustomerAdapter constructor */
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);


    } /*Close onCreate() Method */

} /* Close: Class MainActivity */