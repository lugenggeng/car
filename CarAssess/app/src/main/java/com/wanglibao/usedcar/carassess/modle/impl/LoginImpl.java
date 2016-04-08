package com.wanglibao.usedcar.carassess.modle.impl;

import android.widget.EditText;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;


/**
 * Created by lugg on 2016/4/7.
 */
public class LoginImpl {


    public static void login(String phone,String password, Callback callback){
        callback.onResponse(null);
//        OkHttpUtils.get().url("").addParams("","").addParams("","").build().execute(callback);

    }

    public static boolean whetherLogin(){
        return true;
    }
}
