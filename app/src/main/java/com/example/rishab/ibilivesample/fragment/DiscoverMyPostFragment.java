package com.example.rishab.ibilivesample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rishab.ibilivesample.R;
import com.example.rishab.ibilivesample.adapter.LocationAdapter;
import com.example.rishab.ibilivesample.model.LocationsModelClass;

import java.util.ArrayList;

/**
 * Created by Rishab on 29-04-2017.
 */

public class DiscoverMyPostFragment extends Fragment {
    private ArrayList<LocationsModelClass> locations;
    private RecyclerView recyclerView;
    private Bundle bundle;

    /**
     * @param mode mode that is being sent
     * @return returns fragment for the view pager
     */
    public static DiscoverMyPostFragment getInstance(final int mode) {
        DiscoverMyPostFragment fragment = new DiscoverMyPostFragment();
        Log.e("debug", String.valueOf(mode));
        Bundle bundle = new Bundle();
        bundle.putInt(String.valueOf(R.string.mode), mode);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover, container, false);
        locations = new ArrayList<>();
        bundle = getArguments();
        locations.add(new LocationsModelClass("Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                +
                "dolor sit amet, consectetur lorem ipsum.", R.drawable.paris));
        locations.add(new LocationsModelClass("Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                +
                "dolor sit amet, consectetur lorem ipsum.", R.drawable.paris));
        locations.add(new LocationsModelClass("Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                +
                "dolor sit amet, consectetur lorem ipsum.", R.drawable.paris));
        locations.add(new LocationsModelClass("Lorem ipsum dolor sit amet, consectetur lorem ipsum \n"
                +
                "dolor sit amet, consectetur lorem ipsum.", R.drawable.paris));


        LocationAdapter recyclerViewAdapter = new LocationAdapter(locations, getContext(), bundle.getInt(String.valueOf(R.string.mode)));
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_discover);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

}
