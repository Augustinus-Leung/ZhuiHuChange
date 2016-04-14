package com.example.augustinus.zhihuchange.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Augustinus on 2016/4/8.
 */
public class MainPagerAdapter extends FragmentStatePagerAdapter {
    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Bundle bundle=new Bundle();
        Fragment newFragment = new NewsLis
    }

    @Override
    public int getCount() {
        return 0;
    }
}
