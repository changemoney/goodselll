package android.com.goodsell.im.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import sell.android.com.goodselll.R;

public class MsgNumberView extends LinearLayout
{
    private TextView a;
    private TextView b;
    private ImageView c;
    private ImageView d;

    public MsgNumberView(Context paramContext)
    {
        this(paramContext, null);
//        if (Boolean.FALSE.booleanValue())
//            System.out.println(DontPreverify.class);
    }

    public MsgNumberView(Context paramContext, AttributeSet paramAttributeSet)
    {
        super(paramContext, paramAttributeSet);
        LayoutInflater.from(paramContext).inflate(R.layout.msg_number_layout, this, true);
    }

    public MsgNumberView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
        super(paramContext, paramAttributeSet, paramInt);
        LayoutInflater.from(paramContext).inflate(R.layout.msg_number_layout, this, true);
    }

    public void a(int paramInt1, int paramInt2)
    {
        switch (paramInt2)
        {
            default:
            case 0:
            case 1:
            case 2:
        }
        while (true)
        {
            //return;
            this.a.setVisibility(View.GONE);
            this.c.setVisibility(View.GONE);
            //continue;
            this.a.setVisibility(View.GONE);
            this.c.setVisibility(View.VISIBLE);
            //continue;
            setMsgCount(paramInt1);
        }
    }

    public void a(boolean paramBoolean)
    {
        if (paramBoolean)
            this.b.setVisibility(View.VISIBLE);
        while (true)
        {
            //return;
            this.b.setVisibility(View.GONE);
        }
    }

    public void b(boolean paramBoolean)
    {
        if (paramBoolean)
        {
            this.d.setImageResource(R.drawable.msg_more_selector);
            this.b.setVisibility(View.GONE);
        }
        while (true)
        {
            //return;
            this.d.setImageResource(R.drawable.msg_number_selector_green);
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        this.a = ((TextView)findViewById(R.id.msg_number_txt));
        this.c = ((ImageView)findViewById(R.id.msg_number_point));
        this.b = ((TextView)findViewById(R.id.msg_number_tag));
        this.d = ((ImageView)findViewById(R.id.msg_number_icon));
        this.a.setVisibility(View.GONE);
        this.c.setVisibility(View.GONE);
    }

    public void setMsgCount(int paramInt)
    {
        if (paramInt <= 0)
        {
            this.c.setVisibility(View.GONE);
            this.a.setVisibility(View.GONE);
        }
        while (true)
        {
            //return;
            this.c.setVisibility(View.GONE);
            this.a.setVisibility(View.VISIBLE);
            if (paramInt > 99)
                this.a.setText("99+");
            else
                this.a.setText("" + paramInt);
        }
    }

    public void setSelecter(int paramInt)
    {
        if (this.d != null)
            this.d.setImageResource(paramInt);
    }

    public void setTagColor(int paramInt)
    {
        this.b.setTextColor(paramInt);
    }
}