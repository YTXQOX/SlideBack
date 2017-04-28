package com.ljstudio.android.slideback.sample;

import android.app.Activity;

import java.util.LinkedList;


public class ActivityTaskConfig {

    public static LinkedList<Activity> activitiesTasks = new LinkedList<>();
    public static void addActivity(Activity activity) {
        activitiesTasks.add(activity);
    }
    public static void removeActivity(Activity activity) {
        activitiesTasks.remove(activity);
    }


    public static Activity getBeforeLastActivity() {
        if (activitiesTasks.size() < 2) {
            return null;
        }
        return activitiesTasks.get(activitiesTasks.size() - 2);
    }
}
