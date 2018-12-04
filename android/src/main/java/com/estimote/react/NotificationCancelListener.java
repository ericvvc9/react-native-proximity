package com.estimote.react;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

public class NotificationCancelListener extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(RNEstimoteProximityModule.ACTION_CANCEL_PROXIMITY));
    }
}
