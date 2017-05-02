package com.exmple.tools.startingapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

/**
 * Created by user1 on 2017/05/02.
 */

public class MyBroadcastReceiver extends BroadcastReceiver{

    TextView textView;
    //Context context;
    @Override
    public void onReceive(Context context, Intent intent) {

            Log.d(TAG,"onReceiveSTARTING:");
        String str = "use?";
        str = intent.getExtras().getString("backs");
            Log.i("tag",str);
            Toast.makeText(context,str, Toast.LENGTH_SHORT).show();

        Bundle bundle = intent.getExtras();

        if(bundle == null){
            Log.i("TAG::","NULL--ON/"+str);
        }else{
            Log.i("TAG::",bundle.getString("button")+"ADB-ON「"+str+"」");
        }
    }
}
