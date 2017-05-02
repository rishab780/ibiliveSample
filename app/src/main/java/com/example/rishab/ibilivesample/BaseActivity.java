package com.example.rishab.ibilivesample;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.rishab.ibilivesample.adapter.MyPagerAdapter;

public class BaseActivity extends AppCompatActivity {
    private FragmentTransaction ft;
    private FragmentManager manager;
    private ViewPager mViewPager;
    private FragmentPagerAdapter mAdapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mViewPager = (ViewPager) findViewById(R.id.vpswipe);
        mAdapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapterViewPager);

    }
}





