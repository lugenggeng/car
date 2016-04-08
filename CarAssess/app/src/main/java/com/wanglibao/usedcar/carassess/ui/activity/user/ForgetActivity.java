package com.wanglibao.usedcar.carassess.ui.activity.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.wanglibao.usedcar.carassess.R;
import com.wanglibao.usedcar.carassess.ui.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 忘记密码
 */
public class ForgetActivity extends BaseActivity {

    @Bind(R.id.edit_forget_phone)
    EditText editPhone;

    @Bind(R.id.edit_forget_newPassword)
    EditText editNewPassword;

    @Bind(R.id.edit_forget_verifyCode)
    EditText editVerifyCode;

    @Bind((R.id.btn_forget_getCerifyCode))
    Button btnGetVerifyCode;

    @Bind(R.id.btn_forget_submit)
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        ButterKnife.bind(this);
        tvTitle.setText("忘记密码");
        addViewClicklistener(btnGetVerifyCode,btnSubmit,tvBack);

    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.btn_forget_getCerifyCode:

                break;
            case R.id.btn_forget_submit:

                break;
        }
    }
}
