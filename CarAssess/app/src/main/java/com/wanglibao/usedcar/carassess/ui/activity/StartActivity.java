package com.wanglibao.usedcar.carassess.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wanglibao.usedcar.carassess.ui.BaseActivity;

/**
 * 启动activity
 */
public class StartActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rlTitle.setVisibility(View.GONE);


    }
}
