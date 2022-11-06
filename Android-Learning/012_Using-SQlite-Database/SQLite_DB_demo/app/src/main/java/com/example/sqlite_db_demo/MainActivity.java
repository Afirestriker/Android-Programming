package com.example.sqlite_db_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText courseNameEdt, courseTracksEdt, courseDurationEdt, courseDescriptionEdt;
    private Button btnAddCourse;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseNameEdt = findViewById(R.id.editTxtCourseName);
        courseTracksEdt = findViewById(R.id.editTxtCourseTracks);
        courseDurationEdt = findViewById(R.id.editTxtCourseDuration);
        courseDescriptionEdt = findViewById(R.id.editTxtCourseDescription);
        btnAddCourse = findViewById(R.id.btnAddCourse);

        //creating a new dbhandler class and passing our context to it
        dbHandler = new DBHandler(MainActivity.this);

        /*call btnAddCourse On Click Listener*/
        btnAddCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String courseName = courseNameEdt.getText().toString();
                String courseTracks = courseTracksEdt.getText().toString();
                String courseDuration = courseDurationEdt.getText().toString();
                String courseDescription = courseDescriptionEdt.getText().toString();

                /*Validating if the text field are empty or not.*/
                if(courseName.isEmpty() || courseTracks.isEmpty() || courseDuration.isEmpty() || courseDescription.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Enter all the data...", Toast.LENGTH_SHORT).show();
                    return;
                }

                /* on below link we are calling a method to add new
                 * course to sqlite data and pass all our value to it.
                 */
                dbHandler.addNewCourse(courseName, courseDuration, courseDescription, courseTracks);

                /*after adding the data we are displaying a toast message.*/
                Toast.makeText(MainActivity.this, "Course has been added", Toast.LENGTH_SHORT).show();
                courseNameEdt.setText("");
                courseDurationEdt.setText("");
                courseTracksEdt.setText("");
                courseDescriptionEdt.setText("");

            }
        });
        /*Close: btnAddCourse on click listener*/

    }
    /*close: onCreate()*/

}
/*close: class MainActivity*/