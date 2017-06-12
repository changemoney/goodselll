package android.com.goodsell;


import android.com.goodsell.im.view.PullDownScrollParentView;
import android.com.goodsell.ui.PullDownScrollView;
import android.com.goodsell.ui.ScrollViewExtend;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import common.BaseFragment;


public class CatalogFragment extends BaseFragment implements PullDownScrollParentView.a{
    @Override
    public void a(int arg1) {

    }//implements View.OnClickListener, SignUpView.signup, PullDownScrollParentView.a {

    class ChangePageListener implements OnPageChangeListener {

        CatalogFragment ft;

        private ChangePageListener(CatalogFragment fragment) {
            ft = fragment;
        }

        public void onPageScrollStateChanged(int arg1) {

        }

        public void onPageScrolled(int arg1, float arg2, int arg3) {
        }

        public void onPageSelected(int position) {
            int v0;

            for (v0 = 0; v0 < getList(ft).size(); ++v0) {
                if (v0 == position) {
                    CatalogFragment.getImages(ft)[v0].setImageResource(R.drawable.thrid_area_dot_selected);
                } else {
                    CatalogFragment.getImages(ft)[v0].setImageResource(R.drawable.thrid_area_dot_unselected);
                }
            }
        }
    }


    class ThirdAreaAdapter extends BaseAdapter

    {
        private List thirdList;
        private int c;
        private CatalogFragment ft;

        public ThirdAreaAdapter(CatalogFragment fragment, List list) {
            ft = fragment;
            //super();
            thirdList = new ArrayList();
            this.c = -1;
            thirdList = list;
        }


        public int getCount() {
            return thirdList.size();
        }

        public Object getItem(int index) {
            return thirdList.get(index);
        }

        public long getItemId(int arg3) {
            return ((long) arg3);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            Object object = thirdList.get(position);
            if (convertView == null) {
                convertView = LayoutInflater.from(getActivity().getApplicationContext()).inflate(R.layout.item_third_area, parent, false);
            }

            //int v1 = (a.w(getActivity()) - com.ganji.android.c.f.c.a(16f)) / 5;
            ViewGroup.LayoutParams v2 = convertView.getLayoutParams();
//            if (v1 == 0) {
//                v1 = 147;
//            }
//
//            v2.width = v1;
            convertView.setLayoutParams(v2);
            View title = convertView.findViewById(R.id.third_area_item_title);
            //((TextView) title).setText(thirdList.get(position).a);
            //a.a(getActivity(), convertView.findViewById(R.id.third_area_item_image), ((g) v0), a.a(((g) v0)));
//            if (((g) object).e != null) {
//                int v2_1 = m.b(((g) object).e.optString("fontColor"));
//                if (v2_1 > 0) {
//                    ((TextView) title).setTextColor(v2_1);
//                }
//            }

            //((g) object).g = "3";
            convertView.setTag(object);
            //convertView.setOnClickListener(this.a);//this
            title = convertView.findViewById(R.id.third_area_item_new);
            if (title != null) {
                //int v0_1 = ((g) object).a() ? 0 : 8;
                title.setVisibility(View.VISIBLE);
            }

            return convertView;
        }
    }

    class FragmentPagerAdapter extends PagerAdapter {

        private CatalogFragment ft;

        private FragmentPagerAdapter(CatalogFragment fragment) {
            ft = fragment;
            //super();
        }

        public GridView getGridView(ViewGroup container, int position) {
            Object object = CatalogFragment.getList(ft).get(position);
            container.addView(((View) object));
            return ((GridView) object);
        }

        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager) container).removeView(((View) object));
        }

        public int getCount() {
            return CatalogFragment.getList(ft).size();
        }

        public Object instantiateItem(ViewGroup container, int position) {
            return getGridView(container, position);
        }

        public boolean isViewFromObject(View view, Object object) {
            boolean v0 = view == (((View)object)) ? true : false;
            return v0;
        }
    }

    private ViewGroup A;
    private ImageView[] images;
    private PullDownScrollView pullDownScrollView;
    private ScrollViewExtend D;
    private View mView;
//    private s F;
//    private GJInformationConatiner G;
    private boolean H;
    private ImageView I;
//    private x J;
//    private x K;
//    private x L;
//    private f M;
//    private com.ganji.android.action.e N;
//    private com.ganji.android.data.GJWeatherMgr$a O;
    LinearLayout b;
    private GJLifeActivity mActivity;
//    private j d;
    private View e;
    private View f;
    private View g;
    private View h;
//    private ActionView i;
//    private c j;
    private ArrayList k;
    private ArrayList l;
    private ImageView m;
    private List n;
    private int o;
    private int p;
    private ViewGroup q;//historyViewGroup
    private int r;
    private int s;
//    private com.ganji.android.d.a$a t;
//    private GJWeatherView u;
//    private GJDaojiaView v;
//    private LikeContainer w;
//    private GJMiddleHomeView x;
    private List y;
    private ViewPager viewPager;

    public CatalogFragment() {
        super();
//        if(Boolean.FALSE.booleanValue()){
//        System.out.println(DontPreverify.class);
//        }

        this.k = new ArrayList();
        this.l = new ArrayList();
        this.n = new ArrayList();
        this.H = false;
        //this.M = new com.ganji.android.d.a$12(this);
        //this.N = new com.ganji.android.d.a$2(this);
        //this.O = new com.ganji.android.d.a$3(this);
    }

    static PullDownScrollView getPullDownScrollView(CatalogFragment fragment) {
        return fragment.pullDownScrollView;
    }

//    public void a(x arg1, x arg2) {
//        this.J = arg1;
//        this.K = arg2;
//    }
//
//    public void a(x arg1) {
//        this.L = arg1;
//    }
//
//    static int a(g arg1) {
//        return a.c(arg1);
//    }

//    private View getGJLifeView(g arg6, ViewGroup arg7, boolean arg8) {
//        View v1 = mActivity.getLayoutInflater().inflate(R.layout.item_jump_entry_area1, arg7, false);
//        View v0 = v1.findViewById(R.id.item_jump_entry_top_space);
//        View v2 = v1.findViewById(R.id.item_jump_entry_bottom_space);
//        if (arg8) {
//            v0.setVisibility(View.VISIBLE);
//            v2.setVisibility(View.GONE);
//        } else {
//            v0.setVisibility(View.GONE);
//            v2.setVisibility(View.GONE);
//        }
//
//        //v1.findViewById(R.id.item_jump_entry_name).setText(arg6.a);
//        //this.a(v1.findViewById(R.id.item_jump_entry_icon), arg6);
//        //v1.setTag(arg6);
//        v1.setOnClickListener(((View.OnClickListener) this));
//        return v1;
//    }

