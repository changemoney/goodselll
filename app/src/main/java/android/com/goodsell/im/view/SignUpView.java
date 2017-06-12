package android.com.goodsell.im.view;

import android.com.goodsell.R;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SignUpView extends LinearLayout {
    public interface signup {
        void onClick(View view);
    }

    private TextView a;
    private TextView b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    //private a h;

    public SignUpView(Context context, AttributeSet arg5) {
        super(context, arg5);
        this.f = false;
        this.g = false;
        LayoutInflater.from(context).inflate(R.layout.view_sign_up, ((ViewGroup)this), true);
        this.a(context);
    }

    public SignUpView(Context arg4, AttributeSet arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.f = false;
        this.g = false;
        LayoutInflater.from(arg4).inflate(R.layout.view_sign_up, ((ViewGroup)this), true);
        this.a(arg4);
    }

    private void a(Context context) {
        //this.d = context.getResources().getColor(17170443);
        this.c = Color.parseColor("#b1e4ad");
        this.e = Color.parseColor("#bde1b1");
    }

    private void a(MotionEvent arg4) {
        if(arg4.getX() < 0f || arg4.getX() > (((float)this.getMeasuredWidth())) || arg4.getY() < 0f || arg4.getY() > (((float)this.getMeasuredHeight()))) {
            this.g = true;
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.sign_up_row_one);
        this.b = (TextView) findViewById(R.id.sign_up_row_two);
    }

    public boolean onTouchEvent(MotionEvent arg4) {
        boolean v0_1;
        int v0;
        TextView v2;
        switch(arg4.getAction()) {
            case 1: {
//                if(this.h != null && !this.g) {
//                    this.h.onClick(((View)this));
//                }
//
//                v2 = this.a;
//                v0 = this.f ? this.e : this.d;
//                v2.setTextColor(v0);
//                v2 = this.b;
//                v0 = this.f ? this.e : this.d;
//                v2.setTextColor(v0);
//                this.g = false;
//                v0_1 = false;
                break;
            }
            case 0:
            case 2: {
                this.a(arg4);
                if(this.g) {
                    TextView v1 = this.a;
                    v0 = this.f ? this.e : this.d;
                    v1.setTextColor(v0);
                    v1 = this.b;
                    v0 = this.f ? this.e : this.d;
                    v1.setTextColor(v0);
                }
                else {
                    this.a.setTextColor(this.c);
                    this.b.setTextColor(this.c);
                }

                v0_1 = true;
                break;
            }
            default: {
                v2 = this.a;
                v0 = this.f ? this.e : this.d;
                v2.setTextColor(v0);
                v2 = this.b;
                v0 = this.f ? this.e : this.d;
                v2.setTextColor(v0);
                v0_1 = false;
                break;
            }
        }

        return false;
    }

    @Deprecated public void setOnClickListener(View.OnClickListener arg1) {
    }

//    public void setOnClickListener(a arg1) {
//        this.h = arg1;
//    }
}

