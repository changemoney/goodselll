package android.com.goodsell;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;

import android.com.goodsell.utils.Callback;

import java.util.HashMap;
import java.util.Iterator;



public class MainActivity extends BaseActivity implements Callback {

    public void onCallback (){

    }


    public static class TabManager implements TabHost.OnTabChangeListener {

        class TabContent implements TabHost.TabContentFactory {
            private Context mContext;

            public TabContent(Context context) {
                mContext = context;
            }

            public View createTabContent(String arg) {
                View view = new View(mContext);
                view.setMinimumWidth(0);
                view.setMinimumHeight(0);
                return view;
            }
        }

        static class FragmentPage {
            private final String name;
            private final Class c;
            private final int count;
            private Fragment fragment;
            private FragmentPage fp;
            private int e;

            FragmentPage(String name, Class cl, int count, int arg4) {
                super();
                this.name = name;
                this.c = cl;
                this.count = count;
                this.e = arg4;
            }

            static String getTag(FragmentPage fp) {

                return fp.name;
            }

            static Fragment getFrontFragment(FragmentPage fp, Fragment ft) {
                fp.fragment = ft;
                return ft;
            }

            static Fragment getBackFragment(FragmentPage fp) {
                return fp.fragment;
            }

            static int getCount(FragmentPage fp) {

                return fp.count;
            }

            static Class getClassName(FragmentPage fp) {

                return fp.c;
            }
        }

        FragmentPage mfp;

        private FragmentActivity mFragmentActivity;
        private TabHost mTabHost;
        private int count;
        private HashMap mMap;
        private Callback callBack;

        public TabManager(FragmentActivity fragmentActivity, TabHost tabHost, int count) {
            super();
            mMap = new HashMap();
            mFragmentActivity = fragmentActivity;
            mTabHost = tabHost;
            this.count = count;
            mTabHost.setOnTabChangedListener(this);
        }

        public void addTab(TabSpec tabSpec, Class cl, int arg7, int arg8) {
            tabSpec.setContent(new TabContent(mFragmentActivity));
            String tag = tabSpec.getTag();
            FragmentPage fm = new FragmentPage(tag, cl, arg7, arg8);
            FragmentPage.getFrontFragment(fm, mFragmentActivity.getSupportFragmentManager().findFragmentByTag(tag));
            if (FragmentPage.getBackFragment(fm) != null && !FragmentPage.getBackFragment(fm).isDetached()) {
                FragmentTransaction ft = mFragmentActivity.getSupportFragmentManager().beginTransaction();
                ft.detach(FragmentPage.getBackFragment(fm));
                ft.commitAllowingStateLoss();
            }

            mMap.put(tag, fm);
            mTabHost.addTab(tabSpec);
        }

        public void addTab(Callback callBack) {
            this.callBack = callBack;
        }

        static HashMap getMap(TabManager manager) {
            return manager.mMap;
        }

        private void setFragmentUserVisibleHint(FragmentPage fp) {
            if (mMap != null) {
                Iterator iterator = mMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    Object object = iterator.next();
                    System.out.println("setFragmentUserVisibleHint object"+object.toString());
                    if (object == null) {
                        continue;
                    }

                    if (fp.getBackFragment(((FragmentPage) object)) == null) {
                        continue;
                    }

                    boolean isVisibleHint = object == fp ;
                    fp.getBackFragment(((FragmentPage) object)).setUserVisibleHint(isVisibleHint);
                }
            }
        }

