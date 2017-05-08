package com.materDemo.library;

import com.materDemo.library.utils.ToastUtils;
import com.materDemo.skinloader.base.SkinBaseApplication;

/**
 * demo 类的app
 */

public class MaterialDemoApplication extends SkinBaseApplication {

    private static MaterialDemoApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        ToastUtils.init(this);
    }

    public static MaterialDemoApplication getInstance() {
        return mInstance;
    }
}
