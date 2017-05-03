package com.messagetree.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * 程序主页面框架的pager adapter，用于创建各个Tab子页面以及占位页面。
 */

public class MainTabsPagerAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
