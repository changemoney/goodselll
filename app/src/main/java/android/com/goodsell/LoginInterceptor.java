package android.com.goodsell;


import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.widget.Toast;

public class LoginInterceptor {


    /**
     * 判断处理
     *
     * @param ctx
     *            当前activity的上下文
     * @param target
     *            目标activity的target
     * @param intent
     *            目标activity
     *
     */
    public static void interceptor(Context ctx, String target, Bundle bundle, Intent intent) {
        if (target != null && target.length() > 0) {
            //LoginCarrier invoker = new LoginCarrier(target, bundle);
            if (getLogin()) {
                //invoker.invoke(ctx);
            } else {
                if (intent == null) {
                    //intent = new Intent(ctx, LoginActivity.class);
                }
                //login(ctx, invoker, intent);
            }
        } else {
            Toast.makeText(ctx, "没有activity可以跳转", Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * 登录判断
     *
     * @param ctx
     *            当前activity的上下文
     * @param target
     *            目标activity的target
     */
    public static void interceptor(Context ctx, String target, Bundle bundle) {
        interceptor(ctx, target, bundle, null);
    }

    // 这里获取登录状态，具体获取方法看项目具体的判断方法
    private static boolean getLogin() {
        return true;//MainActivity.is_login;
    }

//    private static void login(Context context, LoginCarrier invoker, Intent intent) {
//        intent.putExtra(mINVOKER, invoker);
//        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        context.startActivity(intent);
//    }

    public boolean a(int arg2, int arg3, Intent arg4) {
        return false;
    }

    public void a(Fragment arg1) {
    }

    public boolean a(Configuration arg2) {
        return false;
    }

    public void a(Bundle arg1) {
    }

    public boolean a(int arg2, KeyEvent arg3) {
        return false;
    }

    public boolean a(Intent arg2) {
        return false;
    }

}
