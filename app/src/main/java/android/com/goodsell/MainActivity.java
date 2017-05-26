package android.com.goodsell;

import android.com.goodsell.BaseActivity;
import android.os.Bundle;

import sell.android.com.goodselll.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment_tabs);
        System.out.println();
    }
}
