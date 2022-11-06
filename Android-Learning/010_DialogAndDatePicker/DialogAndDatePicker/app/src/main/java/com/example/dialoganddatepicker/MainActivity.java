
/*
* Date: 25th March 2022
* Created By: Ashish Agrawal
* */

package com.example.dialoganddatepicker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAlertDialog, btnProgressDialog, btnCustomDialog;
    private DatePicker simpleCalDatePicker;
    private Button btnShowDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.btnAlertDialog);
        btnProgressDialog = findViewById(R.id.btnProgressDialog);
        btnCustomDialog = findViewById(R.id.btnCustomDialog);
        simpleCalDatePicker = findViewById(R.id.simpleCalDatePicker);
        btnShowDate = findViewById(R.id.btnShowDate);

/* Button Alert Dialog onClickListener */
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

                alertDialog.setTitle("Do You want to Exit");
                alertDialog.setMessage("To exit the app, click Yes or Not to dismiss the dialog");
                alertDialog.setCanceledOnTouchOutside(false);

                /*Add YES Buttons to AlertDialog*/
                alertDialog.setButton(alertDialog.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Exit the application
                        finish();

                        /*Finish will only stop the current activity
                        * if you want to Stop an App forcefully then type,
                        * System.exit(0)
                        * */
                    }
                });
                /* Close: Add "YES" Button to AlertDialog */

                /*Add "NO" Button to Alert Dialog */
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        /*Dismiss the Dialog*/
                        alertDialog.dismiss();
                    }
                });
                /* Close: Add "NO" button to AlertDialog*/

                /*ADD "Neutral" Button to AlertDialog*/
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "DON'T KNOW", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                /* Close: Add Neutral Button to AlertDialog*/

                alertDialog.show();
            }
        });
/* Close: Button Alert Dialog onClickListener */

/* Display ProgressDialog on Button Click */
        btnProgressDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setIndeterminate(true);
                progressDialog.setTitle("Downloading");
                progressDialog.setMessage("Please Wait.....");

                /* Add "CANCEL" button for Progress Dialog*/
                progressDialog.setButton(progressDialog.BUTTON_POSITIVE, "CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        /* Cancel the progress dialog*/
                    }
                });
                /* Close: Add "CANCEL" button for Progress Dialog*/

                progressDialog.show();

            }
        });
/* Close: Display ProgressDialog on Button Click */

/* Code to Display Custom dialog Box on Button Click */
        btnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.activity_dialog_ui);
                dialog.setCanceledOnTouchOutside(false);

                //Dialog.show();
                Button btnNotNow = (Button) dialog.findViewById(R.id.btnDialogNotNow);
                Button btnGithub = (Button) dialog.findViewById(R.id.btnDialogGithub);

                /* btnNowNow onclick Listener */
                btnNotNow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Not Now", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                /* Close: btnNowNow onclick Listener */

                /* btnGitHub onclick Listener */
                btnGithub.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "GitHub", Toast.LENGTH_SHORT).show();
                    }
                });
                /* Close: btnGitHub onclick Listener */

                dialog.show();
            }
        });
/* Close: Code to Display Custom dialog Box on Button Click */


        btnShowDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Get the value for day of Month, Month and Year from a Date Picker */

                String day = "Day = " + simpleCalDatePicker.getDayOfMonth();
                String month = "Month = " + (simpleCalDatePicker.getMonth() + 1);
                String year = "Year = " + simpleCalDatePicker.getYear();

                /* Display the value by using a Toast */
                String fullDate = day + "\n" + month + "\n" + year;
                Toast.makeText(getApplicationContext(),  fullDate, Toast.LENGTH_LONG).show();
            }
        });

    }
    /* Close: onCreate() */
}
/* CLose: Class MainActivity */