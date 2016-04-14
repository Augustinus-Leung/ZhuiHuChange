package com.example.augustinus.zhihuchange.UI.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.example.augustinus.zhihuchange.R;
import com.example.augustinus.zhihuchange.UI.Activity.BaseActivity;

import static com.example.augustinus.zhihuchange.R.id.main_pager_tabs;

public class MainActivity extends BaseActivity{

    private static final int PAGE_COUBT=7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        layoutResID= R.layout.activity_main;

        super.onCreate(savedInstanceState);

        TabLayout tabs= (TabLayout) findViewById(main_pager_tabs);
        ViewPager viewPager= (ViewPager) findViewById(R.id.main_pager);
        viewPager.setOffscreenPageLimit(7);


    }
}
