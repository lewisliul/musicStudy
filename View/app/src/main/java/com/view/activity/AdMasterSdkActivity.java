package com.view.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.admaster.sdk.api.AdmasterSdk;
import com.materDemo.library.activity.base.BaseActivity;
import com.view.R;

public class AdMasterSdkActivity extends BaseActivity {

    /**
     * sdkconfig.xml配置文件服务器存放地址
     */
    public static final String CONFIG_URL = "";

    /**
     * 点击监测地址
     */
    public static final String TEST_TRACKING_URL = "http://vxyz.admaster.com.cn/v/a17298,b06061708,c3194,i0,m201";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SDK初始化
        AdmasterSdk.init(this, CONFIG_URL);
        AdmasterSdk.setLogState(true);
    }

    /**
     * 点击广告
     */
    public void sendClick(View view) {
        AdmasterSdk.onClick(TEST_TRACKING_URL);
        Toast.makeText(this, "[click] 目标链接：" + TEST_TRACKING_URL, Toast.LENGTH_LONG).show();
    }

    /**
     * 曝光广告
     */
    public void sendExpose(View view) {
        AdmasterSdk.onExpose(TEST_TRACKING_URL);
        Toast.makeText(this, "[expose] 目标链接：" + TEST_TRACKING_URL, Toast.LENGTH_LONG).show();
    }
}
