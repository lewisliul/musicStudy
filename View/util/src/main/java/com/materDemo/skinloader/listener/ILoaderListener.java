package com.materDemo.skinloader.listener;

/**
 * 加载皮肤时的回调接口
 */

public interface ILoaderListener {

    void onStart();

    void onSuccess();

    void onFailed();

}
