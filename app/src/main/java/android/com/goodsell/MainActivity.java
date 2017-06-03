package android.com.goodsell;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class MainActivity extends BaseActivity {

    class com.ganji.android.control.MainActivity$11 implements a {
        com.ganji.android.control.MainActivity$11(MainActivity activity) {
            this.a = activity;
            super();
        }

    public void a() {
        if(MainActivity.a(this.a) != null) {
            com.ganji.android.comp.city.a.b(MainActivity.a(this.a).a);
        }

        if(MainActivity.c(this.a) != null && (MainActivity.c(this.a).isShowing())) {
            MainActivity.c(this.a).dismiss();
        }

        MainActivity.b(this.a).a(this.a);
    }

    public void b() {
        if(MainActivity.c(this.a) != null && (MainActivity.c(this.a).isShowing())) {
            MainActivity.c(this.a).dismiss();
        }

        new com.ganji.android.comp.c.c$a(this.a).a(1).a("提示").b("加载城市信息失败").a().show();
    }
}

public class TabManager implements TabHost.OnTabChangeListener, TabHost.TabContentFactory {

    private Context mContext;

    public TabManager(Context context) {
        //super();
        mContext = context;
    }

    public View createTabContent(String arg) {
        View view = new View(mContext);
        view.setMinimumWidth(0);
        view.setMinimumHeight(0);
        return view;
    }

    final class FragmentPage {
        private final String name;
        private final Class class;
        private final int c;
        private Fragment fragment;
        private int e;

        FragmentPage(String name, Class class, int arg3, int arg4) {
            super();
            this.name = name;
            this.class = class;
            this.c = arg3;
            this.e = arg4;
        }

        static String getTag(FragmentPage fp) {
            return fp.tag;
        }

        static Fragment getInFragment(FragmentPage fp, Fragment ft) {
            fp.fragment = ft;
            return ft;
        }

        static Fragment getBackFragment(FragmentPage fp) {
            return fp.fragment;
        }

        static int getCount(FragmentPage fp) {
            return fp.c;
        }

        static Class d(FragmentPage fp) {
            return name.class;
        }
    }

    FragmentPage fp;

    private FragmentActivity mFragment;
    private TabHost mTabHost;
    private int count;
    private HashMap mMap;
    //private x f;

    public TabManager(FragmentActivity fragment, TabHost tabHost, int count) {
        super();
        this.mMap = new HashMap();
        this.mFragment = fragment;
        this.mTabHost = tabHost;
        this.count = count;
        this.mTabHost.setOnTabChangedListener(this);
    }

    public void addTab(TabSpec tabSpec, Class arg6, int arg7, int arg8) {
        tabSpec.setContent(new TabManager(mFragment));
        String tag = tabSpec.getTag();
        FragmentPage fm = new FragmentPage(tag, arg6, arg7, arg8);
        FragmentPage.getTag(fm, mFragment.getSupportFragmentManager().findFragmentByTag(tag));
        if (FragmentPage.getInFragment(fm) != null && !FragmentPage.getInFragment(fm).isDetached()) {
            FragmentTransaction ft = mFragment.getSupportFragmentManager().beginTransaction();
            ft.detach(FragmentPage.getInFragment(fm));
            ft.commitAllowingStateLoss();
        }

        mMap.put(tag, fm);
        mTabHost.addTab(tabSpec);
    }

//    public void a(x arg1) {
//        this.f = arg1;
//    }

    static HashMap a(TabManager tm) {
        return tm.e;
    }

    private void a(FragmentPage arg4) {
        if (mMap != null) {
            Iterator v2 = mMap.entrySet().iterator();
            while (v2.hasNext()) {
                Object v0 = v2.next().getValue();
                if (v0 == null) {
                    continue;
                }

                if (FragmentPage.getInFragment(((FragmentPage) v0)) == null) {
                    continue;
                }

                boolean v1 = (((FragmentPage) v0)) == arg4 ? true : false;
                FragmentPage.getInFragment(((FragmentPage) v0)).setUserVisibleHint(v1);
            }
        }
    }

    public void onTabChanged(String tag) {
        MainActivity.a(tag);
        Object v0 = mMap.get(tag);
        if (FragmentPage.getCount(((FragmentPage) v0)) != 3 && fp != v0) {
            FragmentTransaction ft = mFragment.getSupportFragmentManager().beginTransaction();
            if (fp != null) {
                if (FragmentPage.getCount(fp) > FragmentPage.getCount(((FragmentPage) v0))) {
                    ft.setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out);
                } else {
                    ft.setCustomAnimations(R.anim.push_left_in, R.anim.push_left_out);
                }
            }

            if (fp != null && FragmentPage.getInFragment(fp) != null) {
                ft.hide(FragmentPage.getInFragment(fp));
            }

            if (v0 != null) {
                if (FragmentPage.getInFragment(((FragmentPage) v0)) != null && FragmentPage.getInFragment(((FragmentPage) v0)).getView() != null) {
                    ft.show(FragmentPage.getInFragment(((FragmentPage) v0)));
                        goto label_45;
                }

                FragmentPage.getTag(((FragmentPage) v0), Fragment.instantiate(FragmentPage, FragmentPage.d(((FragmentPage) v0)).getName(), null));
                ft.add(count, FragmentPage.getInFragment(((FragmentPage) v0)), FragmentPage.a(((FragmentPage) v0)));
            }

            label_45:
            fp = ((FragmentPage) v0);
            ft.commitAllowingStateLoss();
            mFragment.getSupportFragmentManager().executePendingTransactions();
            this.a(((FragmentPage) v0));
            if (this.f == null) {
                return;
            }

            this.f.onCallback();
        }
    }

}

    public static final String EXTRA_TARGET_TAB = "extra_target_tab";
    public static final int REQUEST_CODE_EXIT = 2;
    public static final String TAB_CATALOG = "catalog";
    public static final String TAB_CENTER = "center";
    public static final String TAB_IM = "im";
    public static final String TAB_NEARBY = "nearby";
    public static final String TAB_PUBLISH = "publish";
    a a;
    private ImageView b;
    private ImageView c;
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private View h;
    private TextView i;
    private ImageView j;
    private View k;
    private Dialog l;
    private Dialog m;
    public static int mRssNewNum;
    public TabHost mTabHost;
    public TabManager mTabManager;
    private ImageView n;
    private HashMap o;
    private HashMap p;
    private com.ganji.android.comp.common.b$a q;
    private s r;
    private m s;
    private ac t;
    public TabWidget tab;
    private Dialog u;
    private com.ganji.android.common.b v;
    private c w;

    public MainActivity() {
        super();
        if(Boolean.FALSE.booleanValue()) {
            System.out.println(DontPreverify.class);
        }

        this.o = new HashMap();
        this.p = new HashMap();
        this.a = new com.ganji.android.control.MainActivity$11(this);
    }

    static Dialog a(MainActivity arg0, Dialog arg1) {
        arg0.u = arg1;
        return arg1;
    }

    static com.ganji.android.common.b a(MainActivity arg0, com.ganji.android.common.b arg1) {
        arg0.v = arg1;
        return arg1;
    }

    static c a(MainActivity arg1) {
        return arg1.w;
    }

    static c a(MainActivity arg0, c arg1) {
        arg0.w = arg1;
        return arg1;
    }

    private void a(Intent intent) {
        String tab = intent.getStringExtra("extra_target_tab");
        this.mTabHost.getCurrentTabTag();
        if(!TextUtils.isEmpty(((CharSequence)tab))) {
            this.mTabHost.setCurrentTabByTag(tab);
            "im".equals(tab);
        }
    }

    private void a(Intent arg4, Vector arg5) {
        this.l = d.a(((Context)this));
        this.l.findViewById(R.id.center_text).setText("请选择应用商店");
        View v0 = this.l.findViewById(R.id.listView);
        ((ListView)v0).setAdapter(new com.ganji.android.lib.ui.c(mContext, arg5));
        ((ListView)v0).setOnItemClickListener(new AdapterView.OnItemClickListener(arg4, arg5) {
            public void onItemClick(AdapterView arg4, View arg5, int arg6, long arg7) {
                Intent intent = new Intent(this.a);
                intent.setPackage(this.b.get(arg6).activityInfo.packageName);
                intent.setClassName(this.b.get(arg6).activityInfo.packageName, this.b.get(arg6).activityInfo.name);
                this.c.startActivity(intent);
                if(MainActivity.e(this.c) != null && (MainActivity.e(this.c).isShowing())) {
                    MainActivity.e(this.c).dismiss();
                }
            }
        });
        this.l.show();
    }

    static void a(MainActivity arg0, Intent arg1) {
        arg0.a(arg1);
    }

    static void a(String arg0) {
        MainActivity.b(arg0);
    }

    private boolean a(int arg3, KeyEvent arg4) {
        Fragment v0 = this.e();
        boolean v0_1 = v0 == null || !(v0 instanceof h) ? false : ((h)v0).a(arg3, arg4);
        return v0_1;
    }

    protected void a() {
        this.m = new com.ganji.android.comp.c.a(((Context)this));
        Window window = this.m.getWindow();
        window.requestFeature(1);
        window.setBackgroundDrawableResource(17170445);
        window.getAttributes().width = -1;
        this.m.setContentView(R.layout.point_shop_dialog);
        this.m.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog(this).dismiss();
                HashMap map = new HashMap();
                if(com.ganji.android.comp.g.a.a()) {
                    map.put("用户登录状态", "已登录");
                }
                else {
                    map.put("用户登录状态", "未登录");
                }

                //com.ganji.android.o.m.a(this.a, "jifen_popup_closetimes", v0);
            }
        });
        View v = this.m.findViewById(R.id.action);
        if(com.ganji.android.comp.g.a.a()) {
            ((TextView)v).setText("去积分商城换奖品");
        }
        else {
            ((TextView)v).setText("登录帐号领取积分");
        }

        ((TextView)v).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg4) {
                Intent intent = new Intent(this.a.mContext, Html5BaseActivity.class);
                intent.putExtra("extra_title", "积分商城");
                intent.putExtra("extra_url", "https://sta.ganji.com/ng/app/client/common/index.html#app/client/app/sm/view/index_page.js");
                this.a.startActivity(v0);
                MainActivity.d(this.a).dismiss();
                HashMap map = new HashMap();
                if(com.ganji.android.comp.g.a.a()) {
                    map.put("用户登录状态", "已登录");
                }
                else {
                    map.put("用户登录状态", "未登录");
                }

                //com.ganji.android.o.m.a(this.a, "jifen_popup_btn_clicktimes", v0_1);
            }
        });
        this.m.show();
        HashMap v0_2 = new HashMap();
        if(com.ganji.android.comp.g.a.a()) {
            v0_2.put("用户登录状态", "已登录");
        }
        else {
            v0_2.put("用户登录状态", "未登录");
        }

        //com.ganji.android.o.m.a(((Context)this), "Jifen_popup_showtimes", v0_2);
    }

    private static void b(String arg4) {
        HashMap map = new HashMap();
        if(com.ganji.android.comp.g.a.a()) {
            String v1 = com.ganji.android.comp.g.c.b();
            String v2 = com.ganji.android.comp.g.c.d();
            if(!com.ganji.android.comp.utils.m.m(v1)) {
                map.put("as", "群聊用户");
            }
            else {
                map.put("as", "平台用户");
            }

            if(com.ganji.android.comp.utils.m.m(v2)) {
                goto label_15;
            }

            map.put("a6", v2);
        }
        else {
            map.put("as", "匿名用户");
        }

        label_15:
        HashMap v1_1 = new HashMap();
        if("catalog".equals(arg4)) {
            v0.put("ai", "分类");
            v1_1.put("am", "分类");
        }
        else if("nearby".equals(arg4)) {
            v0.put("ai", "附近");
            v1_1.put("am", "附近");
        }
        else if("publish".equals(arg4)) {
            v0.put("ai", "发布");
            v1_1.put("am", "发布");
        }
        else if("im".equals(arg4)) {
            v0.put("ai", "群聊");
            v1_1.put("am", "群聊");
        }
        else if("center".equals(arg4)) {
            v0.put("ai", "个人中心");
            v1_1.put("am", "个人中心");
            com.ganji.android.comp.a.a.a("100000000431000100000010");
        }

        com.ganji.android.comp.a.a.a("100000000406003100000010", ((Map)v0));
        v1_1.put("gc", "/all_cate/-/-/-/1000");
        com.ganji.android.comp.a.a.a("100000002586002200000010", ((Map)v1_1));
    }

    static com.ganji.android.common.b b(MainActivity arg1) {
        return arg1.v;
    }

    private void b() {
        com.ganji.android.comp.e.b.a().a(new com.ganji.android.comp.e.b$a() {
            public void b(com.ganji.android.comp.e.c arg4) {
                if(!this.a.isFinishing() && arg4 != null) {
                    String v0 = String.valueOf(arg4.j());
                    if(com.ganji.android.comp.city.a.a() != null && !TextUtils.equals(((CharSequence)v0), com.ganji.android.comp.city.a.a().a)) {
                        this.a.runOnUiThread(new Runnable(v0) {
                            public void run() {
                                new com.ganji.android.comp.c.c$a(this.b.a).a(2).b("是否切换到当前城市").a("确定", new View$OnClickListener() {
                                    public void onClick(View arg6) {
                                        MainActivity.a(this.a.b.a, com.ganji.android.comp.city.a.d(this.a.a));
                                        MainActivity.a(this.a.b.a, new com.ganji.android.common.b(this.a.b.a, MainActivity.a(this.a.b.a), this.a.b.a.a));
                                        MainActivity.a(this.a.b.a, MainActivity.b(this.a.b.a).a("正在切换到您所在的城市…"));
                                        MainActivity.c(this.a.b.a).show();
                                        List v0 = null;
                                        if(com.ganji.android.comp.post.b.a() != null) {
                                            v0 = com.ganji.android.d.d();
                                        }

                                        if(v0 != null && v0.size() > 0) {
                                            if(com.ganji.android.comp.utils.h.b("last_category_versions")) {
                                                com.ganji.android.comp.utils.h.c("last_category_versions");
                                            }

                                            com.ganji.android.comp.utils.h.a("last_category_versions", v0);
                                        }

                                        if(!MainActivity.b(this.a.b.a).a()) {
                                            MainActivity.b(this.a.b.a).b();
                                        }
                                        else {
                                            MainActivity.b(this.a.b.a).postDelayed(new Runnable() {
                                                public void run() {
                                                    this.a.a.b.a.a.a();
                                                }
                                            }, 200);
                                        }
                                    }
                                }).a().show();
                            }
                        });
                    }
                }
            }

            public void b(boolean arg1) {
            }

            public void c() {
            }

            public void d() {
            }
        });
    }

    private void b(Intent arg3) {
        if(arg3 != null) {
            Uri v0 = arg3.getData();
            if(v0 != null) {
                com.ganji.android.b.b.d().a(((Context)this), v0);
            }
        }
    }

    static void b(MainActivity arg0, Intent arg1) {
        arg0.b(arg1);
    }

    static Dialog c(MainActivity arg1) {
        return arg1.u;
    }

    private void c() {
        this.mTabHost = this.findViewById(R.id.tabhost);
        this.n = this.findViewById(R.id.tabs_bg);
        this.tab = this.findViewById(16908307);
        this.c = this.findViewById(R.id.tab_center);
        this.c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg4) {
                MainActivity.a("publish");
                Intent intent = new Intent(mContext, PublishTabAcitvity.class);
                intent.putExtra("extra_close_anim_out", R.anim.pub_activity_push_down_out);
                mContext.startActivity(intent);
            }
        });
        this.mTabHost.setup();
        this.mTabManager = new com.ganji.android.control.MainActivity$a(((FragmentActivity)this), this.mTabHost, R.id.realtabcontent);
        View v1 = LayoutInflater.from(mContext).inflate(R.layout.main_tab_indicator, null);
        View v2 = LayoutInflater.from(mContext).inflate(R.layout.main_tab_indicator, null);
        View v3 = LayoutInflater.from(mContext).inflate(R.layout.main_tab_indicator, null);
        View v4 = LayoutInflater.from(mContext).inflate(R.layout.main_tab_indicator_im, null);
        View v5 = LayoutInflater.from(mContext).inflate(R.layout.main_tab_indicator_myinfo, null);
        this.d = v1.findViewById(R.id.icon);
        this.d.setImageResource(R.drawable.tab_lastcategories_bg);
        this.e = v2.findViewById(R.id.icon);
        this.e.setImageResource(R.drawable.tab_near_bg);
        this.f = v3.findViewById(R.id.icon);
        this.j = v4.findViewById(R.id.iv_tab_im);
        this.k = this.findViewById(R.id.devider_line);
        this.g = v5.findViewById(R.id.icon);
        this.g.setImageResource(R.drawable.tab_personal_centre_bg);
        this.b = v5.findViewById(R.id.myinfo_msg_count);
        this.i = v4.findViewById(R.id.circle_msg_count);
        this.h = v4.findViewById(R.id.circle_red_point);
        this.mTabManager.a(this.mTabHost.newTabSpec("catalog").setIndicator(v1), com.ganji.android.d.a.class, 1, 495);
        this.mTabManager.a(this.mTabHost.newTabSpec("nearby").setIndicator(v2), com.ganji.android.d.c.class, 2, 503);
        this.mTabManager.a(this.mTabHost.newTabSpec("publish").setIndicator(v3), com.ganji.android.d.d.class, 3, 504);
        this.mTabManager.a(this.mTabHost.newTabSpec("im").setIndicator(v4), com.ganji.im.d.c.class, 4, 507);
        this.mTabManager.a(this.mTabHost.newTabSpec("center").setIndicator(v5), f.class, 5, 506);
        this.mTabManager.a(((x)this));
        if("im".equals(this.getIntent().getStringExtra("extra_target_tab"))) {
            this.mTabHost.setCurrentTabByTag("im");
        }
    }

    private void c(Intent arg1) {
        if(arg1 != null) {
            com.ganji.android.h.b.a(((Context)this), arg1);
        }
    }

    static Dialog d(MainActivity arg1) {
        return arg1.m;
    }

    private void d() {
//        int v0 = l.b("life-generic", "app_launch_count", 0) + 1;
//        l.a("life-generic", "app_launch_count", v0);
//        if(v0 % 50 == 0 && (l.b("life-generic", "app_rated_in_market", false))) {
//            new com.ganji.android.comp.c.c$a(((Activity)this)).a(2).a("应用商店").b("亲,为赶集网评分吧!!!").a("确定", new View$OnClickListener() {
//                public void onClick(View arg4) {
//                    this.a.startMarket();
//                    l.a("life-generic", "app_rated_in_market", true);
//                }
//            }).a().show();
//        }
    }

    static Dialog e(MainActivity activity) {
        return arg1.l;
    }

    private Fragment e() {
//        Fragment v0 = this.mTabManager == null || com.ganji.android.control.MainActivity$a.a(this.mTabManager) == null || this.mTabHost == null ? null : b.b(com.ganji.android.control.MainActivity$a.a(this.mTabManager).get(this.mTabHost.getCurrentTabTag()));
//        return v0;
    }

    private void f() {
//        new com.ganji.android.comp.c.c$a(((Activity)this)).a(2).a("提示").b("确定要退出赶集网吗？").a("确定", new View$OnClickListener() {
//            public void onClick(View arg4) {
//                if(!l.b("life-generic", "friend_is_auto_login", true)) {
//                    p v0 = com.ganji.android.comp.g.a.b();
//                    if(v0 != null) {
//                        v0.l = "";
//                        v0.j = "";
//                        com.ganji.android.comp.g.a.c(v0);
//                    }
//                }
//
//                this.a.finish();
//            }
//        }).a().show();
    }

    private void g() {
        n.a("请登录后认证");
        Intent v0 = new Intent(this.mActivity, GJLifeLoginActivity.class);
        v0.putExtra("extra_from", 7);
        this.mActivity.startActivityForResult(v0, 101);
    }

