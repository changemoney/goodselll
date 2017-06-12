package common;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

import android.support.v4.app.Fragment;

public class BaseFragment extends Fragment {
    //protected f a;

    //public c() {
        //super();
//        if(Boolean.FALSE.booleanValue()) {
//            System.out.println(DontPreverify.class);
//        }

        //this.a = g.d().a(this);
    //}

    public void onActivityCreated(Bundle arg2) {
        super.onActivityCreated(arg2);
//        if(this.a != null) {
//            this.a.b(arg2);
//        }
    }

    public void onActivityResult(int arg2, int arg3, Intent arg4) {
        //if(this.a == null || !this.a.a(arg2, arg3, arg4)) {
            super.onActivityResult(arg2, arg3, arg4);
        //}
    }

    public void onAttach(Activity arg2) {
        super.onAttach(arg2);
//        if(this.a != null) {
//            this.a.a(arg2);
//        }
    }

    public void onConfigurationChanged(Configuration arg2) {
        //if(this.a == null || !this.a.a(arg2)) {
            super.onConfigurationChanged(arg2);
        //}
    }

    public void onCreate(Bundle arg2) {
        super.onCreate(arg2);
//        if(this.a != null) {
//            this.a.a(arg2);
//        }
    }

    public void onDestroy() {
        super.onDestroy();
//        if(this.a != null) {
//            this.a.e();
//        }
    }

    public void onDetach() {
        super.onDetach();
//        if(this.a != null) {
//            this.a.f();
//        }
    }

    public void onPause() {
        super.onPause();
//        if(this.a != null) {
//            this.a.c();
//        }
    }

    public void onResume() {
        super.onResume();
//        if(this.a != null) {
//            this.a.b();
//        }
    }

    public void onSaveInstanceState(Bundle arg2) {
        super.onSaveInstanceState(arg2);
//        if(this.a != null) {
//            this.a.c(arg2);
//        }
    }

    public void onStart() {
        super.onStart();
//        if(this.a != null) {
//            this.a.a();
//        }
    }

    public void onStop() {
        super.onStop();
//        if(this.a != null) {
//            this.a.d();
//        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
//        if(this.a != null) {
//            this.a.a(view, bundle);
//        }
    }
}


