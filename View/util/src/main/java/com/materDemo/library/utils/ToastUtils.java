package com.materDemo.library.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast工具类
 */

public class ToastUtils {

    private static Context mContext;
    private static ToastUtils mInstance;
    private Toast mToast;

    private ToastUtils(Context ctx) {
        mContext = ctx;
    }

    public static ToastUtils getInstance() {
        return mInstance;
    }

    public static void init(Context ctx) {
        mInstance = new ToastUtils(ctx);
    }

    public void showToast(String text) {
        if (mToast == null) {
            mToast = Toast.makeText(mContext, text, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(text);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

    public void cancelToast() {
        if (mToast != null) {
            mToast.cancel();
        }
    }

}
