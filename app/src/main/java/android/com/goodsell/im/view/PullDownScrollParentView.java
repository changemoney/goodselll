package android.com.goodsell.im.view;

import android.com.goodsell.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import widget.ElasticMove;


public class PullDownScrollParentView extends LinearLayout {
    public interface a {
        void a(int arg1);
    }

    public interface StickyListener {
        int a(int arg1);
    }

    private float A;
    private float B;
    //private n C;
    protected int a;
    protected int b;
    protected RotateAnimation c;
    protected RotateAnimation d;
    protected float e;
    protected float f;
    protected float g;
    protected int h;
    protected float i;
    protected String j;
    protected String k;
    protected String l;
    protected ElasticMove m;
    protected float n;
    protected StickyListener o;
    protected int p;
    protected float q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    private boolean v;
    private boolean w;
    private a x;
    private float y;
    private float z;

    public PullDownScrollParentView(Context context) {
        this(context, null);
//        if(Boolean.FALSE.booleanValue()) {
//            System.out.println(DontPreverify.class);
//        }
    }

    public PullDownScrollParentView(Context context, AttributeSet arg7) {
        super(context, arg7);
        this.a = -60;
        this.e = 0f;
        this.f = -1f;
        this.g = -1f;
        this.j = "赶紧松开！我要刷新了";
        this.k = "";
        this.l = "";
        this.n = 1f;
        this.p = 25;
        this.q = 0f;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.v = false;
        this.w = false;
        this.c();
        this.u = context.getResources().getDimensionPixelOffset(R.dimen.page_pull_2_refresh_max_height);
    }

    private void a(int arg5, int arg6, boolean arg7) {
        //int v0 = this.m.a().getLayoutParams().topMargin;
//        if(this.C != null) {
//            this.C.f();
//            if(this.C.c()) {
//                this.C.b();
//            }
//        }
//
//        this.C = j.b(new float[]{((float)v0), ((float)arg5)});
//        this.C.c(300);
//        this.C.a(new com.a.a.n$b() {
//            public void onAnimationUpdate(n arg3) {
//                PullDownScrollParentView.a(this.a, ((int)arg3.l().floatValue()));
//            }
//        });
//        this.C.a();
//        this.C.a(new com.a.a.b(arg6, arg7) {
//            public void onAnimationEnd(com.a.a.a arg4) {
//                this.c.h = this.a;
//                PullDownScrollParentView.a(this.c, this.c.h, this.b);
//            }
//        });
    }

    static void a(PullDownScrollParentView arg0, int arg1) {
        arg0.setMargin(arg1);
    }

    static void a(PullDownScrollParentView arg0, int arg1, boolean arg2) {
        arg0.a(arg1, arg2);
    }

    private void a(int arg4, boolean arg5) {
        int v2 = 8;
//        this.m.a(arg4, arg5);
//        switch(arg4) {
//            case 0: {
//                this.m.a(0);
//                this.m.b(v2);
//                this.m.c(0);
//                this.m.a(this.j);
//                this.m.c();
//                this.m.a(this.c);
//                break;
//            }
//            case 1: {
//                this.m.a(0);
//                this.m.b(v2);
//                this.m.c(0);
//                this.m.a(this.k);
//                this.m.c();
//                if(!arg5) {
//                    goto label_5;
//                }
//
//                this.m.a(this.d);
//                break;
//            }
//            case 2: {
//                this.m.a(v2);
//                this.m.b(0);
//                this.m.c(0);
//                this.m.a(this.l);
//                this.m.c();
//                break;
//            }
//            case 3: {
//                this.m.b(v2);
//                this.m.c();
//                break;
//            }
//        }
//
//        label_5:
//        if(this.x != null) {
//            this.x.a(arg4);
//        }
    }

