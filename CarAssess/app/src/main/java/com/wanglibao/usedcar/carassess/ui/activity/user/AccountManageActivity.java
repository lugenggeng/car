package com.wanglibao.usedcar.carassess.ui.activity.user;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wanglibao.usedcar.carassess.R;
import com.wanglibao.usedcar.carassess.ui.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 账号管理
 */
public class AccountManageActivity extends BaseActivity {

    @Bind(R.id.tv_account_manage_name_labal)
    TextView tvName;
    @Bind(R.id.tv_account_manage_department)
    TextView tvDepartment;
    @Bind(R.id.tv_acouunt_manage_phone)
    TextView tvPhone;
    @Bind(R.id.tv_account_manage_forgetPassword)
    TextView tvForgetPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_manage);
        ButterKnife.bind(this);
        tvTitle.setText("账户管理");

        addViewClicklistener(tvBack,tvForgetPassword);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.tv_account_manage_forgetPassword:
                startActivity(new Intent(this,ModifyPasswordActivity.class));
                break;
        }
    }
}
