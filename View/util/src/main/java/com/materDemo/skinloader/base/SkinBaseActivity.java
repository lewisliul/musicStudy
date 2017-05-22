package com.materDemo.skinloader.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.materDemo.skinloader.attr.DynamicAttr;
import com.materDemo.skinloader.listener.IDynamicNewView;
import com.materDemo.skinloader.listener.ISkinUpdate;

import java.util.List;

/**
 * 需要实现换肤功能的Activity就需要继承于这个Activity
 */

public class SkinBaseActivity extends AppCompatActivity implements ISkinUpdate, IDynamicNewView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onThemeUpdate() {

    }


    @Override
    public void dynamicAddView(View view, List<DynamicAttr> pDAttrs) {

    }
}
