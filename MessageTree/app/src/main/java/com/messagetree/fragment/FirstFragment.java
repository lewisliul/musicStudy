package com.messagetree.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.messagetree.R;
import com.messagetree.model.BadgeNumber;
import com.messagetree.tree.BadgeNumberTreeManager;

/**
 * Tab第一个页面
 */

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getView().findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //清除Badge Numbers
                BadgeNumberTreeManager.getInstance().clearBadgeNumber(BadgeNumber.TYPE_X1, null);
                BadgeNumberTreeManager.getInstance().clearBadgeNumber(BadgeNumber.TYPE_X2, null);
                BadgeNumberTreeManager.getInstance().clearBadgeNumber(BadgeNumber.TYPE_X3, null);
                BadgeNumberTreeManager.getInstance().clearBadgeNumber(BadgeNumber.TYPE_X4, null);
                BadgeNumberTreeManager.getInstance().clearBadgeNumber(BadgeNumber.TYPE_X5, null);
            }
        });
    }
}
