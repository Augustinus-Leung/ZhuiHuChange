package com.example.augustinus.zhihuchange.UI.Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;

import com.example.augustinus.zhihuchange.Bean.DailyNews;
import com.example.augustinus.zhihuchange.Task.BaseGetNewsTask;

import java.util.List;

/**
 * Created by Augustinus on 2016/4/8.
 */
public class NewsListFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener,BaseGetNewsTask.UpdateUIListener{
    @Override
    public void onRefresh() {

    }

    @Override
    public void beforeTaskStart() {

    }

    @Override
    public void afterTaskFinished(List<DailyNews> resultList, boolean isRefreshSuccess, boolean isContentSame) {

    }
}
