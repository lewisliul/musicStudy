package com.messagetree.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.messagetree.R;
import com.messagetree.model.BadgeNumber;
import com.messagetree.tree.BadgeNumberTreeManager;

/**
 * 查看评论的页面
 */
public class CommentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        BadgeNumberTreeManager.getInstance().clearBadgeNumber(BadgeNumber.TYPE_COMMENT, null);
    }
}