//    private void a(ImageView imageView, g arg6) {
//        int v0 = a.b(arg6);
//        if (this.j()) {
//            imageView.setImageResource(v0);
//        } else {
//            com.ganji.android.c.b.c v1 = new com.ganji.android.c.b.c();
//            v1.a = arg6.c;
//            v1.f = "mainArea1Image";
//            com.ganji.android.c.b.e.a().a(v1, imageView, Integer.valueOf(v0), null);
//        }
//    }
//
//    private void a(ImageView arg3, g arg4, int arg5) {
//        if (arg5 > 0) {
//            arg3.setImageResource(arg5);
//        } else {
//            com.ganji.android.c.b.c v0 = new com.ganji.android.c.b.c();
//            v0.a = arg4.c;
//            com.ganji.android.c.b.e.a().a(v0, arg3);
//        }
//    }

//    private void a(c arg2) {
//        m.a(new Runnable(arg2) {
//            public void run() {
//                a.b(this.b, this.a);
//                if (a.g(this.b) == null || a.g(this.b).a == null || a.g(this.b).a.size() <= 0) {
//                    a.l(this.b);
//                } else {
//                    a.h(this.b);
//                    a.j(this.b).a(a.i(this.b), a.g(this.b).a, false);
//                    a.k(this.b).smoothScrollTo(0, 0);
//                }
//            }
//        });
//    }

//    static void a(a arg0) {
//        arg0.s();
//    }
//
//    static void a(a arg0, ImageView arg1, g arg2, int arg3) {
//        arg0.a(arg1, arg2, arg3);
//    }
//
//    static void a(a arg0, c arg1) {
//        arg0.a(arg1);
//    }
//
//    static void a(a arg0, ad arg1) {
//        arg0.a(arg1);
//    }
//
//    private void a(ad arg2) {
//        if (arg2 != null && arg2.a() != null) {
//            this.u.a(arg2);
//        }
//    }

//    static void a(a arg0, h arg1) {
//        arg0.a(arg1);
//    }
//
//    private void a(h arg4) {
//        int v2 = 8;
//        if (arg4 == null || arg4.a == null) {
//            this.v.setVisibility(View.GONE);
//        } else {
//            if (arg4.b != null && arg4.b.size() >= 0) {
//                this.a(arg4.b);
//            }
//
//            if (arg4.e != null && arg4.e.size() >= 0 && arg4.f != null && arg4.f.size() >= 0) {
//                this.a(arg4.e, arg4.f);
//            }
//
//            if (arg4.g != null && arg4.g.size() >= 0) {
//                this.a(arg4.g, arg4);
//            }
//
//            if (arg4.c != null && arg4.c.size() > 0 && arg4.d != null) {
//                this.b(arg4);
//                this.v.setVisibility(View.VISIBLE);
//                return;
//            }
//
//            this.v.setVisibility(View.GONE);
//        }
//    }

//    private void a(ArrayList list) {
//        int v2;
//        View v0 = mView.findViewById(R.id.large_entry_table);
//        ((TableLayout) v0).removeAllViews();
//        TableRow v4 = null;
//        int v5 = list.size();
//        if (v5 % 4 == 0) {
//            v2 = v5 / 4;
//        } else if (v5 % 4 > 0) {
//            v2 = v5 / 4 + 1;
//        } else {
//            v2 = 0;
//        }
//
//        TableRow v1 = v4;
//        int v4_1 = 0;
//        while (v4_1 < v5) {
//            if (v4_1 % 4 == 0) {
//                v1 = new TableRow(mActivity);
//                ((TableLayout) v0).addView(((View) v1));
//            }
//
//            v1.addView(this.a(list.get(v4_1), v1, this.a(v2, v4_1)));
//            ++v4_1;
//            v1 = v1;
//        }
//
//        this.w();
//    }

//    private void a(ArrayList arg3, ArrayList arg4) {
//        if (mActivity != null && !mActivity.isFinishing()) {
//            View v0 = new com.ganji.android.b.g(mActivity).a(mActivity, ((List) arg3), ((List) arg4));
//            if (v0 != null) {
//                this.b.removeAllViews();
//                this.b.addView(v0);
//            }
//        }
//    }

//    private void a(ArrayList arg6, h arg7) {
//        this.y = new ArrayList();
//        ArrayList v0 = new ArrayList();
//        Iterator v3 = arg6.iterator();
//        int v2 = 0;
//        ArrayList v1;
//        for (v1 = v0; v3.hasNext(); v1 = v0) {
//            ((List) v1).add(v3.next());
//            if (v2 % 10 == 9 || v2 == arg6.size() - 1) {
//                this.a(((List) v1));
//                v0 = new ArrayList();
//            } else {
//                v0 = v1;
//            }
//
//            ++v2;
//        }
//
//        this.k();
//        this.l();
//        View v0_1 = this.getActivity().findViewById(R.id.thrid_area_header_des);
////        if (v0_1 != null && arg7 != null && !TextUtils.isEmpty(arg7.h)) {
////            ((TextView) v0_1).setText(arg7.h);
////        }
//
//        v0_1 = this.getActivity().findViewById(R.id.thrid_area_header_title);
////        if (v0_1 != null && arg7 != null && !TextUtils.isEmpty(arg7.i)) {
////            ((TextView) v0_1).setText(arg7.i);
////        }
//    }

    private boolean a(int arg3, int arg4) {
        int v1;
        boolean v0 = false;
        if ((arg4 + 1) % 4 == 0) {
            v1 = (arg4 + 1) / 4;
        } else if ((arg4 + 1) % 4 > 0) {
            v1 = (arg4 + 1) / 4 + 1;
        } else {
            v1 = 0;
        }

        if (arg3 > v1) {
            v0 = true;
        }

        return v0;
    }

    private void AddGJLifeView(List list) {
        GridView gridView = new GridView(mActivity);
        gridView.setNumColumns(5);
        gridView.setGravity(17);
        gridView.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
        gridView.setSelector(new ColorDrawable(0));
        gridView.setAdapter(new ThirdAreaAdapter(this, list));
        //gridView.setPadding(com.ganji.android.c.f.c.a(8f), 0, com.ganji.android.c.f.c.a(8f), 0);
        this.y.add(gridView);
    }

//    static boolean a(a arg1, int arg2) {
//        return arg1.b(arg2);
//    }

