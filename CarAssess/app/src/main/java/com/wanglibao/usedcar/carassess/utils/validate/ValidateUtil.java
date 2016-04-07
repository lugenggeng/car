package com.wanglibao.usedcar.carassess.utils.validate;

/**
 * Created by ybli on 2015/7/22.
 */
public class ValidateUtil {

    public static final String NET_ERROR_MSG = "网络异常，请检查网络设置是否正确";

    public static final String UN_AUTHORIZED_MSG = "操作需要登录，请先登录";

    public static final String SERVER_ERROR_MSG = "服务器繁忙，请稍后重试";

    public static final String LOGOUT_CONFIRM = "再按一次退出程序";

    /**
     * 网络请求不通或者服务器请求地址不存在
     */
    public static final String NET_COMM_ERROR_MSG = "网络请求异常，无法连接服务器，请稍后重试";

    public static final String SERVICE_ADDR_EMPTY = "服务地址为空，请点击左上方选择服务地址";
    public static final String SERVICE_TIME_EMPTY = "服务时间为空，请点击右上方选择服务时间";


    // 350,404,500,


    /**
     * 空字段提示
     * @param fielName
     * @return
     */
    public static String emptyPrompt(String fielName) {
        return fielName + "不能为空";
    }
}
