package com.alguojian.bugly;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;

/**
 * ${DESCRIPTION}
 *
 * @author ALguojian
 * @date 2017/12/20
 */


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Bugly.init(this,"70190c8e56",true);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // you must install multiDex whatever tinker is installed!
        MultiDex.install(base);

        // 安装tinker
        Beta.installTinker();
    }

}
