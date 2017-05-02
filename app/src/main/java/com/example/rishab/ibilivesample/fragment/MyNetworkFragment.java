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
import com.example.rishab.ibilivesample.adapter.MyNetworkAdapter;
import com.example.rishab.ibilivesample.model.MyNetwork;

import java.util.ArrayList;

/**
 * Created by Rishab on 01-05-2017.
 */

public class MyNetworkFragment extends Fragment {
    private ArrayList<MyNetwork> networks;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mynetwork, container, false);
        networks = new ArrayList<MyNetwork>();
        networks.add(new MyNetwork("EVelyn"));
        networks.add(new MyNetwork("EVelyn"));
        networks.add(new MyNetwork("EVelyn"));
        networks.add(new MyNetwork("EVelyn"));
        networks.add(new MyNetwork("EVelyn"));
        networks.add(new MyNetwork("EVelyn"));
        MyNetworkAdapter recyclerViewAdapter = new MyNetworkAdapter(networks, getContext());
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_network);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;


    }
}
