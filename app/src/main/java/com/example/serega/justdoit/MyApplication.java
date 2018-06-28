package com.example.serega.justdoit;

import android.app.Application;

/**
 * Created by Serega on 12.06.2018.
 */

public class MyApplication extends Application {

    private static boolean activityVisible;

    public static boolean isActivityVisible() {
        return activityVisible;
    }

    public static void activityResumed() {
        activityVisible = true;
    }

    public static void activityPaused() {
        activityVisible = false;
    }
}