//    public void a() {
//        this.t = new com.ganji.android.d.a$a(this, null);
//        IntentFilter v0 = new IntentFilter();
//        v0.addAction(com.ganji.android.a.a$a.a);
//        v0.addAction("com.ganji.android.action.ACTION_USER_INFO_FETCHED");
//        v0.addAction(d.a);
//        v0.addAction(GJMiddleHomeView.a);
//        this.c.registerReceiver(this.t, v0);
//    }

//    public void a(int arg6) {
//        switch (arg6) {
//            case 0: {
//                if (this.H) {
//                    this.d.d();
//                    return;
//                }
//
//                this.d.g();
//                break;
//            }
//            case 1: {
//                if (this.H) {
//                    this.d.d();
//                } else {
//                    this.d.g();
//                }
//
//                //com.ganji.android.comp.a.a.a("100000000430000300000010","aa","手动");
//                //this.C.setUpdateTime("更新于："+GJWeatherView.a(l.b("life-generic","weather_update_time",System.currentTimeMillis())));
//                break;
//            }
//            case 2: {
//                if (this.H) {
//                    this.d.d();
//                } else {
//                    this.d.g();
//                }
//
//                this.D.setOnTouchListener(new View.OnTouchListener() {
//                    public boolean onTouch(View view , MotionEvent event) {
//                        return true;
//                    }
//                });
//                this.q();
//                if (this.J == null) {
//                    return;
//                }
//
//                //this.J.onCallback();
//                break;
//            }
//            case 3: {
//                if (this.H) {
//                    this.d.e();
//                } else {
//                    this.d.f();
//                }
//
//                this.D.setOnTouchListener(new View.OnTouchListener() {
//                    public boolean onTouch(View view, MotionEvent event) {
//                        return false;
//                    }
//                });
//                //l.a("life-generic","weather_update_time",System.currentTimeMillis());
//                if (this.K == null) {
//                    return;
//                }
//
//                //this.K.onCallback();
//                break;
//            }
//        }
//    }

//    public void b() {
//        t v0 = s.i();
//        if (this.C != null) {
//            if (v0 != null && (v0.b()) && (v0.d())) {
//                this.C.setTheme(v0);
//                return;
//            }
//
//            this.C.b();
//        }
//    }

//    private static int b(g arg6) {
//        int v0 = R.drawable.shouye1_icon_zufang;
//        int v5 = 2;
//        int v1 = arg6.e.optInt("category_id");
//        int v2 = arg6.e.optInt("tab_id");
//        if (arg6.d == 1) {
//            switch (v1) {
//                case 2: {
//                    return R.drawable.shouye1_icon_quanzhi;
//                }
//                case 3: {
//                    return R.drawable.shouye1_icon_jianzhi;
//                }
//                case 5: {
//                    //goto label_24;
//                }
//                case 6: {
//                    return R.drawable.shouye1_icon_ershouche;
//                }
//                case 7: {
//                    //goto label_16;
//                }
//                case 14: {
//                    return R.drawable.shouye1_icon_ershouwupin;
//                }
//            }
//
//        goto label_12;
//            return R.drawable.shouye1_icon_ershouwupin;
//            label_24:
//            if (v2 == 1) {
//                v0 = R.drawable.shouye1_icon_shenghuojiazheng;
//            } else if (v2 == v5) {
//                v0 = R.drawable.shouye1_icon_bendishenghuo;
//            } else {
//                return R.drawable.shouye1_icon_jianzhi;
//                label_16:
//                if (!"租房".equals(arg6.a)) {
//                    v0 = R.drawable.shouye1_icon_fangchan;
//                }
//            }
//        } else if (arg6.d != v5) {
//            label_12:
//            v0 = 0;
//        } else if (v1 == 7) {
//        } else {
//        //goto label_12;
//        }
//
//        return v0;
//    }

//    static c b(a arg0, c arg1) {
//        arg0.j = arg1;
//        return arg1;
//    }
//
//    private void b(h arg3) {
//        if (this.v != null) {
//            this.v.a(arg3, this.c);
//        }
//    }

//    private boolean b(int arg5) {
//        boolean v0_2;
//        int v3 = 2;
//        List list = com.ganji.android.history.f.a().c(this.c);
//        if (list.size() == 0 || list.size() < arg5) {
//            v0_2 = false;
//        } else {
//            Object object = list.get(arg5);
//            if (((com.ganji.android.history.a) object).a() != v3) {
//                v0_2 = false;
//            } else if ("-5".equals(((com.ganji.android.history.a) object).j())) {
//                if (com.ganji.android.comp.g.a.a()) {
//                    this.startActivity(new Intent(this.getActivity(), MyResumePreActivity.class));
//                } else {
//                    Intent intent = new Intent(this.c, GJLifeLoginActivity.class);
//                    intent.putExtra("extra_from", v3);
//                    this.startActivityForResult(intent, 3);
//                }
//
//                v0_2 = true;
//            } else {
//                v0_2 = false;
//            }
//        }
//
//        return v0_2;
//    }

//    static void b(a arg0) {
//        arg0.f();
//    }
//
//    static void b(a arg0, int arg1) {
//        arg0.c(arg1);
//    }
//
//    public void c() {
//        if (this.D != null) {
//            this.D.smoothScrollTo(this.D.getTop(), this.D.getLeft());
//            this.D.smoothScrollTo(this.D.getTop(), this.D.getLeft());
//        }
//    }

