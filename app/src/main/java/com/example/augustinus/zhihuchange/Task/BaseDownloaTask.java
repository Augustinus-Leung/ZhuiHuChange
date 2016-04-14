package com.example.augustinus.zhihuchange.Task;

import android.os.AsyncTask;
import android.text.Html;

/**
 * Created by augustinus on 16/4/11.
 */
public abstract class BaseDownloaTask<Paramas,Progress,Result> extends AsyncTask<Paramas,Progress,Result> {
    protected String decodeHtml(String in) {
        return Html.fromHtml(Html.fromHtml(in).toString()).toString();
    }
}
