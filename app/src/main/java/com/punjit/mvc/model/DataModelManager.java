package com.punjit.mvc.model;

/**
 * Created by vipulkanade on 9/6/15.
 */
public class DataModelManager {

    private static DataModelManager mInstance;
    private static final Object obj = new Object();

    public DataModelManager() {
    }

    public static DataModelManager getInstance() {
        synchronized (obj) {
            if(mInstance == null)
                mInstance = new DataModelManager();
        }
        return mInstance;
    }
}
