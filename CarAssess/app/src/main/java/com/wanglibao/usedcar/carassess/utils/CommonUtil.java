package com.wanglibao.usedcar.carassess.utils;

import android.content.Context;

import java.util.Random;

/**
 * Created by lugg on 2016/4/5.
 * 常用的一些方法 集成的util类
 */
public class CommonUtil {
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 获取从0-count之间的随机数
     * @param count 最大值
     * @return 随机数
     */
    public static int randomIndex(int count){
        Random random = new Random();
        return random.nextInt(count);
    }
}
