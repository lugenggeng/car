package com.wanglibao.usedcar.carassess.modle.impl;

import android.content.Context;

import com.wanglibao.usedcar.carassess.modle.db.BaseDao;
import com.wanglibao.usedcar.carassess.modle.CarAssess;

/**
 * Created by lugg on 2016/4/6.
 */
public class CarAssessDaoImpl  extends BaseDao<CarAssess,String>{

    public CarAssessDaoImpl(Context context, Class<CarAssess> clazz) {
        super(context, clazz);
    }


}
