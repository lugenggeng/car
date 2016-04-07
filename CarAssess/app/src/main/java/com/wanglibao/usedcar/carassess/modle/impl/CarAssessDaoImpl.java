package com.wanglibao.usedcar.carassess.modle.impl;

import android.content.Context;

import com.wanglibao.usedcar.carassess.modle.Car;
import com.wanglibao.usedcar.carassess.modle.db.BaseDao;

/**
 * Created by lugg on 2016/4/6.
 */
public class CarAssessDaoImpl  extends BaseDao<Car,String>{

    public CarAssessDaoImpl(Context context, Class<Car> clazz) {
        super(context, clazz);
    }


}
