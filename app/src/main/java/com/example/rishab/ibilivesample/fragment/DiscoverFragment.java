package com.example.rishab.ibilivesample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

public class DiscoverFragment extends Fragment {
    private ArrayList<LocationsModelClass> locations;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover, container, false);
        locations = new ArrayList<>();
        locations.add(new LocationsModelClass("Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum.", R.drawable.paris));
        locations.add(new LocationsModelClass("Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum.", R.drawable.paris));
        locations.add(new LocationsModelClass("Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum.", R.drawable.paris));
        locations.add(new LocationsModelClass("Lorem ipsum dolor sit amet, consectetur lorem ipsum \n" +
                "dolor sit amet, consectetur lorem ipsum.", R.drawable.paris));
        LocationAdapter recyclerViewAdapter = new LocationAdapter(locations, getContext());
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_discover);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

}
