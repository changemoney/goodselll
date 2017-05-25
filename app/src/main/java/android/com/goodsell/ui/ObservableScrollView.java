package android.com.goodsell.ui;

/**
 * Created by work on 2017/5/24.
 */


import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
//import com.ganji.android.DontPreverify;
//import java.io.PrintStream;

public class ObservableScrollView extends ScrollView
{
    private a a;

    public ObservableScrollView(Context paramContext)
    {
        super(paramContext);
//        if (Boolean.FALSE.booleanValue())
//            System.out.println(DontPreverify.class);
//        this.a = null;
    }

    public ObservableScrollView(Context paramContext, AttributeSet paramAttributeSet)
    {
        super(paramContext, paramAttributeSet);
        this.a = null;
    }

    public ObservableScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
        super(paramContext, paramAttributeSet, paramInt);
        this.a = null;
    }

    protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
        super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
        if (this.a != null)
            this.a.onScrollChanged(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }

    public void setOnScrollListener(a parama)
    {
        this.a = parama;
    }

    public static abstract interface a
    {
        public abstract void onScrollChanged(ObservableScrollView paramObservableScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    }
}