package com.juan.lazy.inventtory;

import android.app.Application;

import com.parse.Parse;
import com.squareup.leakcanary.LeakCanary;

public class InventTory extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        // Add your initialization code here
        Parse.initialize(this, getResources().getString(R.string.parse_app_id), getResources().getString(R.string.parse_client_key));
        LeakCanary.install(this);
    }
}