//private static int c(g arg4) {
//    int v0_1;
//    String v0 = arg4.a == null ? "" : arg4.a;
//    int v2 = -1;
//    switch (v0.hashCode()) {
//        case -1511818629: {
//            if (!v0.equals("生活电话簿")) {
//        //goto label_7;
//            }
//
//            v0_1 = 11;
//            break;
//        }
//        case 645543: {
//            if (!v0.equals("交友")) {
//        //goto label_7;
//            }
//
//            v0_1 = 19;
//            break;
//        }
//        case 671583: {
//            if (!v0.equals("创业")) {
//        //goto label_7;
//            }
//
//            v0_1 = 21;
//            break;
//        }
//        case 690620: {
//            if (!v0.equals("医疗")) {
//        //goto label_7;
//            }
//
//            v0_1 = 13;
//            break;
//        }
//        case 788255: {
//            if (!v0.equals("彩票")) {
//        //goto label_7;
//            }
//
//            v0_1 = 1;
//            break;
//        }
//        case 818442: {
//            if (!v0.equals("搬家")) {
//        //goto label_7;
//            }
//
//            v0_1 = 0;
//            break;
//        }
//        case 822250: {
//            if (!v0.equals("拼车")) {
//        //goto label_7;
//            }
//
//            v0_1 = 15;
//            break;
//        }
//        case 956892: {
//            if (!v0.equals("理财")) {
//        //goto label_7;
//            }
//
//            v0_1 = 20;
//            break;
//        }
//        case 982930: {
//            if (!v0.equals("短租")) {
//        //goto label_7;
//            }
//
//            v0_1 = 4;
//            break;
//        }
//        case 984633: {
//            if (!v0.equals("票务")) {
//        //goto label_7;
//            }
//
//            v0_1 = 10;
//            break;
//        }
//        case 1105865: {
//            if (!v0.equals("装修")) {
//        //goto label_7;
//            }
//
//            v0_1 = 14;
//            break;
//        }
//        case 1148135: {
//            if (!v0.equals("贷款")) {
//        //goto label_7;
//            }
//
//            v0_1 = 3;
//            break;
//        }
//        case 1149660: {
//            if (!v0.equals("购物")) {
//        //goto label_7;
//            }
//
//            v0_1 = 6;
//            break;
//        }
//        case 20602586: {
//            if (!v0.equals("信用卡")) {
//        //goto label_7;
//            }
//
//            v0_1 = 12;
//            break;
//        }
//        case 21139713: {
//            if (!v0.equals("充话费")) {
//        //goto label_7;
//            }
//
//            v0_1 = 2;
//            break;
//        }
//        case 21308453: {
//            if (!v0.equals("卖手机")) {
//        //goto label_7;
//            }
//
//            v0_1 = 9;
//            break;
//        }
//        case 24620910: {
//            if (!v0.equals("急用钱")) {
//        //goto label_7;
//            }
//
//            v0_1 = 22;
//            break;
//        }
//        case 26732872: {
//            if (!v0.equals("查违章")) {
//        //goto label_7;
//            }
//
//            v0_1 = 18;
//            break;
//        }
//        case 28825709: {
//            if (!v0.equals("火车票")) {
//        //goto label_7;
//            }
//
//            v0_1 = 7;
//            break;
//        }
//        case 29909682: {
//            if (!v0.equals("百宝箱")) {
//        //goto label_7;
//            }
//
//            v0_1 = 16;
//            break;
//        }
//        case 35202192: {
//            if (!v0.equals("订机票")) {
//        //goto label_7;
//            }
//
//            v0_1 = 5;
//            break;
//        }
//        case 679869803: {
//            if (!v0.equals("周边快查")) {
//        //goto label_7;
//            }
//
//            v0_1 = 25;
//            break;
//        }
//        case 766201001: {
//            if (!v0.equals("懒人找房")) {
//        //goto label_7;
//            }
//
//            v0_1 = 26;
//            break;
//        }
//        case 805322509: {
//            if (!v0.equals("教育培训")) {
//        //goto label_7;
//            }
//
//            v0_1 = 8;
//            break;
//        }
//        case 1122395117: {
//            if (!v0.equals("车牌估价")) {
//        //goto label_7;
//            }
//
//            v0_1 = 23;
//            break;
//        }
//        case 1129585319: {
//            if (!v0.equals("车辆估价")) {
//        //goto label_7;
//            }
//
//            v0_1 = 24;
//            break;
//        }
//        case 1205842165: {
//            if (!v0.equals("餐饮工作")) {
//        //goto label_7;
//            }
//
//            v0_1 = 17;
//            break;
//        }
//        default: {
//            label_7:
//            v0_1 = v2;
//            break;
//        }
//    }
//
//    switch (v0_1) {
//        case 0: {
//            v0_1 = R.drawable.ic_jump_03_01;
//            break;
//        }
//        case 1: {
//            v0_1 = R.drawable.ic_jump_03_02;
//            break;
//        }
//        case 2: {
//            v0_1 = R.drawable.ic_jump_03_03;
//            break;
//        }
//        case 3: {
//            v0_1 = R.drawable.ic_jump_03_04;
//            break;
//        }
//        case 4: {
//            v0_1 = R.drawable.ic_jump_03_05;
//            break;
//        }
//        case 5: {
//            v0_1 = R.drawable.ic_jump_03_06;
//            break;
//        }
//        case 6: {
//            v0_1 = R.drawable.ic_jump_03_07;
//            break;
//        }
//        case 7: {
//            v0_1 = R.drawable.ic_jump_03_08;
//            break;
//        }
//        case 8: {
//            v0_1 = R.drawable.ic_jump_03_09;
//            break;
//        }
//        case 9: {
//            v0_1 = R.drawable.ic_jump_03_10;
//            break;
//        }
//        case 10: {
//            v0_1 = R.drawable.ic_jump_03_11;
//            break;
//        }
//        case 11: {
//            v0_1 = R.drawable.ic_jump_03_12;
//            break;
//        }
//        case 12: {
//            v0_1 = R.drawable.ic_jump_03_13;
//            break;
//        }
//        case 13: {
//            v0_1 = R.drawable.ic_jump_03_14;
//            break;
//        }
//        case 14: {
//            v0_1 = R.drawable.ic_jump_03_15;
//            break;
//        }
//        case 15: {
//            v0_1 = R.drawable.ic_jump_03_16;
//            break;
//        }
//        case 16: {
//            v0_1 = R.drawable.ic_jump_03_17;
//            break;
//        }
//        case 17: {
//            v0_1 = R.drawable.ic_jump_03_18;
//            break;
//        }
//        case 18: {
//            v0_1 = R.drawable.ic_jump_03_19;
//            break;
//        }
//        case 19: {
//            v0_1 = R.drawable.ic_jump_03_20;
//            break;
//        }
//        case 20: {
//            v0_1 = R.drawable.ic_jump_03_21;
//            break;
//        }
//        case 21: {
//            v0_1 = R.drawable.ic_jump_03_22;
//            break;
//        }
//        case 22: {
//            v0_1 = R.drawable.ic_jump_03_23;
//            break;
//        }
//        case 23: {
//            v0_1 = R.drawable.ic_jump_03_024;
//            break;
//        }
//        case 24: {
//            v0_1 = R.drawable.ic_jump_03_025;
//            break;
//        }
//        case 25: {
//            v0_1 = R.drawable.ic_jump_03_026;
//            break;
//        }
//        case 26: {
//            v0_1 = R.drawable.ic_jump_03_027;
//            break;
//        }
//        default: {
//            v0_1 = 0;
//            break;
//        }
//    }
//
//    return v0_1;
//}

