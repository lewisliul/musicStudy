package com.messagetree.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.messagetree.R;
import com.messagetree.activity.CommentActivity;
import com.messagetree.activity.LikedActivity;
import com.messagetree.activity.SysMsgActivity;

/**
 *Tab第二个页面
 */

public class SecondFragment extends Fragment {
    private TextView commentBadgeCount;
    private ImageView commentBadgeDot;
    private TextView likedBadgeCount;
    private ImageView likedBadgeDot;
    private TextView sysmsgBadgeCount;
    private ImageView sysmsgBadgeDot;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.second_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getView().findViewById(R.id.comment_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CommentActivity.class));
            }
        });

        getView().findViewById(R.id.liked_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LikedActivity.class));
            }
        });

        getView().findViewById(R.id.sysmsg_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SysMsgActivity.class));
            }
        });


        commentBadgeCount = (TextView) getView().findViewById(R.id.comment_badge_count);
        likedBadgeCount = (TextView) getView().findViewById(R.id.liked_badge_count);
        sysmsgBadgeCount = (TextView) getView().findViewById(R.id.sysmsg_badge_count);

        commentBadgeDot = (ImageView) getView().findViewById(R.id.comment_badge_dot);
        likedBadgeDot = (ImageView) getView().findViewById(R.id.liked_badge_dot);
        sysmsgBadgeDot = (ImageView) getView().findViewById(R.id.sysmsg_badge_dot);
    }

    @Override
    public void onResume() {
        super.onResume();
        refreshBadgeNumbers();
    }

    public void refreshBadgeNumbers() {
        refreshCommentBadgeNumber();
        refreshLikedBadgeNumber();
        refreshSysmsgBadgeNumber();
    }

    private void refreshCommentBadgeNumber() {

    }

    private void refreshLikedBadgeNumber() {

    }

    private void refreshSysmsgBadgeNumber() {

    }
}
