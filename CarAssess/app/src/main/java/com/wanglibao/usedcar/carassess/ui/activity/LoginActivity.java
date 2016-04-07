package com.wanglibao.usedcar.carassess.ui.activity;

import android.os.Bundle;
import android.view.View;

import com.wanglibao.usedcar.carassess.R;
import com.wanglibao.usedcar.carassess.modle.impl.CarAssessDaoImpl;
import com.wanglibao.usedcar.carassess.modle.CarAssess;
import com.wanglibao.usedcar.carassess.ui.BaseActivity;
import com.wanglibao.usedcar.carassess.utils.ToastUtil;

import java.sql.Date;

import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        addViewClicklistener(tvBack, tvRight);
        tvTitle.setText("登录");
        setRightText("注册");
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.tv_commonTitle_right:
                ToastUtil.createNormalToast(this,"注册");
                break;
        }
    }
}