//    private void c(int arg10) {
//        if (this.n != null && this.n.size() > 0) {
//            Object v8 = this.n.get(arg10);
//            com.ganji.android.history.f.a().a(this.c, ((com.ganji.android.history.a) v8));
//            int v0 = ((com.ganji.android.history.a) v8).a();
//            switch (v0) {
//                case -1: {
//        goto label_50;
//                }
//                case 0: {
//        goto label_24;
//                }
//                case 1: {
//        goto label_28;
//                }
//                case 2:
//                case 3: {
//        goto label_75;
//                }
//                case -22:
//                case -21:
//                case -2:
//                case 6:
//                case 14: {
//        goto label_54;
//                }
//            }
//
//            u.a(this.c, ((com.ganji.android.history.a) v8).a(), ((com.ganji.android.history.a) v8).b(), ((com.ganji.android.history.a) v8).c(), ((com.ganji.android.history.a) v8).l(), ((com.ganji.android.history.a) v8).m(), ((com.ganji.android.history.a) v8).g(), "");
//            return;
//            label_50:
//            i.g(this.getActivity(), "discovery");
//            return;
//            label_54:
//            if (((com.ganji.android.history.a) v8).e() != null && !TextUtils.isEmpty(((com.ganji.android.history.a) v8).e())) {
//                u.a(this.c, ((com.ganji.android.history.a) v8).a(), ((com.ganji.android.history.a) v8).d(), ((com.ganji.android.history.a) v8).e(), true);
//                return;
//            }
//
//            u.a(this.c, ((com.ganji.android.history.a) v8).a(), ((com.ganji.android.history.a) v8).b(), ((com.ganji.android.history.a) v8).c(), ((com.ganji.android.history.a) v8).l(), ((com.ganji.android.history.a) v8).m(), ((com.ganji.android.history.a) v8).g(), "");
//            return;
//            label_24:
//            u.a(this.c, ((com.ganji.android.history.a) v8).e());
//            return;
//            label_75:
//            u.a(this.c, ((com.ganji.android.history.a) v8).a(), ((com.ganji.android.history.a) v8).b(), ((com.ganji.android.history.a) v8).c(), ((com.ganji.android.history.a) v8).h(), ((com.ganji.android.history.a) v8).g(), ((com.ganji.android.history.a) v8).i(), ((com.ganji.android.history.a) v8).j(), ((com.ganji.android.history.a) v8).k());
//            return;
//            label_28:
//            com.ganji.android.common.af$a v1 = new com.ganji.android.common.af$a();
//            v1.a = this.getActivity();
//            v1.b = 1;
//            v1.c = v0;
//            v1.d = ((com.ganji.android.history.a) v8).b();
//            Intent v1_1 = af.a(v1);
//            v1_1.putExtra("extra_category_id", v0);
//            v1_1.putExtra("extra_subcategory_id", ((com.ganji.android.history.a) v8).b());
//            v1_1.putExtra("extra_subcategory_name", ((com.ganji.android.history.a) v8).c());
//            v1_1.putExtra("extra_display_style", ((com.ganji.android.history.a) v8).g());
//            this.startActivity(v1_1);
//        }
//    }
//
//    static int c(a arg0, int arg1) {
//        arg0.o = arg1;
//        return arg1;
//    }
//
//    static GJLifeActivity c(a arg1) {
//        return arg1.c;
//    }
//
//    public void d() {
//        try {
//            if (this.F == null) {
//                return;
//            }
//
//            if (s.j() == null) {
//                return;
//            }
//
//            if (s.j().b == null) {
//                return;
//            }
//
//            this.a(s.j().b);
//        } catch (Exception v0) {
//            com.ganji.android.c.f.a.a(((Throwable) v0));
//        }
//    }
//
//    static int d(a arg0, int arg1) {
//        arg0.p = arg1;
//        return arg1;
//    }
//
//    static LikeContainer d(a arg1) {
//        return arg1.w;
//    }
//
//    public ImageView e() {
//        return this.I;
//    }
//
//    static j e(a arg1) {
//        return arg1.d;
//    }
//
//    private void f() {
//        com.ganji.android.like.f.a(new com.ganji.android.like.f$a() {
//            public void a() {
//                m.a(new Runnable() {
//                    public void run() {
//                        a.d(this.a.a).setVisibility(View.GONE);
//                    }
//                });
//            }
//
//            public void a(com.ganji.android.like.g arg2) {
//                m.a(new Runnable(arg2) {
//                    public void run() {
//                        if (a.c(this.b.a) != null && !a.c(this.b.a).isFinishing()) {
//                            if (this.a != null && this.a.g != null) {
//                                a.d(this.b.a).a(this.a, a.c(this.b.a));
//                                a.d(this.b.a).setVisibility(0);
//                                a.e(this.b.a).a(this.a);
//                                return;
//                            }
//
//                            a.d(this.b.a).setVisibility(8);
//                        }
//                    }
//                });
//            }
//        }, "index", "0");
//    }
//
//    static s f(a arg1) {
//        return arg1.F;
//    }
//
//    static c g(a arg1) {
//        return arg1.j;
//    }

//    private void g() {
//        View v0 = this.getActivity().findViewById(R.id.bottom_image);
//        Bitmap v1 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.category_main_tab_tip);
//        if (v1 != null) {
//            ((ImageView) v0).getLayoutParams().height = v1.getHeight() * com.ganji.android.c.f.d.h / v1.getWidth();
//        }
//
//        ((ImageView) v0).setImageBitmap(v1);
//        ((ImageView) v0).setVisibility(View.VISIBLE);
//    }
//
//    static void h(a arg0) {
//        arg0.v();
//    }

//    private void h() {
//        com.ganji.android.comp.model.c v0 = com.ganji.android.comp.city.a.a(false);
//        String v0_1 = v0 == null ? "12" : v0.a;
//        com.ganji.android.common.j.b(v0_1, new y() {
//            public void a(h arg2) {
//                if (!a.c(this.a).isFinishing()) {
//                    m.a(new Runnable(arg2) {
//                        public void run() {
//                            if (this.a != null) {
//                                a.a(this.b.a, this.a);
//                                if (a.f(this.b.a) != null) {
//                                    a.f(this.b.a).k();
//                                }
//                            }
//                        }
//                    });
//                }
//            }

//    public void onCallback(Object arg1) {
//        this.a(((h) arg1));
//    }
//});
//        }

