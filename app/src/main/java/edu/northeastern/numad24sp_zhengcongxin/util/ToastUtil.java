package edu.northeastern.numad24sp_zhengcongxin.util;


import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static Toast mToast; //别的package地方要用，改成public

    public static void showMsg(Context context, String msg){
        if(mToast == null){ //如果为空，做一个出来
            mToast = Toast.makeText(context,msg,Toast.LENGTH_SHORT);
        }else{
            mToast.setText(msg);
        }
        mToast.show(); //函数之内show，才能引用method，函数之外是定义
    }
    //mToast.show();错
}
