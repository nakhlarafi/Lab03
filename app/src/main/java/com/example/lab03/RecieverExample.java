package com.example.lab03;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.BatteryManager;
import android.widget.Toast;

public class RecieverExample extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Toast.makeText(context, "Booted",Toast.LENGTH_LONG).show();
        }

        if(Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())){
            Toast.makeText(context, "Connected",Toast.LENGTH_LONG).show();
        }

        if(Intent.ACTION_POWER_DISCONNECTED.equals(intent.getAction())){
            Toast.makeText(context, "Disconnected",Toast.LENGTH_LONG).show();
        }

    }
}
