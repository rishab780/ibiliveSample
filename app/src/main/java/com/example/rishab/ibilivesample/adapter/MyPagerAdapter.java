package com.example.rishab.ibilivesample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.example.rishab.ibilivesample.constants.Constants;
import com.example.rishab.ibilivesample.fragment.DiscoverMyPostFragment;
import com.example.rishab.ibilivesample.fragment.MapFragment;
import com.example.rishab.ibilivesample.fragment.MyNetworkFragment;
import com.example.rishab.ibilivesample.fragment.RequestsFragment;

/**
 * Created by Rishab on 01-05-2017.
 */

public class MyPagerAdapter extends FragmentPagerAdapter implements Constants {


    /**
     * @param fm fragment manager
     */
    public MyPagerAdapter(final FragmentManager fm) {
        super(fm);
    }

    @Override

    public Fragment getItem(final int position) {

        switch (position) {
            case 0:
                Log.d("log", "position : " + position);
                return DiscoverMyPostFragment.getInstance(DISC_FRAG);
            case 1:
                return new MapFragment();
            case 2:
                return DiscoverMyPostFragment.getInstance(MYPOST_FRAG);
            case 3:
                return new RequestsFragment();
            case 4:
                return new MyNetworkFragment();


            default:
                Log.d("log", "position is null");
                return null;

        }

    }

    @Override
    public int getCount() {
        return 5;


    }

    @Override
    public void init() {

    }
}