//static View i(a arg1){
//        return arg1.f;
//        }
//
//private void i(){
//        if(!this.c.isFinishing()){
//        com.ganji.android.comp.model.c v0=com.ganji.android.comp.city.a.a(false);
//        String v0_1=v0==null?"12":v0.a;
//        this.a(com.ganji.android.common.j.a(v0_1,new y(){
//public void a(h arg2){
//        m.a(new Runnable(arg2){
//public void run(){
//        a.a(this.b.a,this.a);
//        }
//        });
//        }

//public void onCallback(Object arg1){
//        this.a(((h)arg1));
//        }
//        }));
//        }
//        }

//private boolean j(){
//        boolean v0=s.i()==null||!s.i().b()||!s.i().d()?false:true;
//        return v0;
//        }
//
//static ActionView j(a arg1){
//        return arg1.i;
//        }
//
//static ScrollViewExtend k(a arg1){
//        return arg1.D;
//        }

    private void k() {
        int v8 = -2;
        images = new ImageView[this.y.size()];
        this.A = (ViewGroup) mActivity.findViewById(R.id.dotImageLayout);
        this.A.removeAllViews();
        int v0;
        for (v0 = 0; v0 < this.y.size(); ++v0) {
            LinearLayout.LayoutParams v2 = new LinearLayout.LayoutParams(v8, v8);
            int v3 = ((int) getContext().getResources().getDisplayMetrics().density);
            ImageView v4 = new ImageView(getContext());
            //v4.setLayoutParams(new ViewGroup.LayoutParams(com.ganji.android.c.f.c.a(10f), com.ganji.android.c.f.c.a(3f)));
            if (v0 != 0) {
                v4.setPadding(v3 * 5, 0, 0, 0);
            }

            if (v0 == 0) {
                v4.setImageResource(R.drawable.thrid_area_dot_selected);
            } else {
                v4.setImageResource(R.drawable.thrid_area_dot_unselected);
            }

            images[v0] = v4;
            this.A.addView(((View) v4), ((ViewGroup.LayoutParams) v2));
        }
    }

//    static void l(a arg0) {
//        arg0.u();
//    }

//    private void l() {
//        viewPager = (ViewPager) mActivity.findViewById(R.id.thrid_area_content);
//        viewPager.setAdapter(new FragmentPagerAdapter(this, null));
//        //viewPager.setOnPageChangeListener(new com.ganji.android.d.a$b(this, null));
//    }

//    static ViewGroup m(a arg1) {
//        return arg1.q;
//    }

//    private void m() {
//        int v5 = -1;
//        if (mView != null && this.getActivity() != null) {
//            View v0 = mView.findViewById(R.id.action_host_container);
//            ((ViewGroup) v0).removeAllViews();
//            this.e = this.getActivity().getLayoutInflater().inflate(R.layout.catalog_ation, ((ViewGroup) v0), true);
//            this.g = this.e.findViewById(R.id.action_default_image);
//            this.h = this.e.findViewById(R.id.action_load_fail);
//            this.f = this.e.findViewById(R.id.action_top_all_layout);
//            this.i = (ActionView) this.e.findViewById(R.id.top_action_view);
//            this.i.setDefaultView(this.g);
//            this.i.setLoadFaileView(this.h);
//            this.i.a(this.N, "01110", "01100", 1, v5, v5, "top");
//            this.e.findViewById(R.id.action_load_fail_button).setOnClickListener(((View.OnClickListener) this));
//            BitmapFactory.Options v0_1 = new BitmapFactory.Options();
//            v0_1.inJustDecodeBounds = true;
//            BitmapFactory.decodeResource(mActivity.getResources(), R.drawable.action_defualt, v0_1);
//            this.f.getLayoutParams().height = v0_1.outHeight * com.ganji.android.c.f.d.h / v0_1.outWidth;
//        }
//    }

//    static ImageView n(a arg1) {
//        return arg1.m;
//    }

//    private void n() {
//        LayoutInflater v3 = LayoutInflater.from(this.getActivity());
//        this.q = (ViewGroup) mView.findViewById(R.id.history_record_container);
//        int v1;
//        for (v1 = 0; v1 < 10; ++v1) {
//            View v0 = v3.inflate(R.layout.item_browse_record, this.q, false);
//            ((TextView) v0).setTextColor(Color.parseColor("#676767"));
//            ((TextView) v0).setTag(Integer.valueOf(v1));
//            //((TextView) v0).setOnClickListener(new View.OnClickListener() {
//                //public void onClick(View arg4) {
////                    com.ganji.android.comp.a.a.a("100000000406003200000010");
////                    com.ganji.android.comp.a.a.a("100000002586002300000010", "gc", "/all_cate/-/-/-/1000");
////                    int v0 = arg4.getTag().intValue();
////                    if (!a.a(this.a, v0)) {
////                        a.b(this.a, v0);
////                    }
//                //}
//            //});
//            this.k.add(v0);
//            this.q.addView(v0);
//        }
//
//        this.m = (ImageView) mView.findViewById(R.id.category_history_clear);
//    }

//    static ArrayList o(a arg1) {
//        return arg1.k;
//    }

//    private void o() {
//        int v5 = 4;
//        this.n = com.ganji.android.history.f.a().c(this.c);
//        Iterator v1 = this.k.iterator();
//        while (v1.hasNext()) {
//            Object v0 = v1.next();
//            ((TextView) v0).setVisibility(v5);
//            ((TextView) v0).setTextColor(Color.parseColor("#676767"));
//        }
//
//        int v4 = this.n != null ? this.n.size() : 0;
//        if (v4 == 0) {
//            this.k.get(0).setVisibility(0);
//            this.k.get(0).setText("您浏览过的类别将显示在这里喔~");
//            this.k.get(0).setTextColor(Color.parseColor("#676767"));
//            this.m.setVisibility(v5);
//        } else {
//            this.q.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(v4) {
//                public void onGlobalLayout() {
//                    a.m(this.b).getViewTreeObserver().removeGlobalOnLayoutListener(((ViewTreeObserver.OnGlobalLayoutListener) this));
//                    a.c(this.b, a.n(this.b).getLeft());
//                    int v1 = 0;
//                    int v3 = 0;
//                    while (v1 < this.a) {
//                        Object v0 = a.o(this.b).get(v1);
//                        a.d(this.b, ((TextView) v0).getRight());
//                        if (a.p(this.b) < a.q(this.b) - com.ganji.android.c.f.c.a(5f)) {
//                            ((TextView) v0).setVisibility(0);
//                            ++v3;
//                        }
//
//                        ++v1;
//                    }
//                }
//            });
//            int v2;
//            for (v2 = 0; v2 < v4; ++v2) {
//                if (TextUtils.equals(this.n.get(v2).c(), "婚恋交友")) {
//                    this.n.get(v2).a("老乡交友");
//                }
//
//                this.k.get(v2).setText(this.n.get(v2).c());
//            }
//
//            this.m.setVisibility(View.VISIBLE);
//        }

