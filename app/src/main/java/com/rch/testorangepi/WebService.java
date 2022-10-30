package com.rch.testorangepi;



import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;


import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class WebService extends Service  {





    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // We don't want this service to continue running if it is explicitly
        // stopped, so return not sticky.
        return START_STICKY;
    }

    @Override
    public void onCreate() {
        super.onCreate();



        startForeground(1, new Notification());

//        WifiConfiguration wifiConfig = new WifiConfiguration();
//        wifiConfig.SSID = String.format("\"%s\"", "embedia");
//        wifiConfig.preSharedKey = String.format("\"%s\"", "chiesetta32");
//
//        WifiManager wifiManager = (WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
////remember id
//        int netId = wifiManager.addNetwork(wifiConfig);
//        wifiManager.disconnect();
//        wifiManager.enableNetwork(netId, true);
//        wifiManager.reconnect();

        LocalStreamingServer server = new LocalStreamingServer(8080);
        try{
            server.start();
            //Log.e("local", server.get + " asdf");
        }catch(IOException e){
            Log.i("XXXXXXXXXXX","web service not started");
            e.printStackTrace();
        }

        Log.i("XXXXXXXXX","webservice started ");

    }





    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public synchronized void onDestroy() {}
}
