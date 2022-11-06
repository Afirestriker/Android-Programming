package com.example.broadcast_receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBroadCastIntent;

    /* Dynamically Registering Broadcast Receiver
     * For newer android version after Oreo
     */
    private BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBroadCastIntent = findViewById(R.id.btnBroadCastIntent);
        broadcastReceiver = new MyReceiver();

        /* btnBroadCastIntent On click listener */
        btnBroadCastIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("com.example.andy.CUSTOM_INTENT");
                sendBroadcast(intent);
                Log.i("In After Click", "N/A");
            }
        });
        /* Close: btnBroadCastIntent on click listener*/

    }/* Close: onCreate() */

    /* This is the way to dynamically register BroadCast Receiver,
    *  NOTE: In newer android version, dynamic registration is important
    *        for running BroadCast Receiver
    * */
    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter("com.example.andy.CUSTOM_INTENT");
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT);
        registerReceiver(broadcastReceiver, intentFilter);
    }
    /*Close: onStart()*/

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
    }
    /*Close: onStop()*/

}/*Close: Class MainActivity*/