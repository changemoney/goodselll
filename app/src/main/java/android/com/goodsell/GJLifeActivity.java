package android.com.goodsell;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;


public class GJLifeActivity extends GJActivity {
    public interface a {
        void onHttp(boolean arg1);
    }

    public interface b {
        void onHttp(String arg1);
    }

    public static final int LOGIN_USER_LOCK = 100;
    protected Activity mActivity;
    private volatile boolean mApplicationUpdateChecking;
    protected Context mContext;

    public GJLifeActivity() {
        super();
//        if(Boolean.FALSE.booleanValue()) {
//            System.out.println(DontPreverify.class);
//        }
    }

//    public void callPhone(GJMessagePost arg1) {
//    }

    public String getGanJiPaymentUrl() {
        return "https://sta.ganji.com/ng/app/client/common/index.html#app/pay/client/view/recharge.js";
    }

    public static void getPoints(Context arg3, String arg4, a arg5) {
//        if(com.ganji.android.comp.g.a.a()) {
//            com.ganji.android.c.c.b v0 = new com.ganji.android.c.c.b();
//            v0.a(com.ganji.android.comp.common.e$b.a + "/api/common/shop/usercredit/" + c.d() + "/");
//            v0.b("POST");
//            v0.b("task_id", arg4);
//            com.ganji.android.comp.b.a.c(v0);
//            v0.a(new e(arg3, arg5, arg4) {
//                private void a(Context arg6, JSONObject arg7) {
//                    String v2 = arg7.optString("message");
//                    Toast toast = new Toast(arg6.getApplicationContext());
//                    toast.setDuration(1);
//                    View v0 = LayoutInflater.from(arg6).inflate(R.layout.point_show_toast, null);
//                    ((ViewGroup)v0).findViewById(R.id.pointNum).setText(((CharSequence)v2));
//                    toast.setView(v0);
//                    toast.show();
//                    ((ViewGroup)v0).findViewById(R.id.coin).startAnimation(AnimationUtils.loadAnimation(arg6, 2134114407));
//                }
//
//                static void a(com.ganji.android.control.GJLifeActivity$1 arg0, Context arg1, JSONObject arg2) {
//                    arg0.a(arg1, arg2);
//                }
//
//                public void onComplete(com.ganji.android.c.c.b arg6, d arg7) {
//                    if(this.a == null) {
//                        if(this.b == null) {
//                            return;
//                        }
//
//                        this.b.onHttp(false);
//                        return;
//                    }
//
//                    String v0 = j.c(arg7.c());
//                    try {
//                        JSONObject v1 = new JSONObject(v0);
//                        if(v1.getInt("code") != 0) {
//                            if(this.b == null) {
//                                return;
//                            }
//
//                            this.b.onHttp(false);
//                            return;
//                        }
//
//                        if(v1.optJSONObject("data") == null) {
//                            return;
//                        }
//
//                        if("0".equalsIgnoreCase(new LocalStorage().get("subscribe_checked"))) {
//                            if(this.b == null) {
//                                return;
//                            }
//
//                            this.b.onHttp(false);
//                            return;
//                        }
//
//                        HashMap v0_2 = new HashMap();
//                        v0_2.put("积分任务编号", this.c);
//                        m.a(this.a, "jifen_toast_showtimes", v0_2);
//                        com.ganji.android.comp.g.a.b(c.d(), new com.ganji.android.comp.utils.b(v1) {
//                            public void a(com.ganji.android.comp.utils.d arg4) {
//                                if(this.b.b != null) {
//                                    this.b.b.onHttp(true);
//                                    if((TextUtils.equals(this.b.c, "3")) && ((this.b.a instanceof Activity))) {
//                                        this.b.a.runOnUiThread(new Runnable() {
//                                            public void run() {
//                                                com.ganji.android.control.GJLifeActivity$1.a(this.a.b, this.a.b.a, this.a.a);
//                                            }
//                                        });
//                                    }
//                                }
//
//                                if((arg4.a) && ((this.b.a instanceof Activity))) {
//                                    this.b.a.sendBroadcast(new Intent("com.ganji.android.action.ACTION_USER_INFO_FETCHED"));
//                                }
//                            }
//
//                            public void onComplete(Object arg1) {
//                                this.a(((com.ganji.android.comp.utils.d)arg1));
//                            }
//                        });
//                        if(TextUtils.equals(this.c, "3")) {
//                            return;
//                        }
//
//                        this.a(this.a, v1);
//                    }
//                    catch(JSONException v0_1) {
//                        if(this.b != null) {
//                            this.b.onHttp(false);
//                        }
//
//                        com.ganji.android.c.f.a.a(((Throwable)v0_1));
//                    }
//                }
//            });
//            com.ganji.android.c.c.c.a().a(v0);
//        }
    }

    public static void getShopMsg(String arg3, String arg4, b arg5) {
//        String v0;
//        com.ganji.android.c.c.b v1 = new com.ganji.android.c.c.b();
//        StringBuilder v2 = new StringBuilder().append(com.ganji.android.comp.common.e$b.a).append("/api/common/shop/duiba/");
//        if(com.ganji.android.comp.g.a.a()) {
//            v0 = c.d();
//        }
//        else {
//            Integer v0_1 = Integer.valueOf(0);
//        }
//
//        v1.a(v2.append(v0).append("/").toString());
//        v1.b("GET");
//        v1.b("type", arg3);
//        if(!TextUtils.isEmpty(((CharSequence)arg4)) && ("3".equals(arg3))) {
//            v1.b("redirect", arg4);
//        }
//
//        com.ganji.android.comp.b.a.c(v1);
//        v1.a(new e(arg5) {
//            public void onComplete(com.ganji.android.c.c.b arg4, d arg5) {
//                String v0 = j.c(arg5.c());
//                try {
//                    JSONObject v1 = new JSONObject(v0);
//                    if(v1.getInt("code") != 0) {
//                        if(this.a == null) {
//                            return;
//                        }
//
//                        this.a.onHttp("");
//                        return;
//                    }
//
//                    JSONObject v0_2 = v1.optJSONObject("data");
//                    if(v0_2 == null) {
//                        return;
//                    }
//
//                    this.a.onHttp(v0_2.optString("duibaUrl"));
//                }
//                catch(JSONException v0_1) {
//                    if(this.a != null) {
//                        this.a.onHttp("");
//                    }
//
//                    com.ganji.android.c.f.a.a(((Throwable)v0_1));
//                }
//            }
//        });
//        com.ganji.android.c.c.c.a().a(v1);
    }

    public int getStatusBarHeight() {
        int v0 = 0;
        int v1 = this.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if(v1 > 0) {
            v0 = this.getResources().getDimensionPixelSize(v1);
        }

        return v0;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mActivity = this;
        this.mContext = this.getApplicationContext();
    }

    protected void onDestroy() {
        super.onDestroy();
        //移除指定的activity
        //String v0 = this.getClass().getName();
        //com.ganji.android.c.a.remove(v0.substring(v0.lastIndexOf(".") + 1));
    }

    public void requestCheckVersion(boolean arg2) {
        //检查版本
       // new i(((GJActivity)this)).a(arg2);
    }
}

