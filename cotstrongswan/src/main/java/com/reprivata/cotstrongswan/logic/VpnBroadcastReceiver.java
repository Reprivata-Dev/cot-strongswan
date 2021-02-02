/*
 * Copyright (C) 2021 Reprivata
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.  See <http://www.fsf.org/copyleft/gpl.txt>.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * for more details.
 */

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