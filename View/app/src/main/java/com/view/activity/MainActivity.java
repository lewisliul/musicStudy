package com.view.activity;


import android.os.Bundle;
import android.util.Log;

import com.materDemo.library.activity.base.BaseActivity;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null)
            Log.i(TAG, "NULL");
        else {
            Log.i(TAG, "NOT NULL");
        }
    }


}
