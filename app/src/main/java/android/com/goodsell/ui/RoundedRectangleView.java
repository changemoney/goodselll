package android.com.goodsell.ui;

/**
 * Created by work on 2017/5/24.
 */

import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class RoundedRectangleView extends View
{
    public static final Typeface a = Typeface.DEFAULT;
    private Context mContext;
    private Paint c;
    private Paint d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private String k;
    private float l;
    private float m;
    private float n;
    private int o;
    private int p;
    private Typeface q;

    public RoundedRectangleView(Context paramContext)
    {
        super(paramContext);
//        if (Boolean.FALSE.booleanValue())
//            System.out.println(DontPreverify.class);
        this.e = 0.0F;
        this.f = 0.0F;
        this.g = 500.0F;
        this.h = 200.0F;
        this.j = -16711936;
        this.k = null;
        this.l = 250.0F;
        this.m = 0.0F;
        this.n = 14.0F;
        this.o = -7829368;
        this.p = 0;
        this.q = a;
        this.mContext = paramContext;
    }

    public RoundedRectangleView(Context paramContext, AttributeSet paramAttributeSet)
    {
        super(paramContext, paramAttributeSet);
        this.e = 0.0F;
        this.f = 0.0F;
        this.g = 500.0F;
        this.h = 200.0F;
        this.j = -16711936;
        this.k = null;
        this.l = 250.0F;
        this.m = 0.0F;
        this.n = 14.0F;
        this.o = -7829368;
        this.p = 0;
        this.q = a;
        this.mContext = paramContext;
        a(paramAttributeSet);
    }

    private float a(float paramFloat)
    {
        return paramFloat * this.mContext.getResources().getDisplayMetrics().density;
    }

    private void a(Canvas paramCanvas)
    {
        paramCanvas.drawCircle(this.g / 2.0F + this.e, this.h / 2.0F + this.f, this.i, this.d);
    }

    private void b(Canvas paramCanvas)
    {
        float f1 = this.e;
        float f2 = this.f;
        float f3 = f1 + 2.0F * this.i;
        float f4 = f2 + this.h;
        paramCanvas.drawArc(new RectF(f1, f2, f3, f4), 90.0F, 180.0F, true, this.d);
        float f5 = f1 + this.i;
        float f6 = this.e + this.g - this.i;
        paramCanvas.drawRect(new RectF(f5, f2, 0.5F + f6, f4), this.d);
        paramCanvas.drawArc(new RectF(f6 - this.i, f2, f6 + this.i, f4), 270.0F, 180.0F, true, this.d);
    }

    private void c(Canvas paramCanvas)
    {
        String str = this.k;
        this.c.setTextSize(this.n);
        this.c.setTypeface(this.q);
        Paint.FontMetricsInt localFontMetricsInt = this.c.getFontMetricsInt();
        float f1 = (this.f + this.h + this.f - localFontMetricsInt.bottom - localFontMetricsInt.top) / 2.0F;
        float f2 = this.c.measureText("...");
        float f3 = this.c.measureText(this.k);
        float f4 = f3 / this.k.length();
        if (this.p == 1)
        {
            float f5 = this.g / 2.0F;
            float f6 = f3 / 2.0F;
            if (f6 + this.l < f5)
                this.l = (f5 + this.l - f6);
        }
        int i1 = (int)((this.g - this.l - this.m - f2) / f4);
        if (f3 + this.l > this.g)
            if (i1 <= 0)
               // break label240;
        label240: for (str = str.substring(0, i1) + "..."; ; str = "...")
        {
            paramCanvas.drawText(str, this.l, f1, this.c);
            return;
        }
    }

    public void a()
    {
        this.d = getGraphPaint();
        this.d.setColor(this.j);
        this.c = getTextPaint();
        this.c.setColor(this.o);
    }

    public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
        if (paramFloat1 >= 0.0D)
            this.e = paramFloat1;
        if (paramFloat2 >= 0.0D)
            this.f = paramFloat2;
        if (paramFloat3 > 0.0D)
            this.g = paramFloat3;
        if (paramFloat4 > 0.0D)
            this.h = paramFloat4;
        if (2.0F * this.h > this.g)
            this.h = this.g;
        this.i = (this.h / 2.0F);
    }

    public void a(AttributeSet paramAttributeSet)
    {
        //TypedArray localTypedArray = this.b.getTheme().obtainStyledAttributes(paramAttributeSet, R.styleable.RoundedRectangleView, 0, 0);
//        try
//        {
////            this.k = localTypedArray.getString(0);
////            this.l = localTypedArray.getDimension(3, 0.0F);
////            this.m = localTypedArray.getDimension(4, 0.0F);
////            this.n = localTypedArray.getDimension(5, a(14.0F));
////            this.o = localTypedArray.getColor(2, -7829368);
////            this.j = localTypedArray.getColor(6, -16711936);
////            this.p = localTypedArray.getInt(1, 0);
//            return;
//        }
//        finally
//        {
//            localTypedArray.recycle();
//        }
    }

    public int getGraphColor()
    {
        return this.j;
    }

    public Paint getGraphPaint()
    {
        if (this.d == null)
        {
            this.d = new Paint();
            this.d.setAntiAlias(true);
        }
        return this.d;
    }

    public int getTextColor()
    {
        return this.o;
    }

    public Paint getTextPaint()
    {
        if (this.c == null)
        {
            this.c = new Paint();
            this.c.setAntiAlias(true);
        }
        return this.c;
    }

    public String getTextString()
    {
        return this.k;
    }

    public float getmHeight()
    {
        return this.h;
    }

    public float getmLeft()
    {
        return this.e;
    }

    public float getmRadius()
    {
        return this.i;
    }

    public float getmTextSize()
    {
        return this.n;
    }

    public float getmTop()
    {
        return this.f;
    }

    public Typeface getmTypeface()
    {
        return this.q;
    }

    public float getmWidth()
    {
        return this.g;
    }

    protected void onDraw(Canvas paramCanvas)
    {
        a();
        a(0.0F, 0.0F, 0.0F, 0.0F);
        if (this.g / 2.0F > this.i)
            b(paramCanvas);
        while (true)
        {
//            if ((this.k != null) && (this.k.length() > 0))
//                c(paramCanvas);
//            super.onDraw(paramCanvas);
//            return;
//            a(paramCanvas);
        }
    }

    protected void onMeasure(int paramInt1, int paramInt2)
    {
        super.onMeasure(paramInt1, paramInt2);
    }

    protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
        super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
        this.g = paramInt1;
        this.h = paramInt2;
    }

    public void setGraphColor(int paramInt)
    {
        this.j = paramInt;
        invalidate();
    }

    public void setTextColor(int paramInt)
    {
        this.o = paramInt;
        invalidate();
    }

    public void setTextLeft(float paramFloat)
    {
        if (paramFloat > 0.0D)
            this.l = paramFloat;
        invalidate();
    }

    public void setTextRight(float paramFloat)
    {
        if (paramFloat > 0.0D)
            this.m = paramFloat;
        invalidate();
    }

    public void setTextString(String paramString)
    {
        this.k = paramString;
        invalidate();
    }

    public void setType(int paramInt)
    {
        this.p = paramInt;
        invalidate();
    }

    public void setmHeight(float paramFloat)
    {
        if (paramFloat > 1.0D)
            this.h = paramFloat;
        invalidate();
    }

    public void setmLeft(float paramFloat)
    {
        if (paramFloat > 1.0D)
            this.e = paramFloat;
        invalidate();
    }

    public void setmTextSize(int paramInt)
    {
        this.n = paramInt;
        invalidate();
    }

    public void setmTop(float paramFloat)
    {
        if (paramFloat > 1.0D)
            this.f = paramFloat;
        invalidate();
    }

    public void setmTypeface(Typeface paramTypeface)
    {
        this.q = paramTypeface;
        invalidate();
    }

    public void setmWidth(float paramFloat)
    {
        if (paramFloat > 1.0D)
            this.g = paramFloat;
        invalidate();
    }
}
