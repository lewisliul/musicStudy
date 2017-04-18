package com.materDemo.skinloader.load;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;

import com.materDemo.skinloader.config.SkinConfig;
import com.materDemo.skinloader.listener.ILoaderListener;
import com.materDemo.skinloader.listener.ISkinLoader;
import com.materDemo.skinloader.listener.ISkinUpdate;

/**
 * 皮肤管理
 */

public class SkinManager implements ISkinLoader {

    private Context mContext;
    private static volatile SkinManager mInstance;

    private SkinManager() {
    }

    public static SkinManager getInstance() {
        if (mInstance == null) {
            synchronized (SkinManager.class) {
                if (mInstance == null) {
                    mInstance = new SkinManager();
                }
            }
        }
        return mInstance;
    }

    public void init(Context context) {
        mContext = context.getApplicationContext();
    }

    public void load() {
        String skin = SkinConfig.getCustomSkinPath(mContext);
        load(skin, null);
    }

    public void load(ILoaderListener callback) {
        String skin = SkinConfig.getCustomSkinPath(mContext);
        if (SkinConfig.isDefaultSkin(mContext)) {
            return;
        }
        load(skin, callback);
    }

    public void load(String skinPackagePath, final ILoaderListener callback) {

        new AsyncTask<String, Void, Resources>() {

            @Override
            protected Resources doInBackground(String... strings) {
                return null;
            }
        };
    }

    @Override
    public void attach(ISkinUpdate observer) {

    }

    @Override
    public void detach(ISkinUpdate observer) {

    }

    @Override
    public void notifySkinUpdate() {

    }
}
