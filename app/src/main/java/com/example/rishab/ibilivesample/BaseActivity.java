package com.example.rishab.ibilivesample;


import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rishab.ibilivesample.adapter.MyPagerAdapter;

/**
 * created by Rishab
 */
public class BaseActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ViewPager mViewPager;
    private TextView tvTitle;
    private FragmentPagerAdapter mAdapterViewPager;
    private ImageView burgerButton;
    private View viewDiscovery;
    private View viewMap;
    private View viewMyPosts;
    private View viewMyNetwork;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawerLayout.openDrawer(Gravity.START);
        tvTitle = (TextView) findViewById(R.id.text_title);
        burgerButton = (ImageView) findViewById(R.id.btn_burger);
        burgerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawerLayout.openDrawer(Gravity.START);

            }
        });

        mViewPager = (ViewPager) findViewById(R.id.vpswipe);
        mAdapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapterViewPager);
        mViewPager.setOffscreenPageLimit(4);
        viewDiscovery = (View) findViewById(R.id.view_discover);
        viewMap = (View) findViewById(R.id.view_map);
        viewMyPosts = (View) findViewById(R.id.view_myposts);
        viewMyNetwork = (View) findViewById(R.id.view_mynetwork);

        viewDiscovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mViewPager.setCurrentItem(0);
            }
        });
        viewMyPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mViewPager.setCurrentItem(2);
            }
        });
        viewMyNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mViewPager.setCurrentItem(3);
            }
        });
        viewMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mViewPager.setCurrentItem(1);
            }
        });


        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {
                if (position == 0) {
                    tvTitle.setText("Discovery");
                }
                if (position == 1) {
                    tvTitle.setText("Map");

                }
                if (position == 2) {
                    tvTitle.setText("My Post");

                }
                if (position == 3) {
                    tvTitle.setText("My Network");
                }

            }

            @Override
            public void onPageScrollStateChanged(final int state) {

            }
        });

    }
}





