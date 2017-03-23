package com.sh3h.myatlas;


import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("APP","MyApplication on create");
    }
}

