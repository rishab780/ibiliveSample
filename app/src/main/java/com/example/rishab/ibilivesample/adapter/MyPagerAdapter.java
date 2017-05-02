package com.example.rishab.ibilivesample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.example.rishab.ibilivesample.fragment.DiscoverFragment;
import com.example.rishab.ibilivesample.fragment.MyNetworkFragment;

/**
 * Created by Rishab on 01-05-2017.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {


    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override

    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Log.d("log", "position : " + position);
                return new DiscoverFragment();
            case 1:
                return new MyNetworkFragment();

            default:
                Log.d("log", "position is null");
                return null;

        }

    }

    @Override
    public int getCount() {
        return 2;


    }
}




