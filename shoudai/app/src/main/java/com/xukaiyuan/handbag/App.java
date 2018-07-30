package com.xukaiyuan.handbag;


import android.app.Application;

import com.lzy.okgo.OkGo;
import com.vondear.rxtools.RxUtils;

import org.litepal.LitePalApplication;



public class App extends LitePalApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        RxUtils.init(this);
        OkGo.getInstance().init(this);

    }


}