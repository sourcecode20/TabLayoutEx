package com.example.tablayoutex;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("TabLayoutEx");

        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewpager);
        getFragments();
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(),list,this));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void getFragments() {
        list = new ArrayList<>();
        list.add(new India());
        list.add(new PoliticsFragment());
        list.add(new SportFragment());
        list.add(new BlankFragment());
        list.add(new BlankFragment());
        list.add(new BlankFragment());

        tabLayout.addTab(tabLayout.newTab().setText("India"));
        tabLayout.addTab(tabLayout.newTab().setText("Politics"));
        tabLayout.addTab(tabLayout.newTab().setText("Sport"));
        tabLayout.addTab(tabLayout.newTab().setText("Movie"));
        tabLayout.addTab(tabLayout.newTab().setText("Market"));
        tabLayout.addTab(tabLayout.newTab().setText("World"));


    }


}
