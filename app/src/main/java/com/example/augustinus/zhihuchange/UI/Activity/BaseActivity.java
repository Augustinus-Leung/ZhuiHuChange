package com.example.augustinus.zhihuchange.UI.Activity;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.augustinus.zhihuchange.R;

/**
 * Created by Augustinus on 2016/4/8.
 */
public class BaseActivity extends AppCompatActivity{
    private CoordinatorLayout coordinatorLayout;
    protected Toolbar toolbar;
    protected int layoutResID= R.layout.activity_base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutResID);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        coordinatorLayout= (CoordinatorLayout) findViewById(R.id.coordinator_layout);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showSnackbar(int resId){
        Snackbar.make(coordinatorLayout,resId,Snackbar.LENGTH_SHORT).show();
    }
}
