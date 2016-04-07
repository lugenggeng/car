package com.wanglibao.usedcar.carassess.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import com.wanglibao.usedcar.carassess.MyApplication;
import com.wanglibao.usedcar.carassess.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lugg on 2016/4/5.
 */
public class BaseActivity extends Activity implements View.OnClickListener{

    MyApplication myApplication;

    @Bind(R.id.tv_commonTitle_title)
    public TextView tvTitle;

    @Bind(R.id.tv_commonTitle_back)
    public TextView tvBack;

    @Bind(R.id.tv_commonTitle_right)
    public TextView tvRight;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        myApplication = (MyApplication) getApplication();
        myApplication.addActivity(this);

    }

    public void setRightText(String text){
        tvRight.setText(text);
        tvRight.setVisibility(View.VISIBLE);
    }

    public void addViewClicklistener(View... views){
        for (int i = 0; i < views.length; i++){
            views[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_commonTitle_back){
            onBackPressed();
        }
    }
}
