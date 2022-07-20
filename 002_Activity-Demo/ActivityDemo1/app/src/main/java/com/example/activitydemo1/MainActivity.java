package com.example.activitydemo1;

/*AppCompatActivity is where all the activity command comes from.*/
import androidx.appcompat.app.AppCompatActivity;

/*Bundle is the collection of all the widget*/
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*Note: The variable name could be anything, but giving same name as component ID, make easier to understand
    * which variable is pointing to which component in layout */
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Linking the respective XML file to this file, Example: Home.html linked to Home.css*/
        setContentView(R.layout.activity_main);

        /*Connecting the Layout Widget to Variable*/
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

    }

    /*Function get call - when "Click Me" button is press */
    public void clickMe(View view) {
        String str = editText.getText().toString();
        textView.setText(str);
    }
}