        public void onTabChanged(String tag) {
            //MainActivity.a(tag);
            Object object = mMap.get(tag);
            if (FragmentPage.getCount(((FragmentPage) object)) != 3 && mfp != object) {
                FragmentTransaction ft = mFragmentActivity.getSupportFragmentManager().beginTransaction();
                if (mfp != null) {
                    if (FragmentPage.getCount(mfp) > FragmentPage.getCount(((FragmentPage) object))) {
                        ft.setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out);
                    } else {
                        ft.setCustomAnimations(R.anim.push_left_in, R.anim.push_left_out);
                    }
                }

                if (mfp != null && FragmentPage.getBackFragment(mfp) != null) {
                    ft.hide(FragmentPage.getBackFragment(mfp));
                }

                if (object != null) {
                    if (FragmentPage.getBackFragment(((FragmentPage) object)) != null && FragmentPage.getBackFragment(((FragmentPage) object)).getView() != null) {
                        ft.show(FragmentPage.getBackFragment(((FragmentPage) object)));
                        //goto label_45;
                    }

                    FragmentPage.getFrontFragment(((FragmentPage) object), Fragment.instantiate(mFragmentActivity, FragmentPage.getClassName(((FragmentPage) object)).getName(), null));
                    ft.add(count, FragmentPage.getBackFragment(((FragmentPage) object)), FragmentPage.getTag(((FragmentPage) object)));
                }

                //label_45:
                mfp = ((FragmentPage) object);
                ft.commitAllowingStateLoss();
                mFragmentActivity.getSupportFragmentManager().executePendingTransactions();
                this.setFragmentUserVisibleHint(((FragmentPage) object));
                if (this.callBack == null) {
                    return;
                }

                this.callBack.onCallback();
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
    //    a a;
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
    //private com.ganji.android.comp.common.b$a q;
    //private s r;
    //private m s;
    //private ac t;
    public TabWidget tab;
    private Dialog u;
    //private com.ganji.android.common.b v;
    //private c w;

    public MainActivity() {
        super();
        this.o = new HashMap();
        this.p = new HashMap();
    }


    private void setTabIm(Intent intent) {
        String tab = intent.getStringExtra("extra_target_tab");
        this.mTabHost.getCurrentTabTag();
        if (!TextUtils.isEmpty(((CharSequence) tab))) {
            this.mTabHost.setCurrentTabByTag(tab);
            "im".equals(tab);
        }
    }


    public boolean needStatusBarColorWithTitlebar() {
        return false;
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        int v1 = -1;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 5654) {
//            if (com.ganji.android.comp.city.a.a(false) == null) {
//                this.finish();
//            }
        } else if (requestCode == 0) {
            if (resultCode == v1) {
                String code = data.getStringExtra("code");
                String protocol_code = data.getStringExtra("protocol_code");
                Bundle bundle = new Bundle();
                bundle.putString("code", code);
                bundle.putString("protocol_code", protocol_code);
                //com.ganji.android.base.a.a(((Activity) this), v2, com.ganji.android.myinfo.f.f.class.getName());
            }
        } else if (requestCode == 101 && resultCode == v1) {
            //this.h();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment_tabs);
        this.mTabHost = (TabHost)findViewById(R.id.tabhost);
        this.n = (ImageView)findViewById(R.id.tabs_bg);
        this.tab = (TabWidget)findViewById(R.id.tabs);
        this.c = (ImageView)this.findViewById(R.id.tab_center);
        //this.c.setOnClickListener(new View.OnClickListener() {
        //public void onClick(View arg4) {
        //MainActivity.a("publish");
//                Intent intent = new Intent(mContext, PublishTabAcitvity.class);
//                intent.putExtra("extra_close_anim_out", R.anim.pub_activity_push_down_out);
//                mContext.startActivity(intent);
        //}
        // });
        this.mTabHost.setup();
        this.mTabManager = new TabManager(((FragmentActivity) this), this.mTabHost, R.id.realtabcontent);
        View v1 = LayoutInflater.from(this.getApplicationContext()).inflate(R.layout.main_tab_indicator, null);
        View v2 = LayoutInflater.from(this.getApplicationContext()).inflate(R.layout.main_tab_indicator, null);
        View v3 = LayoutInflater.from(this.getApplicationContext()).inflate(R.layout.main_tab_indicator, null);
        View v4 = LayoutInflater.from(this.getApplicationContext()).inflate(R.layout.main_tab_indicator_im, null);
        View v5 = LayoutInflater.from(this.getApplicationContext()).inflate(R.layout.main_tab_indicator_myinfo, null);
        this.d = (ImageView) v1.findViewById(R.id.icon);
        this.d.setImageResource(R.drawable.tab_lastcategories_bg);
        this.e = (ImageView)v2.findViewById(R.id.icon);
        this.e.setImageResource(R.drawable.tab_near_bg);
        this.f = (ImageView)v3.findViewById(R.id.icon);
        this.j = (ImageView)v4.findViewById(R.id.iv_tab_im);
        this.k = this.findViewById(R.id.devider_line);
        this.g = (ImageView)v5.findViewById(R.id.icon);
        this.g.setImageResource(R.drawable.tab_personal_centre_bg);
        this.b = (ImageView)v5.findViewById(R.id.myinfo_msg_count);
        this.i = (TextView)v4.findViewById(R.id.circle_msg_count);
        this.h =  v4.findViewById(R.id.circle_red_point);

        mTabManager.addTab(this.mTabHost.newTabSpec("catalog").setIndicator(v1), CatalogFragment.class, 1, 495);
        mTabManager.addTab(this.mTabHost.newTabSpec("nearby").setIndicator(v2), null, 2, 503);
        mTabManager.addTab(this.mTabHost.newTabSpec("publish").setIndicator(v3), null, 3, 504);
        mTabManager.addTab(this.mTabHost.newTabSpec("im").setIndicator(v4), null, 4, 507);
        mTabManager.addTab(this.mTabHost.newTabSpec("center").setIndicator(v5), null, 5, 506);

        //this.mTabManager.a(((x) this));
        if ("im".equals(this.getIntent().getStringExtra("extra_target_tab"))) {
            this.mTabHost.setCurrentTabByTag("im");
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int keycode, KeyEvent event) {
        super.onKeyDown(keycode, event);
        return true;
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    protected void onRestoreInstanceState(Bundle arg3) {
        super.onRestoreInstanceState(arg3);
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("tab", mTabHost.getCurrentTabTag());
    }
}
