package com.wanglibao.usedcar.carassess.ui.activity.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.wanglibao.usedcar.carassess.R;
import com.wanglibao.usedcar.carassess.ui.BaseActivity;
import com.wanglibao.usedcar.carassess.utils.ToastUtil;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 修改密码
 */
public class ModifyPasswordActivity extends BaseActivity {

    @Bind(R.id.edit_modify_password_oldPassword)
    EditText editOldPassword;
    @Bind(R.id.edit_modify_password_newPassword)
    EditText editNewPassword;
    @Bind(R.id.edit_modify_password_newPassword_again)
    EditText editNewPasswordAgain;
    @Bind(R.id.btn_modify_password_submit)
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_password);
        ButterKnife.bind(this);
        tvTitle.setText("修改密码");
        addViewClicklistener(btnSubmit,tvBack);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.btn_modify_password_submit:
                String oldPass = editOldPassword.getText().toString();
                String newPass = editNewPassword.getText().toString();
                String newPassAgain = editNewPasswordAgain.getText().toString();
                if(!TextUtils.isEmpty(oldPass) && !TextUtils.isEmpty(newPass) && !TextUtils.isEmpty(newPassAgain)){
                    if(newPass.equals(newPassAgain)){
                        //TODO
                    }else{
                        ToastUtil.createNormalToast(this,"两次密码不相同");
                    }
                }else{
                    ToastUtil.createNormalToast(this,"信息不完整");
                }
                break;
        }
    }
}
