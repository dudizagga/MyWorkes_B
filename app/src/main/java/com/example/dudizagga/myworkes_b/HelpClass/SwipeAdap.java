package com.example.dudizagga.myworkes_b.HelpClass;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.dudizagga.myworkes_b.Request;

/**
 * Created by DudiZagga on 27/11/2017.
 */

public class SwipeAdap extends FragmentStatePagerAdapter {
    public SwipeAdap(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
