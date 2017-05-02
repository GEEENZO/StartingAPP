package com.exmple.user1.startingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String BATTERY_LOW =
            "android.intent.action.BATTERY_LOW";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview = (TextView)findViewById(R.id.text_view);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(broadButton);

    }

    View.OnClickListener broadButton = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            //Intent intent = new Intent();//(getApplicationContext(), MyBroadcastReceiver.class);
            //intent.setAction(Intent.ACTION_BOOT_COMPLETED);//(BATTERY_LOW);
            //intent.putExtra("button","onClick");
            //sendBroadcast(intent);
            //MyBroadcastReceiver myreceive = new MyBroadcastReceiver();
            //myreceive.onReceive(getApplicationContext(),intent.setAction("button"));

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,"TULLLLLL");
            startActivityForResult(intent,0);
        }
    };
}
