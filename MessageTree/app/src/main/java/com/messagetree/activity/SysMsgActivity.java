package com.messagetree.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.messagetree.R;
import com.messagetree.model.BadgeNumber;
import com.messagetree.tree.BadgeNumberTreeManager;

/**
 * 查看系统消息的页面
 */
public class SysMsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sys_msg);

        BadgeNumberTreeManager.getInstance().clearBadgeNumber(BadgeNumber.TYPE_SYSMSG, null);
    }

}
