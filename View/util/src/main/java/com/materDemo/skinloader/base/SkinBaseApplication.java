package com.materDemo.skinloader.base;

import android.app.Application;

import com.materDemo.skinloader.load.SkinManager;

/**
 * 基类application
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
