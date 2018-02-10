package com.muzi.weex;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
* 注意要在Manifest中设置android:name=".WXApplication"
* 要实现ImageAdapter 否则图片不能下载
* gradle 中一定要添加一些依赖，否则初始化会失败。
* compile 'com.android.support:recyclerview-v7:xxx'
* compile 'com.android.support:support-v4:xxx'
* compile 'com.android.support:appcompat-v7:xxx'
* compile 'com.alibaba:fastjson:xxx'
*/
public class WXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        InitConfig config = new InitConfig.Builder().setImgAdapter(new WeeXImageAdapter()).build();
        WXSDKEngine.initialize(this,config);
    }
}
