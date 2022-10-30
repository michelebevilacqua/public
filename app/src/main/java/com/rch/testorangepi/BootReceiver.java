package com.rch.testorangepi;




import static android.content.Context.WIFI_SERVICE;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class BootReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(final Context context, Intent intent) {


        Intent serviceIntent = new Intent(context, MainActivity.class);
        serviceIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        serviceIntent.addCategory("android.intent.category.LAUNCHER");

        context.startActivity(serviceIntent);
    }
}
