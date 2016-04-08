package com.wanglibao.usedcar.carassess.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wanglibao.usedcar.carassess.ui.BaseActivity;
import com.wanglibao.usedcar.carassess.ui.activity.user.LoginActivity;

import butterknife.ButterKnife;

/**
 * 启动activity
 */
public class StartActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}