//        this.m.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg4) {
//                //com.ganji.android.comp.a.a.a("100000000406003500000010");
//                //com.ganji.android.comp.a.a.a("100000002586002400000010", "gc", "/all_cate/-/-/-/1000");
//                //com.ganji.android.history.f.a().i();
//                //a.r(this.a);
//            }
//        });
//    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
         mActivity = (GJLifeActivity)this.getActivity();
//        this.I = this.E.findViewById(R.id.img_activity_small_ad);
//        this.r = com.ganji.android.c.f.d.h;
//        this.s = com.ganji.android.c.f.d.k;
//        this.d = new j(this);
//        this.d.a();
//        GJWeatherMgr.b(this.O);
//        this.u = this.E.findViewById(R.id.new_weather_view);
//        this.u.setmCatalogFragment(this);
//        this.u.a();
//        this.v = this.E.findViewById(R.id.daojia_middle);
//        this.b = this.E.findViewById(R.id.layout_area2);
//        this.m();
//        this.v();
//        this.d.c();
//        b.a(1, -1, -1, this.M);
//        this.n();
//        this.i();
//        this.a(GJWeatherMgr.a());
//        this.a();
//        this.x = this.E.findViewById(R.id.banner_middle);
//        this.x.a(this.getActivity());
//        this.x.a(1200000);
//        this.C = this.getActivity().findViewById(R.id.refresh_root);
//        this.C.setOnPullStateChangedListener(((com.ganji.im.widget.PullDownScrollParentView.a) this));
//        com.ganji.android.b.l v0 = new com.ganji.android.b.l(this.getActivity());
//        this.C.setPullDownElastic(((com.ganji.im.widget.a) v0));
//        View v3 = this.getView().findViewById(R.id.layout_refresh_background);
//        v3.getLayoutParams().height = com.ganji.android.c.f.d.i / 2;
//        v3.requestLayout();
//        v0.a(this.getView().findViewById(R.id.img_pull_2_refresh_planet), this.getView().findViewById(R.id.txt_refresh_text), v3, this.getView().findViewById(R.id.img_refresh_star), this.getView().findViewById(R.id.view_refresh_cover_night));
//        this.D = this.getActivity().findViewById(R.id.scrollview);
//        this.D.setOnScrollListener(this.d);
//        this.g();
//        this.b();
//        this.w = this.E.findViewById(R.id.likeContainer);
//        new Handler().postDelayed(new Runnable() {
//            public void run() {
//                a.a(this.a);
//                a.b(this.a);
//            }
//        }, 1600);
//        if (this.getActivity() != null && ((this.getActivity() instanceof MainActivity))) {
//            this.F = this.getActivity().getGJThemeController();
//            if (this.F != null) {
//                this.F.a();
//            }
//        }
//
//        this.h();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == 7) {
//            if (com.ganji.android.comp.g.c.i()) {
//                n.a("今日已经签到过啦，明天继续哦");
//            } else {
//                GJLifeActivity.getPoints(this.c, "3", new com.ganji.android.control.GJLifeActivity$a() {
//                    public void onHttp(boolean arg2) {
//                        m.a(new Runnable(arg2) {
//                            public void run() {
//                                if (this.a) {
//                                    n.a("签到成功");
//                                } else {
//                                    n.a("签到失败");
//                                }
//
//                                a.s(this.b.a).a();
//                            }
//                        });
//                    }
//                });
//            }
//        } //else if (arg4 == 3 && (com.ganji.android.comp.g.a.a())) {
//            //this.startActivity(new Intent(this.c, MyResumePreActivity.class));
//        //}

        super.onActivityResult(requestCode,resultCode,data);
        this.onResume();
    }

//    public void onClick(View view) {
//        int v2 = -1;
//        switch (view.getId()) {
//            case R.id.action_load_fail_button: {
//                this.f.setVisibility(View.GONE);
//                this.h.setVisibility(View.GONE);
//                this.g.setVisibility(View.VISIBLE);
//                if (this.j != null && this.j.a != null && this.j.a.size() > 0) {
//                    this.i.a(this.f, this.j.a, false);
//                    return;
//                }
//
//                b.a(1, v2, v2, this.M);
//                break;
//            }
//            default: {
//                if ((view.getTag() instanceof g)) {
//                    Object v0 = view.getTag();
//                    HashMap v1_1 = new HashMap();
//                    if (TextUtils.equals(((g) v0).g, "1")) {
//                        v1_1.put("al", "第一区");
//                    } else {
//                        if (!TextUtils.equals(((g) v0).g, "2_1") && !TextUtils.equals(((g) v0).g, "2_2")) {
//                            if (TextUtils.equals(((g) v0).g, "3")) {
//                                v1_1.put("al", "第三区");
//                            } else {
//                            }
//
//        //goto label_18;
//                        }
//
//                        v1_1.put("al", "第二区");
//                    }
//
//                    //label_18:
//                    //v1_1.put("am", ((g) v0).a);
//                    //v1_1.put("ac", com.ganji.android.comp.city.a.a().a);
//                    //com.ganji.android.comp.a.a.a("100000000406003000000010", ((Map) v1_1));
//                    //v1_1.put("gc", "/all_cate/-/-/-/1000");
//                    //com.ganji.android.comp.a.a.a("100000002586002100000010", ((Map) v1_1));
//                    //((g) v0).jump(this.c);
//                }
//
//                break;
//            }
//        }
//    }

    public void onCreate(Bundle arg1) {
        super.onCreate(arg1);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup arg4, Bundle arg5) {
        mView = inflater.inflate(R.layout.fragment_main, null);
        return mView;
    }

    public void onDestroy() {
        super.onDestroy();
//        b.a(this.i);
//        GJWeatherMgr.c(this.O);
//        if (this.d != null) {
//            this.d.h();
//        }
//
//        if (this.t != null) {
//            this.c.unregisterReceiver(this.t);
//            this.t = null;
//        }
    }

    public void onResume() {
        super.onResume();
        if (mActivity != null) {
            mActivity.getWindow().setSoftInputMode(2);
        }

//        if (this.d != null) {
//            this.d.a();
//        }
//
//        if (this.u != null) {
//            this.u.a();
//        }

//        try {
//            this.o();
//        } catch (Exception v0) {
//            //com.ganji.android.c.f.a.a(((Throwable) v0));
//        }

        //this.p();
//        if (!com.ganji.android.common.j.b(com.ganji.android.common.j.a(com.ganji.android.comp.city.a.a().a, null))) {
//            this.q();
//        }
//
//        if (this.L != null) {
//            this.L.onCallback();
//        }
    }

