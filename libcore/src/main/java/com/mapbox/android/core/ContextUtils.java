package com.mapbox.android.core;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

public final class ContextUtils {


    @SuppressLint("WrongConstant")
    public static Intent registerReceiver(Context context, BroadcastReceiver receiver, IntentFilter filter) {
        final int receiverFlags = 0x4;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return context.registerReceiver(receiver, filter, receiverFlags);
        } else {
            return context.registerReceiver(receiver, filter);
        }
    }

}