//    public s getGJThemeController() {
//        return this.r;
//    }

    private void h() {
//        ArrayList v0 = com.ganji.android.o.b.a(com.ganji.android.comp.g.a.b());
//        if(v0 != null && v0.size() > 0) {
//            this.startActivity(new Intent(((Context)this), GJCertifyActivity.class));
//        }
    }

    public void handleSchemeIntent(Intent arg9) {
        Exception v1_1;
        JSONObject v0_2;
        JSONObject v2;
//        int v6 = -1;
//        if(arg9 != null) {
//            Uri v3 = arg9.getData();
//            if(v3 == null) {
//                return;
//            }
//
//            String v0 = v3.getEncodedQuery();
//            JSONObject v1 = null;
//            try {
//                if(v0.contains("%")) {
//                    v0 = URLDecoder.decode(v0, "UTF-8");
//                }
//
//                v2 = new JSONObject(v0.replace("data=", ""));
//            }
//            catch(Exception v0_1) {
//                Exception v7 = v0_1;
//                v0_2 = v1;
//                v1_1 = v7;
//                goto label_26;
//            }
//
//            try {
//                v0_2 = v2.optJSONObject("bParam");
//                goto label_18;
//            }
//            catch(Exception v0_1) {
//                v1_1 = v0_1;
//                v0_2 = v2;
//            }
//
//            label_26:
//            v1_1.printStackTrace();
//            label_18:
//            String v1_2 = v3.getHost();
//            if(com.ganji.android.comp.utils.m.m(v1_2)) {
//                return;
//            }
//
//            if(v1_2.equals("renzheng")) {
//                if(com.ganji.android.comp.g.a.a()) {
//                    this.h();
//                    return;
//                }
//
//                this.g();
//                return;
//            }
//
//            if(v0_2 != null) {
//                if(v1_2.equals("postdetail")) {
//                    int v1_3 = com.ganji.android.comp.utils.m.b(v0_2.optString("category_id"), v6);
//                    String v2_1 = v0_2.optString("puid");
//                    String v3_1 = v0_2.optString("isFrom58");
//                    String v4 = v0_2.optString("baseTag");
//                    v0 = v0_2.optString("postfrom");
//                    if(v1_3 == v6) {
//                        return;
//                    }
//
//                    if(v2_1 == null) {
//                        return;
//                    }
//
//                    Bundle v5 = new Bundle();
//                    v5.putInt("extra_category_id", v1_3);
//                    if(!com.ganji.android.comp.utils.m.m(v3_1)) {
//                        v5.putString("isFrom58", v3_1);
//                    }
//
//                    if(!com.ganji.android.comp.utils.m.m(v0)) {
//                        v5.putString("postfrom", v0);
//                    }
//
//                    if(!com.ganji.android.comp.utils.m.m(v4)) {
//                        v5.putString("baseTag", v4);
//                    }
//
//                    ag.a(((Activity)this), 1000, v1_3, v2_1, v5);
//                    return;
//                }
//
//                g v2_2 = new g();
//                v2_2.e = v0_2;
//                if(v1_2.equals("subhomepage")) {
//                    v2_2.d = 1;
//                }
//                else if(v1_2.equals("postlist")) {
//                    v2_2.a = v0_2.optString("title");
//                    v2_2.d = 2;
//                }
//                else if(v1_2.equals("h5page")) {
//                    v2_2.d = 20;
//                }
//
//                v2_2.jump(((Activity)this));
//            }
//        }
    }

    private void i() {
//        if(com.ganji.android.comp.city.a.a(false) != null) {
//            l.a("confirmed_city", com.ganji.android.comp.city.a.a(false).a, true);
//        }
    }

    public void inflateThemeConfig(t arg3) {
//        if(arg3 != null && (arg3.b()) && this.mTabManager != null && com.ganji.android.control.MainActivity$a.a(this.mTabManager) != null) {
//            Object v0 = com.ganji.android.control.MainActivity$a.a(this.mTabManager).get("catalog");
//            if(v0 != null && ((b.b(((b)v0)) instanceof com.ganji.android.d.a))) {
//                b.b(((b)v0)).b();
//            }
//        }
    }

    private void j() {
//        AdapterView$OnItemClickListener v7 = null;
//        com.ganji.android.o.h v0 = new com.ganji.android.o.h(((Context)this));
//        long v2 = l.b("life-generic", "first_boot_app_of_day_time", 0);
//        int v1 = l.b("life-generic", "launch_count_until", 0) + 1;
//        this.getSharedPreferences("life-generic", 0).edit().putInt("launch_count_until", v1).commit();
//        if(System.currentTimeMillis() - v2 > 86400000) {
//            v0.a();
//        }
//
//        if(v1 == 3) {
//            com.ganji.android.comp.a.a.a("100000000431004800000010");
//            com.ganji.android.comp.a.a.a("100000002586001300000010", "gc", "/all_cate/-/-/-/1010");
//            this.l = v0.a(v7, ((View$OnClickListener)v7), 1);
//            this.l.show();
//        }
    }

    private void k() {
        if(this.n != null && this.d != null && this.e != null && this.c != null && this.g != null && this.j != null && this.k != null) {
            this.n.setImageBitmap(null);
            this.d.setImageResource(2133985707);
            this.e.setImageResource(2133985712);
            this.c.setImageResource(2133985717);
            this.g.setImageResource(2133985714);
            this.j.setImageResource(2133985704);
            this.k.setVisibility(8);
        }
    }

    private void l() {
//        if(this.r != null) {
//            try {
//                if(this.r.e()) {
//                    this.n.setImageBitmap(this.r.b().get("bg_img"));
//                }
//
//                if(!this.r.d()) {
//                    return;
//                }
//
//                this.k.setVisibility(0);
//                this.d.getBackground().setAlpha(0);
//                this.e.getBackground().setAlpha(0);
//                this.f.getBackground().setAlpha(0);
//                this.g.getBackground().setAlpha(0);
//                this.j.getBackground().setAlpha(0);
//                this.d.setImageDrawable(this.r.a(this.r.c().get("icon_home"), this.r.c().get("icon_active_home")));
//                this.e.setImageDrawable(this.r.a(this.r.c().get("icon_nearby"), this.r.c().get("icon_active_nearby")));
//                this.c.setImageDrawable(this.r.a(this.r.c().get("icon_publish"), this.r.c().get("icon_active_publish")));
//                this.g.setImageDrawable(this.r.a(this.r.c().get("icon_ucenter"), this.r.c().get("icon_active_ucenter")));
//                this.j.setImageDrawable(this.r.a(this.r.c().get("icon_im"), this.r.c().get("icon_active_im")));
//            }
//            catch(Exception v0) {
//                com.ganji.android.c.f.a.a(((Throwable)v0));
//            }
//        }
    }

    public boolean needStatusBarColorWithTitlebar() {
        return false;
    }

    protected void onActivityResult(int arg5, int arg6, Intent arg7) {
        int v1 = -1;
        super.onActivityResult(arg5, arg6, arg7);
        if(arg5 == 5654) {
            if(com.ganji.android.comp.city.a.a(false) == null) {
                this.finish();
            }
        }
        else if(arg5 == 0) {
            if(arg6 == v1) {
                String v0 = arg7.getStringExtra("code");
                String v1_1 = arg7.getStringExtra("protocol_code");
                Bundle v2 = new Bundle();
                v2.putString("code", v0);
                v2.putString("protocol_code", v1_1);
                com.ganji.android.base.a.a(((Activity)this), v2, com.ganji.android.myinfo.f.f.class.getName());
            }
        }
        else if(arg5 == 101 && arg6 == v1) {
            this.h();
        }
    }

    public void onCallback() {
//        if(b.a(this.mTabManager.a).equals("catalog")) {
//            Fragment v0 = b.b(this.mTabManager.a);
//            if(v0 != null) {
//                this.s.a(((com.ganji.android.d.a)v0).e());
//                ((com.ganji.android.d.a)v0).a(this.s.b(), this.s.c());
//                ((com.ganji.android.d.a)v0).a(this.s.d());
//                goto label_22;
//            }
//        }
//        else {
//            label_22:
//            this.s.a(b.a(this.mTabManager.a).equals("catalog"));
//        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent v8 = null;
        long v6 = 0;
        //this.t = new ac(((Activity)this));
        //com.ganji.android.control.a.a = false;
//        this.getInterceptor().d = false;
//        this.d();
//        this.j();
//        this.b();
//        if(!l.b("life-generic", "launch_count_increased_when_crash", false)) {
//            com.ganji.android.comp.a.a.a("100000000406000200000010");
//            com.ganji.android.comp.a.a.a("100000002586000200000010", "gc", "/all_cate/-/-/-/1010");
//        }

//        l.a("life-generic", new String[]{"launch_count_increased_when_crash"});
        setContentView(R.layout.main_fragment_tabs);
//        this.r = new s(this);
//        this.c();
//        PollingAlarm.a("", 1);
//        PollingAlarm.a();
//        p v0 = com.ganji.android.comp.g.a.b();
//        if(v0 != null) {
//            if((TextUtils.isEmpty(v0.j)) && (TextUtils.isEmpty(v0.l))) {
//                ClientApplication.clearUserInfo(this.getApplicationContext());
//                goto label_48;
//            }
//
//            this.t.a();
//        }

//        label_48:
//        this.requestCheckVersion(true);
//        k.c = true;
//        this.showCenterTabUnreadMsgCount();
//        if(ClientApplication.pendingIntentFromNotification != null) {
//            this.startActivity(ClientApplication.pendingIntentFromNotification);
//            ClientApplication.pendingIntentFromNotification = v8;
//        }
//
//        GJWeatherMgr.a(1200000);
//        this.i();
//        this.handleSchemeIntent(this.getIntent());
//        this.c(this.getIntent());
//        this.mTabHost.postDelayed(new Runnable() {
//            public void run() {
//                MainActivity.a(this.a, this.a.getIntent());
//                MainActivity.b(this.a, this.a.getIntent());
//            }
//        }, 500);
//        Vector v0_1 = new Vector();
//        com.ganji.android.k.l.a().a(v0_1);
//        if(v0_1.size() == 0) {
//            l.a("life-generic", "first_boot_app_of_day_time", v6);
//            l.a("life-generic", "infor_update_time_long", v6);
//        }
//
//        long v0_2 = l.b("life-generic", "first_boot_app_of_day_time", v6);
//        long v2 = l.b("life-generic", "infor_update_time_long", v6);
//        if(System.currentTimeMillis() - v0_2 > 86400000 && System.currentTimeMillis() - v2 > 600000) {
//            com.ganji.android.k.l.a().a(new e() {
//                public void onHttpComplete(com.ganji.android.c.c.b arg4, com.ganji.android.c.c.d arg5) {
//                    if(arg5 != null && (arg5.d()) && (com.ganji.android.k.l.a().a(j.c(arg5.c()), false))) {
//                        l.a("life-generic", "is_click_entrance", false);
//                        org.greenrobot.eventbus.c.a().c(new com.ganji.im.community.f.d("opMsgUpdate", null));
//                    }
//                }
//
//                public void onHttpProgress(boolean arg1, long arg2, long arg4) {
//                }
//            }, "0");
//        }
//
//        if(Build$VERSION.SDK_INT >= 19) {
//            this.getWindow().addFlags(67108864);
//        }

//        new Handler().post(new Runnable() {
//            public void run() {
//                int v2 = l.b("life-generic", "first_main_launch", 0);
//                try {
//                    String v0 = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionName;
//                }
//                catch(PackageManager$NameNotFoundException v1) {
//                    com.ganji.android.c.f.a.c("MainActivity", v1.getMessage());
//                }
//
//                if(("5.11.0".equalsIgnoreCase(v0)) && v2 == 1) {
//                    this.a.a();
//                }
//
//                l.a("life-generic", "first_main_launch", 0);
//            }
//        });
//        this.requestPatchDataWhenActiveChanged();
//        com.ganji.android.comp.e.b.a().a(((com.ganji.android.comp.e.b$a)v8));
//        if(!com.ganji.android.a.c()) {
//            com.ganji.android.comp.f.b.a(new com.ganji.android.h.c(this.getApplicationContext()));
//        }
//
//        this.s = new m(((Activity)this));
//        this.s.a(this.findViewById(2134576737));
//        org.greenrobot.eventbus.c.a().a(this);
    }

    public void onDestroy() {
//        k.c = false;
//        com.ganji.android.comp.socialize.f.b = null;
//        GJMessagePost.clearPostCache();
//        GJWeatherMgr.a(1200000);
//        com.ganji.android.d.a(((Context)this));
//        try {
//            com.ganji.android.album.d.a();
//        }
//        catch(Throwable v0) {
//            com.ganji.android.c.f.a.a(v0);
//        }
//
//        com.ganji.android.history.f.j();
//        LifePhoneBookActivity.sCurrentTab = "";
//        if(this.l != null && (this.l.isShowing())) {
//            this.l.dismiss();
//        }
//
//        if(this.m != null && (this.m.isShowing())) {
//            this.m.dismiss();
//        }
//
//        com.ganji.android.comp.common.b.a().b(this.q);
//        org.greenrobot.eventbus.c.a().b(this);
        super.onDestroy();
    }

    public boolean onKeyDown(int arg4, KeyEvent arg5) {
        boolean v0 = true;
//        if(!this.a(arg4, arg5)) {
//            if(4 == arg4) {
//                if(this.s != null && (this.s.a())) {
//                    return false;
//                }
//
//                this.f();
//            }
//            else {
//                v0 = false;
//            }
//        }

        return v0;
    }

    protected void onNewIntent(Intent arg1) {
        super.onNewIntent(arg1);
//        this.a(arg1);
//        this.b(arg1);
//        this.handleSchemeIntent(arg1);
//        this.c(arg1);
    }

    protected void onRestoreInstanceState(Bundle arg3) {
        super.onRestoreInstanceState(arg3);
//        if(arg3 != null && this.mTabHost != null) {
//            this.mTabHost.setCurrentTabByTag(arg3.getString("tab"));
//        }
    }

    protected void onResume() {
        super.onResume();
//        this.mTabHost.getTabWidget().getChildAt(0).setOnClickListener(new View$OnClickListener() {
//            public void onClick(View arg3) {
//                if(b.a(this.a.mTabManager.a).equals("catalog")) {
//                    b.b(this.a.mTabManager.a).c();
//                }
//                else {
//                    this.a.mTabHost.setCurrentTab(0);
//                }
//            }
//        });
//        this.mTabHost.getTabWidget().getChildAt(1).setOnClickListener(new View$OnClickListener() {
//            public void onClick(View arg3) {
//                if(b.a(this.a.mTabManager.a).equals("nearby")) {
//                    b.b(this.a.mTabManager.a).b();
//                }
//                else {
//                    this.a.mTabHost.setCurrentTab(1);
//                }
//            }
//        });
//        Object v0 = com.ganji.android.control.MainActivity$a.a(this.mTabManager).get("catalog");
//        if(v0 != null) {
//            Fragment v0_1 = b.b(((b)v0));
//            if(v0_1 != null) {
//                this.s.a(((com.ganji.android.d.a)v0_1).e());
//                ((com.ganji.android.d.a)v0_1).a(this.s.b(), this.s.c());
//                ((com.ganji.android.d.a)v0_1).a(this.s.d());
//            }
//        }
    }

    protected void onSaveInstanceState(Bundle arg3) {
        super.onSaveInstanceState(arg3);
        arg3.putString("tab", this.mTabHost.getCurrentTabTag());
    }

    public void requestPatchDataWhenActiveChanged() {
//        this.q = new com.ganji.android.comp.common.b$a() {
//            public void a(boolean arg2, Activity arg3) {
//                if(!this.a.isFinishing() && (arg2)) {
//                    com.ganji.android.patch.h.a().c();
//                }
//            }
//        };
//        com.ganji.android.comp.common.b.a().a(this.q);
    }

    public void setGJThemeController(s arg1) {
        //this.r = arg1;
    }

    public void showCenterTabUnreadMsgCount() {
//        com.ganji.android.c.c.b v0 = new com.ganji.android.c.c.b();
//        v0.b("POST");
//        v0.a(com.ganji.android.comp.common.e$b.i);
//        v0.a("interface", "CommonSubscribe");
//        v0.b("act", "6");
//        v0.b("loginId", com.ganji.android.comp.g.c.d());
//        com.ganji.android.comp.b.a.b(v0);
//        v0.a(new e() {
//            public void onComplete(com.ganji.android.c.c.b arg4, com.ganji.android.c.c.d arg5) {
//                if(!this.a.isFinishing() && arg5.a() == 200) {
//                    String v0 = j.c(arg5.c());
//                    if(com.ganji.android.c.f.k.m(v0)) {
//                        return;
//                    }
//
//                    try {
//                        JSONObject v0_2 = new JSONObject(v0).optJSONObject("data");
//                        if(v0_2 != null) {
//                            MainActivity.mRssNewNum = v0_2.optInt("num");
//                        }
//
//                        this.a.sendBroadcast(new Intent("com.ganji.android.intent.action.RSS_NEW_MSG_TOTAL_NUM"));
//                    }
//                    catch(JSONException v0_1) {
//                        v0_1.printStackTrace();
//                    }
//                }
//            }
//        });
//        com.ganji.android.c.c.c.a().a(v0);
    }

    public void startMarket() {
//        Intent v1 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.ganji.android"));
//        List v0 = this.getPackageManager().queryIntentActivities(v1, 65536);
//        Vector v2 = new Vector();
//        Iterator v3 = v0.iterator();
//        while(v3.hasNext()) {
//            Object v0_1 = v3.next();
//            if("com.android.vending".equals(((ResolveInfo)v0_1).activityInfo.packageName)) {
//                continue;
//            }
//
//            v2.add(v0_1);
//        }
//
//        if(v2.size() == 1) {
//            Intent v3_1 = new Intent(v1);
//            v3_1.setPackage(v2.get(0).activityInfo.packageName);
//            v3_1.setClassName(v2.get(0).activityInfo.packageName, v2.get(0).activityInfo.name);
//            this.startActivity(v3_1);
//        }
//        else if(v2.size() > 1) {
//            this.a(v1, v2);
//        }
    }

    public void updateArea1View(t arg3) {
//        if(arg3 != null && (arg3.b()) && this.mTabManager != null && com.ganji.android.control.MainActivity$a.a(this.mTabManager) != null) {
//            Object v0 = com.ganji.android.control.MainActivity$a.a(this.mTabManager).get("catalog");
//            if(v0 != null && ((b.b(((b)v0)) instanceof com.ganji.android.d.a))) {
//                b.b(((b)v0)).d();
//            }
//        }
    }

    public void updateCenterTabButtonUnreadMsgCount(int arg3) {
//        if(arg3 > 0) {
//            this.b.setVisibility(0);
//        }
//        else {
//            this.b.setVisibility(8);
//        }
    }

    public void updateMsgNumView() {
//        int v5 = 8;
//        int v0 = l.b("FILE_WC_NOTICE", "KEY_WC_UNREAD_MSG_COUNT", 0);
//        boolean v1 = l.b("FILE_WC_NOTICE", "KEY_IM_CIRCLE_HOT_DOT", false);
//        if(v0 > 0) {
//            if(v0 > 99) {
//                this.i.setText("99+");
//            }
//            else {
//                this.i.setText("" + v0);
//            }
//
//            this.i.setVisibility(0);
//            this.h.setVisibility(v5);
//        }
//        else {
//            if(v1) {
//                this.i.setVisibility(v5);
//                this.h.setVisibility(0);
//                return;
//            }
//
//            this.i.setVisibility(v5);
//            this.h.setVisibility(v5);
//        }
    }

    public void updateTabsBg(t arg3) {
//        if(arg3 != null) {
//            HashMap v0 = arg3.c;
//            if((arg3.b()) && v0 != null && v0.size() > 0) {
//                if(arg3.d()) {
//                    this.l();
//                }
//                else {
//                    this.k();
//                }
//            }
//        }
    }

    public void updateTitlebarBg(t arg3) {
//        if(arg3 != null && (arg3.b()) && this.mTabManager != null && com.ganji.android.control.MainActivity$a.a(this.mTabManager) != null) {
//            Object v0 = com.ganji.android.control.MainActivity$a.a(this.mTabManager).get("nearby");
//            if(v0 != null && ((b.b(((b)v0)) instanceof com.ganji.android.d.c))) {
//                b.b(((b)v0)).a();
//            }
//        }
    }
}
