package com.xzh.kingtv.mvp.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.xzh.kingtv.Constants;
import com.xzh.kingtv.R;

import butterknife.BindView;
import butterknife.OnClick;



public class FollowFragment extends SimpleFragment {

    @BindView(R.id.ivLeft)
    ImageView ivLeft;
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.ivRight)
    ImageView ivRight;
    @BindView(R.id.tvLogin)
    TextView tvLogin;

    public static FollowFragment newInstance() {

        Bundle args = new Bundle();

        FollowFragment fragment = new FollowFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_follow;
    }

    @Override
    public void initUI() {
        tvTitle.setText(R.string.tab_follw);
    }

    @Override
    public void initData() {

    }

    @OnClick({R.id.ivLeft, R.id.ivRight, R.id.tvLogin})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivLeft:
                startActivity(getFragmentIntent(Constants.SEARCH_FRAGMENT));
                break;
            case R.id.ivRight:
                startLogin();
                break;
            case R.id.tvLogin:
                startLogin();
                break;
        }
    }
}