    private void move(MotionEvent arg9) {
//        int v2 = 2;
//        int v7 = 3;
//        if(this.x != null && this.m != null) {
//            switch(arg9.getAction() & 255) {
//                case 1: {
//                    goto label_13;
//                }
//                case 2: {
//                    goto label_46;
//                }
//                case 5: {
//                    goto label_166;
//                }
//            }
//
//            return;
//            label_166:
//            if(arg9.getPointerCount() == v2) {
//                this.r = arg9.getPointerId(0);
//                this.s = arg9.getPointerId(1);
//                if(this.t == this.r) {
//                    this.g = arg9.getY(1);
//                }
//                else {
//                    this.f = arg9.getY(1);
//                    return;
//                    label_13:
//                    this.q = 0f;
//                    if(this.h != v2) {
//                        if(this.h == v7) {
//                            this.a(this.a, v7, true);
//                            this.a(this.h, false);
//                        }
//
//                        if(this.h == 1) {
//                            this.h = 5;
//                            this.a(this.h, false);
//                            this.a(this.a, v7, false);
//                        }
//
//                        if(this.h != 0) {
//                            return;
//                        }
//
//                        this.h = 4;
//                        this.a(this.h, false);
//                        this.i = ((((float)(((int)arg9.getY())))) - this.f) / 1.3f;
//                        this.a(0, v2, false);
//                        return;
//                        label_46:
//                        if(arg9.getPointerCount() > v2) {
//                            return;
//                        }
//
//                        if(arg9.findPointerIndex(this.t) == -1) {
//                            this.t = this.r;
//                            if(arg9.findPointerIndex(this.r) == -1) {
//                                this.t = this.s;
//                                if(arg9.findPointerIndex(this.s) != -1) {
//                                    goto label_64;
//                                }
//
//                                return;
//                            }
//                        }
//
//                        label_64:
//                        if(arg9.findPointerIndex(this.t) == -1) {
//                            return;
//                        }
//
//                        float v0 = arg9.getY(arg9.findPointerIndex(this.t));
//                        if(this.h == v2) {
//                            return;
//                        }
//
//                        if(this.h == 4) {
//                            return;
//                        }
//
//                        if(this.h == 5) {
//                            return;
//                        }
//
//                        float v1 = this.q + (v0 - this.getFingerStartY()) / 1.3f;
//                        if(v1 - (((float)this.b)) > (((float)this.u))) {
//                            this.a(arg9, v0);
//                            return;
//                        }
//
//                        if(v1 < 0f) {
//                            this.a(arg9, v0);
//                            return;
//                        }
//
//                        this.q += (v0 - this.getFingerStartY()) / 1.3f;
//                        if(this.h == 0) {
//                            if(this.q < (((float)this.b)) && this.q > 0f) {
//                                this.h = 1;
//                                this.a(this.h, true);
//                                goto label_114;
//                            }
//
//                            if(this.q > 0f) {
//                                goto label_114;
//                            }
//
//                            this.h = v7;
//                            this.a(this.h, false);
//                            this.q = 0f;
//                        }
//
//                        label_114:
//                        if(this.h == v7) {
//                            if(this.q > 0f) {
//                                this.h = 1;
//                                this.a(this.h, false);
//                            }
//                            else {
//                                this.h = v7;
//                                this.a(this.h, false);
//                                this.setMargin(this.a);
//                                this.q = 0f;
//                            }
//                        }
//
//                        if(this.h == 1) {
//                            if(this.q >= (((float)this.b))) {
//                                this.h = 0;
//                                this.a(this.h, false);
//                            }
//                            else if(this.q <= 0f) {
//                                this.h = v7;
//                                this.a(this.h, false);
//                                this.setMargin(this.a);
//                                this.q = 0f;
//                            }
//                        }
//
//                        if(this.q > 0f) {
//                            this.setMargin(((int)(this.q + (((float)this.a)))));
//                        }
//                        else {
//                            this.setMargin(this.a);
//                        }
//
//                        this.a(arg9, v0);
//                    }
//                }
//            }
//        }
    }

    private void move(MotionEvent arg4, float arg5) {
        int v1 = 2;
        int v2 = -1;
        if(arg4.getPointerCount() <= v1) {
            if(arg4.getPointerCount() == v1 && this.s != v2 && this.r != v2) {
                if(this.t == this.r) {
                    if(arg4.findPointerIndex(this.s) != v2) {
                        this.f = arg5;
                        this.g = arg4.getY(arg4.findPointerIndex(this.s));
                    }
                    else {
                    }
                }
                else if(arg4.findPointerIndex(this.r) != v2) {
                    this.f = arg4.getY(arg4.findPointerIndex(this.r));
                    this.g = arg5;
                }
                else {
                }

                return;
            }

            if(arg4.getPointerCount() != 1) {
                return;
            }

            if(this.t == this.r) {
                this.f = arg5;
                return;
            }

            this.g = arg5;
        }
    }

    public boolean a(PullDownScrollParentView arg2) {
        return false;
    }

    public void a() {
        if(this.m != null) {
            this.h = 5;
            this.a(this.h, false);
            this.m.a(8);
            this.m.c(0);
            this.a(this.a, 3, false);
        }
    }

    public void a(String arg1, String arg2, String arg3) {
        this.k = arg1;
        this.j = arg2;
        this.l = arg3;
    }

    public void a(boolean arg2) {
        this.w = true;
        this.v = arg2;
    }

    public void b() {
    }

    private void c() {
        this.c = new RotateAnimation(0f, -180f, 1, 0.5f, 1, 0.5f);
        this.c.setInterpolator(new LinearInterpolator());
        this.c.setDuration(250);
        this.c.setFillAfter(true);
        this.d = new RotateAnimation(-180f, 0f, 1, 0.5f, 1, 0.5f);
        this.d.setInterpolator(new LinearInterpolator());
        this.d.setDuration(250);
        this.d.setFillAfter(true);
        this.p = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
    }

