package android.com.goodsell.ui;

/**
 * Created by work on 2017/5/24.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
//import com.ganji.android.DontPreverify;
//import java.io.PrintStream;

public class ScrollViewExtend extends ObservableScrollView
{
    private float a;
    private float b;
    private float c;
    private float d;

    public ScrollViewExtend(Context paramContext)
    {
        super(paramContext);
    }

    public ScrollViewExtend(Context paramContext, AttributeSet paramAttributeSet)
    {
        super(paramContext, paramAttributeSet);
//        if (Boolean.FALSE.booleanValue())
//            System.out.println(DontPreverify.class);
    }

    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
        switch (paramMotionEvent.getAction())
        {
            case 0:
            case 1:
            case 2:
            default:
        }
//        for (boolean bool = super.onInterceptTouchEvent(paramMotionEvent))
//        {
//            //return bool;
//            this.b = 0.0F;
//            this.a = 0.0F;
//            this.c = paramMotionEvent.getX();
//            this.d = paramMotionEvent.getY();
//            break;
//            float f1 = paramMotionEvent.getX();
//            float f2 = paramMotionEvent.getY();
//            this.a += Math.abs(f1 - this.c);
//            this.b += Math.abs(f2 - this.d);
//            this.c = f1;
//            this.d = f2;
//            if (this.a <= this.b)
//                break;
//        }
        return false;
    }
}