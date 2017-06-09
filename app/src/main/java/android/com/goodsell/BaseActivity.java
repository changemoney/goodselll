package android.com.goodsell;

/**
 * Created by work on 2017/5/24.
 */

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;


public class BaseActivity extends FragmentActivity
{
    //protected LoginInterceptor mActivityInterceptor;

    public BaseActivity()
    {
        //if (Boolean.FALSE.booleanValue())
            //System.out.println(DontPreverify.class);
        //this.mActivityInterceptor = g.d().a(this);
    }

    public boolean needStatusBarColorWithTitlebar()
    {
        return true;
    }

    protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
        //if ((this.mActivityInterceptor != null) && (this.mActivityInterceptor.a(paramInt1, paramInt2, paramIntent)));
        //while (true)
        //{
            //return;
            super.onActivityResult(paramInt1, paramInt2, paramIntent);
        //}
    }

    public void onAttachFragment(Fragment paramFragment)
    {
        super.onAttachFragment(paramFragment);
//        if (this.mActivityInterceptor != null)
//            this.mActivityInterceptor.a(paramFragment);
    }

    public void onBackPressed()
    {
        try
        {
            super.onBackPressed();
//            if (this.mActivityInterceptor != null)
//                this.mActivityInterceptor.c();
//            return;
        }
        catch (Exception localException)
        {
            while (true)
            {
                localException.printStackTrace();
                finish();
            }
        }
    }

    public void onConfigurationChanged(Configuration paramConfiguration)
    {
//        if ((this.mActivityInterceptor != null) && (this.mActivityInterceptor.a(paramConfiguration)));
//        while (true)
//        {
//            return;
            super.onConfigurationChanged(paramConfiguration);
//        }
    }

    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
//        if (this.mActivityInterceptor != null)
//            this.mActivityInterceptor.a(paramBundle);
    }

    protected void onDestroy()
    {
        super.onDestroy();
//        if (this.mActivityInterceptor != null)
//            this.mActivityInterceptor.d();
    }

    //public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
    //{
        //super.onKeyDown(paramInt, paramKeyEvent);
        //if ((this.mActivityInterceptor != null) && (this.mActivityInterceptor.a(paramInt, paramKeyEvent)));
//        for (boolean bool = true; ; bool = super.onKeyDown(paramInt, paramKeyEvent))
//            return bool;
    //}

    protected void onNewIntent(Intent paramIntent)
    {
//        if ((this.mActivityInterceptor != null) && (this.mActivityInterceptor.a(paramIntent)));
//        while (true)
//        {
//            return;
            super.onNewIntent(paramIntent);
//        }
    }

    protected void onPause()
    {
        super.onPause();
//        if (this.mActivityInterceptor != null)
//            this.mActivityInterceptor.b();
    }

    protected void onResume()
    {
        super.onResume();
//        if (this.mActivityInterceptor != null)
//            this.mActivityInterceptor.a();
//        if (needStatusBarColorWithTitlebar())
//        {
//            if (j.a())
//                j.a(this);
//            j.b(getWindow());
//        }
    }

    protected void onSaveInstanceState(Bundle paramBundle)
    {
        super.onSaveInstanceState(paramBundle);
//        if (this.mActivityInterceptor != null)
//            this.mActivityInterceptor.b(paramBundle);
    }

    protected void onStart()
    {
        super.onStart();
//        if (this.mActivityInterceptor != null)
//            this.mActivityInterceptor.e();
    }

    protected void onStop()
    {
        super.onStop();
//        if (this.mActivityInterceptor != null)
//            this.mActivityInterceptor.e();
    }
}