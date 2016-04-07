package com.wanglibao.usedcar.carassess;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lugg on 2016/4/5.
 */
public class MyApplication extends Application{

    private static Context context;

    public List<Activity> activityList = new LinkedList<Activity>();
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }

    public void exit() {
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.cancelAll();
        for (Activity activity : activityList) {
            activity.finish();
        }
        System.exit(0);
    }

    public void addActivity(Activity activity){
        activityList.add(activity);
    }
}
