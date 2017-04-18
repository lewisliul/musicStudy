package com.materDemo.skinloader.base;

import android.app.Application;

import com.materDemo.skinloader.load.SkinManager;

/**
 * Created by hc on 2017/4/18.
 */

public class SkinBaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initSkinLoader();
    }

    /**
     * Must call init first
     */
    private void initSkinLoader() {
        SkinManager.getInstance().init(this);
        SkinManager.getInstance().load();
    }
}
