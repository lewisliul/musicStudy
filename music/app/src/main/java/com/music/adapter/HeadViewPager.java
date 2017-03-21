package com.music.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

/**
 * Created by hc on 2017/3/20.
 */

public class HeadViewPager extends ViewPager implements Runnable {
    public HeadViewPager(Context context) {
        super(context);
    }

    public HeadViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void run() {

    }
}
