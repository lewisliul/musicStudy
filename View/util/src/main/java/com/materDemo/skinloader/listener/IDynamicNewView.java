package com.materDemo.skinloader.listener;

import android.view.View;

import com.materDemo.skinloader.attr.DynamicAttr;

import java.util.List;

/**
 * Created by hc on 2017/4/19.
 */

public interface IDynamicNewView {
    void dynamicAddView(View view, List<DynamicAttr> pDAttrs);
}