    private boolean d() {
        boolean v0;
        if (this.getChildCount() > 1) {
            View view = this.getChildAt(1);
            if ((view instanceof AbsListView)) {
                if (Math.abs(((AbsListView) view).getChildAt(0).getTop() - ((AbsListView) view).getListPaddingTop()) < 3 && ((AbsListView) view).getFirstVisiblePosition() == 0) {
                    v0 = true;
                    return v0;
                }

                v0 = false;
            } else {
                if ((view instanceof ScrollView)) {
                    if (((ScrollView) view).getScrollY() == 0) {
                        return true;
                    }

                    return false;
                }

                if (!(view instanceof ScrollContainerView)) {
                    //goto label_38;
                }

//                if (((ScrollContainerView) view).a()) {
//                    return true;
//                }

                v0 = false;
            }
        } else {
            label_38:
            v0 = this.a(this);
        }

        return v0;
    }

    private float getFingerStartY() {
        float v0 = this.t == this.r ? this.f : this.g;
        return v0;
    }

    public int getHeadContentHeight() {
        return this.b;
    }

    public int getPullRefreshUpDistance() {
        return ((int)this.i);
    }

    public boolean onInterceptTouchEvent(MotionEvent arg8) {
        boolean v0 = false;
        if(arg8.getAction() == 0) {
            this.e = arg8.getY();
            this.z = 0f;
            this.y = 0f;
            this.A = arg8.getX();
            this.B = arg8.getY();
        }

        if(arg8.getAction() == 2) {
            float v2 = arg8.getX();
            float v3 = arg8.getY();
            this.y += Math.abs(v2 - this.A);
            this.z += Math.abs(v3 - this.B);
            this.A = v2;
            this.B = v3;
            if(this.y > this.z) {
                super.onInterceptTouchEvent(arg8);
            }
            else if(!this.d()) {
                //goto label_72;
            }
            else if((((float)(((int)arg8.getY())))) - this.e < (((float)this.p))) {
                //goto label_72;
            }
            else if(this.x == null) {
                //goto label_72;
            }
            else if(this.m == null) {
                //goto label_72;
            }
            else if(!this.v) {
                if(this.w) {
                    this.v = true;
                }

                this.r = arg8.getPointerId(0);
                this.t = 0;
                if(arg8.findPointerIndex(this.r) == -1) {
                    return super.onInterceptTouchEvent(arg8);
                }

                this.f = arg8.getY(arg8.findPointerIndex(this.r));
                this.q = 0f;
                v0 = true;
            }
            else {
                //goto label_72;
            }
        }
        else {
            //label_72:
            v0 = super.onInterceptTouchEvent(arg8);
        }

        return v0;
    }

    public boolean onTouchEvent(MotionEvent event) {
        boolean v0;
//        if(this.C != null && (this.C.c())) {
//            v0 = false;
//        }
       // else
        if(event.getPointerCount() > 2) {
            v0 = super.onTouchEvent(event);
        }
        else {
            //this.a(arg3);
            v0 = super.onTouchEvent(event);
        }

        return v0;
    }

    private void setMargin(int arg5) {
        float v0_1;
        boolean v1;
        float v3 = 1f;
        ViewGroup.LayoutParams v0 = this.m.a().getLayoutParams();
        if(this.n != v3 || this.o != null) {
            arg5 = this.o != null ? this.o.a(arg5) : ((int)((((float)arg5)) * this.n));
        }

        if(arg5 > this.u) {
            arg5 = this.u;
        }

        ((LinearLayout.LayoutParams)v0).topMargin = arg5;
        this.m.a().setLayoutParams(v0);
        if(arg5 < 0) {
            v1 = false;
            v0_1 = v3 - (((float)arg5)) / (((float)this.a));
        }
        else {
            v1 = true;
            v0_1 = (((float)arg5)) / (((float)this.u));
        }

        this.m.a(v0_1, v1, this.u);
    }

    public void setOnPullStateChangedListener(a arg1) {
        this.x = arg1;
    }

    public void setPullDownElastic(ElasticMove arg4) {
        this.m = arg4;
        this.b = this.m.b();
        this.a = -this.b;
        LinearLayout.LayoutParams v0 = new LinearLayout.LayoutParams(-1, this.b);
        v0.topMargin = this.a;
        this.addView(this.m.a(), 0, ((ViewGroup.LayoutParams)v0));
    }

    public void setStickyCoefficient(float arg1) {
        this.n = arg1;
    }

    public void setStickyListener(StickyListener listener) {
        this.o = listener;
    }

    public void setUpdateTime(String arg2) {
        if(this.m != null && arg2 != null) {
            this.m.b(arg2);
        }
    }
}

