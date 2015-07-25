package com.indcoders.freebieindiaearnfreetalktime;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/**
 * Created by Akki on 25/07/15.
 */
public class IntallListener extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String pkgName = data.getEncodedSchemeSpecificPart();
        OffersFragment.packageInstalled(pkgName, context);
        Log.e("installed", ":" + pkgName);

    }
}
