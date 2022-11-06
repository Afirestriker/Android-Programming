package com.example.uielements;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button increase, decrease;
    private float ourFontSize = 14f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.tv_text);
        increase = findViewById(R.id.increase);
        decrease = findViewById(R.id.decrease);

        //after new -- ctrl+shit+space

        /* Creating Increase Button Click event listener */
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ourFontSize += 4f;

                text.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontSize);

                text.setTextColor(Color.GREEN);

                Toast.makeText(getApplicationContext(), "Increase Button Clicked", Toast.LENGTH_LONG).show();

            }
        });
        /* Close: Increase Button CLick event listener*/

        /* Creating Decrease Button Click event listener */
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ourFontSize -= 4f;

                text.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontSize);

                text.setTextColor(Color.RED);

                Toast.makeText(getApplicationContext(), "Decrease Button Clicked", Toast.LENGTH_LONG).show();
            }
        });
        /* Close: Decrease Button CLick event listener*/

    }
    /*Close onCreate() method*/
}
/*CLose MainActivity class*/
