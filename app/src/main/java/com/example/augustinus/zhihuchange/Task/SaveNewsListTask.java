package com.example.augustinus.zhihuchange.Task;

import android.os.AsyncTask;

import com.example.augustinus.zhihuchange.Bean.DailyNews;
import com.example.augustinus.zhihuchange.Support.Constants;
import com.example.augustinus.zhihuchange.ZhihuDailyChangeApplication;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by augustinus on 16/4/14.
 */
public class SaveNewsListTask extends AsyncTask<Void,Void,Void> {
    private String date;
    private List<DailyNews> newsList;

    public SaveNewsListTask(String date,List<DailyNews> newsList){
        this.date=date;
        this.newsList=newsList;
    }
    @Override
    protected Void doInBackground(Void... voids) {
        saveNewsList(newsList);
        return null;
    }

    private void saveNewsList(List<DailyNews> newsList){
        ZhihuDailyChangeApplication.getDataSource().insertOrUpdateNewsList(
                date,
                new GsonBuilder().create().toJson(newsList, Constants.Type.newsListType));
    }
}
