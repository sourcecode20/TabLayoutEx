package com.example.tablayoutex;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.List;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> list;
    Context context;

    public MyViewPagerAdapter(FragmentManager fm, List<Fragment> list, Context context) {
        super(fm);
        this.list = list;
        this.context = context;
    }

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
