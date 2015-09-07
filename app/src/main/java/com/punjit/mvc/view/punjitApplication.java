package com.punjit.mvc.view;

import android.app.Application;

/**
 * Created by vipulkanade on 9/6/15.
 */
public class punjitApplication extends Application {

    public static final String TAG = punjitApplication.class.getName();

    private static Application mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    /**
     *
     * @return punjit Application context
     */
    public synchronized static Application getInstance() {
        return mInstance;
    }

}
