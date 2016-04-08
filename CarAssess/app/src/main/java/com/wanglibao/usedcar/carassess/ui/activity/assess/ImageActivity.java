package com.wanglibao.usedcar.carassess.ui.activity.assess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wanglibao.usedcar.carassess.R;

/**
 * 图片activity,证件照和车辆图片 都用此一个activity
 */
public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }
}
