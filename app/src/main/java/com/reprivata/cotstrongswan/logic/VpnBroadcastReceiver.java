package com.reprivata.cotstrongswan.logic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.reprivata.cotstrongswan.logic.CharonVpnService;

public class VpnBroadcastReceiver extends BroadcastReceiver {

    static final String ACTION_DISCONNECT = "OK";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (ACTION_DISCONNECT.equals(intent.getAction())) {

            Intent i = new Intent(context, CharonVpnService.class);
            i.setAction(CharonVpnService.DISCONNECT_ACTION);
            context.startService(i);
        }
    }
}