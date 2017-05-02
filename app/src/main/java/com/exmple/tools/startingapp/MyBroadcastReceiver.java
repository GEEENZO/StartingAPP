package com.exmple.tools.startingapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by user1 on 2017/05/02.
 */

public class MyBroadcastReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        String str = intent.getExtras().getString("test");
            Log.i("tag",str);
    }
}
