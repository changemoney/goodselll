package android.com.goodsell;

import android.os.Bundle;

public class GJActivity extends BaseActivity {
    public static final String EXTRA_CLOSE_ANIM_IN = "extra_close_anim_in";
    public static final String EXTRA_CLOSE_ANIM_OUT = "extra_close_anim_out";
    public static final String EXTRA_OPEN_ANIM_IN = "extra_open_anim_in";
    public static final String EXTRA_OPEN_ANIM_OUT = "extra_open_anim_out";

    public GJActivity() {
        super();
//        if(Boolean.FALSE.booleanValue()) {
//            System.out.println(DontPreverify.class);
//        }
    }

      //拦截器
//    public h getInterceptor() {
//        return this.mActivityInterceptor;
//    }
//
//    public boolean isApplicationStopedUnexpectedly() {
//        return this.getInterceptor().c;
//    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(bundle);
    }
}

