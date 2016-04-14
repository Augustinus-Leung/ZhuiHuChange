package com.example.augustinus.zhihuchange;

import android.app.Application;
import android.content.Context;

import com.example.augustinus.zhihuchange.DB.DailyNewsDataSource;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

/**
 * Created by augustinus on 16/4/14.
 */
public class ZhihuDailyChangeApplication extends Application{
    private static ZhihuDailyChangeApplication applicationContext;
    private static DailyNewsDataSource dataSource;
    public static void initImageLoader(Context context) {
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                .denyCacheImageMultipleSizesInMemory()
                .threadPriority(Thread.NORM_PRIORITY - 2)
                .diskCacheFileNameGenerator(new Md5FileNameGenerator())
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .build();
        ImageLoader.getInstance().init(config);
    }

    public static ZhihuDailyChangeApplication getInstance() {
        return applicationContext;
    }

    public static DailyNewsDataSource getDataSource() {
        return dataSource;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = this;

        initImageLoader(getApplicationContext());
        dataSource = new DailyNewsDataSource(getApplicationContext());
        dataSource.open();
    }
}
