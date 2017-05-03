package com.messagetree;

import android.app.Application;
import android.content.Context;

/**
 * 应用的全局Application对象。
 */

public class MyApplication extends Application {

    private static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationContext = getApplicationContext();
    }

    public static Context getMyApplicationContext() {
        return applicationContext;
    }
}
