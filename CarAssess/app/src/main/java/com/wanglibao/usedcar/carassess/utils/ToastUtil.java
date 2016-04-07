package com.wanglibao.usedcar.carassess.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.wanglibao.usedcar.carassess.MyApplication;


/**
 * Created by ybli on 2015/6/3.
 */
public class ToastUtil {

	private static Toast toast;
        /**
         *
         * @param context  The Class's context , where  want to use this tool
         * @param message  The message will be show
         */
        public static Toast createNormalToast(Context context ,String message){
        	if (toast == null) {
        		toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
			}else{
				toast.setText(message);
				toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
			}
            return toast;
        }
        
        public static Toast createLongToast(Context context ,String message){
        	if (toast == null) {
        		toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
			}else{
				toast.setText(message);
				toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
			}
            return toast;
        }

    public static Toast createNormalToast(String message) {
        return createNormalToast(MyApplication.getContext(),message);
    }
}
