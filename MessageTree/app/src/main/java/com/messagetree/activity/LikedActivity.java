package com.messagetree.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.messagetree.R;
import com.messagetree.model.BadgeNumber;
import com.messagetree.tree.BadgeNumberTreeManager;

/**
 * 查看被赞的页面
 */
public class LikedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liked);

        BadgeNumberTreeManager.getInstance().clearBadgeNumber(BadgeNumber.TYPE_LIKED, null);
    }
}
