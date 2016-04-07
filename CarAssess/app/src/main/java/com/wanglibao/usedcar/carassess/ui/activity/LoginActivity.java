package com.wanglibao.usedcar.carassess.ui.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.wanglibao.usedcar.carassess.R;
import com.wanglibao.usedcar.carassess.modle.impl.LoginImpl;
import com.wanglibao.usedcar.carassess.ui.BaseActivity;
import com.wanglibao.usedcar.carassess.utils.ToastUtil;
import com.zhy.http.okhttp.callback.Callback;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Response;

public class LoginActivity extends BaseActivity {

    @Bind(R.id.edit_login_phone)
    EditText editPhone;
    @Bind(R.id.edit_login_password)
    EditText editPassword;
    @Bind(R.id.btn_login_login)
    Button btnLogin;
    @Bind(R.id.tv_login_loginFailed)
    TextView tvLoginFailed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initView();
        ToastUtil.createNormalToast(this,"");
    }

    private void initView() {
        rlTitle.setVisibility(View.GONE);
        addViewClicklistener(btnLogin,tvLoginFailed);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.btn_login_login:
                String phone = editPhone.getText().toString().trim();
                String password = editPassword.getText().toString().trim();
                if (!TextUtils.isEmpty(phone) && !TextUtils.isEmpty(password)){
                    LoginImpl.login(phone, password, new Callback() {
                        @Override
                        public Object parseNetworkResponse(Response response) throws Exception {
                            return null;
                        }

                        @Override
                        public void onError(Call call, Exception e) {

                        }

                        @Override
                        public void onResponse(Object response) {
                            ToastUtil.createNormalToast(LoginActivity.this,"登录成功");
                        }
                    });
                }else{
                    ToastUtil.createNormalToast(this,"手机号和密码不能为空");
                }
                break;
            case R.id.tv_login_loginFailed:

                break;
        }
    }

}
