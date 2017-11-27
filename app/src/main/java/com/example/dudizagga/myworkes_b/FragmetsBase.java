package com.example.dudizagga.myworkes_b;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.example.dudizagga.myworkes_b.HelpClass.Carmel;
import com.example.dudizagga.myworkes_b.HelpClass.SwipeAdap;
import com.example.dudizagga.myworkes_b.HelpClass.UsersDetails;

import java.util.ArrayList;
import java.util.List;

public class FragmetsBase extends AppCompatActivity {

    private FragmentManager fm;
    private FragmentTransaction ft;
    private Context context;
     LinearLayout base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmets_base);
        setPointer();

    }

    private void setPointer() {
        this.context = this;


        base = (LinearLayout) findViewById(R.id.base);
        //SwipeAdap swipeAdap = new SwipeAdap(getSupportFragmentManager());

        fm = getFragmentManager();
        ft = fm.beginTransaction();
        ft.add(R.id.base, new Request());
        ft.commit();

    }

    public void nextFragment(int container, Fragment className) {

        fm = getFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(container, className).addToBackStack(null);
        //save changes
        ft.commit();
    }


    public void request(View v) {
        nextFragment(R.id.base, new Request());
    }

    public void connect(View v) {
        nextFragment(R.id.base, new Connect());
    }

    public void error(View v) {
        nextFragment(R.id.base, new Error());
    }

    public void disconn(View v) {
        nextFragment(R.id.base, new Disconnect());
    }
}
