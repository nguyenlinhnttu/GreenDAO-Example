package com.android.greendao;

import android.app.Application;

import com.android.greendao.model.DaoMaster;
import com.android.greendao.model.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by nguyenvanlinh on 12/26/17.Dao
 */

public class MyApplication extends Application {
    private DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"notes-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}