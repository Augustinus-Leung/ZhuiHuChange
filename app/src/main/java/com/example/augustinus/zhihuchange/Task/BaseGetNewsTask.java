package com.example.augustinus.zhihuchange.Task;

import android.app.ListActivity;
import android.os.AsyncTask;

import com.example.augustinus.zhihuchange.Bean.DailyNews;
import com.example.augustinus.zhihuchange.ZhihuDailyChangeApplication;

import java.util.List;

/**
 * Created by Augustinus on 2016/4/8.
 */
public abstract class BaseGetNewsTask extends BaseDownloaTask<Void,Void,List<DailyNews>>{

    protected boolean isRefreshSuccess = true;
    protected boolean isContentSame = false;
    protected String date;

    private UpdateUIListener mListener;

    public BaseGetNewsTask(String date,UpdateUIListener callback){
        this.date=date;
        this.mListener=callback;
    }

    protected void onPreExecute(){mListener.beforeTaskStart();}

    protected void onPostExecute(List<DailyNews> resultNewsList){
        if (isRefreshSuccess && !isContentSame){
            for (DailyNews news : resultNewsList){
                news.setDate(date);
            }


            new SaveNewsListTask(date, resultNewsList).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        }

        if (mListener != null) {
            mListener.afterTaskFinished(resultNewsList, isRefreshSuccess, isContentSame);
        }

        mListener = null;
    }

    protected boolean checkIsContentSame(List<DailyNews> externalNewsList) {
        return externalNewsList.equals(ZhihuDailyChangeApplication.getDataSource().newsOfTheDay(date));
    }

    public interface UpdateUIListener {
        void beforeTaskStart();

        void afterTaskFinished(List<DailyNews> resultList, boolean isRefreshSuccess, boolean isContentSame);
    }
}
