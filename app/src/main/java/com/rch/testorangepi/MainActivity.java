package com.rch.testorangepi;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;

import com.secureflashcard.wormapi.WormInformation;
import com.secureflashcard.wormapi.WormStore;
import com.secureflashcard.wormapi.WormStoreAndroidCompat;

import java.io.IOException;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TSE.getInstance();

        Intent serviceIntent = new Intent(this,WebService.class);

        startService(serviceIntent);
    }
}