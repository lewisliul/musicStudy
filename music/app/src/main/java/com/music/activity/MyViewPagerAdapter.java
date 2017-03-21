package com.music.activity;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by hc on 2017/3/20.
 */

public class MyViewPagerAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