//    static int p(a arg1) {
//        return arg1.p;
//    }
//
//    private void p() {
//        com.ganji.android.c.c.c.a().a(new com.ganji.android.k.a());
//    }
//
//    static int q(a arg1) {
//        return arg1.o;
//    }

//    private void q() {
//        if (this.E != null && this.getActivity() != null) {
//            this.t();
//            this.r();
//            String v1 = com.ganji.android.comp.city.a.a().a;
//            h v0 = com.ganji.android.common.j.a(v1, null);
//            String v0_1 = v0 != null ? v0.a : "";
//            com.ganji.android.common.j.a(v1, v0_1, new y() {
//                public void a(h arg2) {
//                    m.a(new Runnable(arg2) {
//                        public void run() {
//                            int v2 = -1;
//                            if (this.a != null) {
//                                a.a(this.b.a, this.a);
//                            }
//
//                            if (a.f(this.b.a) != null) {
//                                a.f(this.b.a).k();
//                            }
//
//                            a.a(this.b.a, GJWeatherMgr.a());
//                            b.a(1, v2, v2, new f() {
//                                public void a(c arg2) {
//                                    m.a(new Runnable(arg2) {
//                                        public void run() {
//                                            a.z(this.b.a.b.a);
//                                            a.a(this.b.a.b.a, this.a);
//                                            com.ganji.android.like.f.a(new com.ganji.android.like.f$a() {
//                                                public void a() {
//                                                    m.a(new Runnable() {
//                                                        public void run() {
//                                                            a.d(this.a.a.b.a.b.a).setVisibility(8);
//                                                            a.A(this.a.a.b.a.b.a).a();
//                                                        }
//                                                    });
//                                                }
//
//                                                public void a(com.ganji.android.like.g arg2) {
//                                                    m.a(new Runnable(arg2) {
//                                                        public void run() {
//                                                            if (this.a == null || this.a.g == null) {
//                                                                a.d(this.b.a.b.a.b.a).setVisibility(8);
//                                                            } else {
//                                                                a.d(this.b.a.b.a.b.a).getmSubContainer().removeAllViews();
//                                                                a.d(this.b.a.b.a.b.a).a(this.a, a.c(this.b.a.b.a.b.a));
//                                                                a.d(this.b.a.b.a.b.a).setVisibility(0);
//                                                                a.e(this.b.a.b.a.b.a).a(this.a);
//                                                            }
//
//                                                            a.A(this.b.a.b.a.b.a).a();
//                                                        }
//                                                    });
//                                                }
//                                            }, "index", "0");
//                                        }
//                                    });
//                                }
//                            });
//                        }
//                    });
//                }
//
//                public void onCallback(Object arg1) {
//                    this.a(((h) arg1));
//                }
//            });
//        }
//    }

//    static void r(a arg0) {
//        arg0.o();
//    }
//
//    private void r() {
//        if (this.x != null) {
//            this.x.b(this.getActivity());
//        }
//    }

//    private void s() {
//        if (mView != null && this.getActivity() != null) {
//            this.G = this.getActivity().findViewById(R.id.informationContainer);
//            this.G.b(this.getActivity());
//            this.G.a(1200000);
//        }
//    }

//    static GJWeatherView s(a arg1) {
//        return arg1.u;
//    }

//    public void setUserVisibleHint(boolean arg2) {
//        if (arg2) {
//            try {
//                com.ganji.android.comp.utils.j.a(((Fragment) this));
//            } catch (Exception v0) {
//                com.ganji.android.c.f.a.a(((Throwable) v0));
//            }
//        }
//
//        super.setUserVisibleHint(arg2);
//    }

//    private void t() {
//        if (this.G != null) {
//            this.G.a(this.getActivity());
//        }
//    }
//
//    static void t(a arg0) {
//        arg0.q();
//    }
//
//    private void u() {
//        if (this.e != null) {
//            this.e.setVisibility(8);
//            if (this.H) {
//                this.H = false;
//                this.d.b();
//            }
//        }
//    }
//
//    static GJInformationConatiner u(a arg1) {
//        return arg1.G;
//    }
//
//    private void v() {
//        if (this.e != null) {
//            this.e.setVisibility(0);
//            this.e.requestFocus();
//            if (!this.H) {
//                this.H = true;
//                this.d.c();
//            }
//        }
//    }
//
//    static GJMiddleHomeView v(a arg1) {
//        return arg1.x;
//    }
//
//    private void w() {
//        int v6;
//        if (this.F == null) {
//            return;
//        }
//
//        try {
//            t v0_1 = s.i();
//            if (v0_1 == null) {
//                return;
//            }
//
//            if (!v0_1.b()) {
//                return;
//            }
//
//            if (!v0_1.d()) {
//                return;
//            }
//
//            if (!this.F.h()) {
//                return;
//            }
//
//            HashMap v7 = this.F.g();
//            View v0_2 = this.E.findViewById(R.id.large_entry_table);
//            int v8 = ((TableLayout) v0_2).getChildCount();
//            v6 = 0;
//            while (true) {
//                label_21:
//                if (v6 >= v8) {
//                    return;
//                }
//
//                View v1 = ((TableLayout) v0_2).getChildAt(v6);
//                int v4;
//                for (v4 = 0; v4 < 4; ++v4) {
//                    ((TableRow) v1).getChildAt(v4).findViewById(R.id.item_jump_entry_icon).setImageBitmap(v7.get(Integer.valueOf(v6 * 4 + v4)));
//                }
//            }
//        } catch (Exception v0) {
//        goto label_41;
//        }
//
//        ++v6;
//        goto label_21;
//        label_41:
//        com.ganji.android.c.f.a.a(((Throwable) v0));
//    }
//
//    static int w(a arg1) {
//        return arg1.r;
//    }
//
    static List getList(CatalogFragment ft) {
        return ft.y;
    }

    static ImageView[] getImages(CatalogFragment ft) {
        return ft.images;
    }
//
//    static void z(a arg0) {
//        arg0.m();
//    }
}

