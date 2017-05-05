package com.example.rishab.ibilivesample.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rishab.ibilivesample.R;
import com.example.rishab.ibilivesample.adapter.LocationAdapter;
import com.example.rishab.ibilivesample.constants.Constants;

/**
 * Created by Rishab on 04-05-2017.
 */

public class RequestsFragment extends Fragment implements Constants {
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_requests, container, false);
        Log.d("debuglona", "Request");
        LocationAdapter recyclerViewAdapter = new LocationAdapter(REQUEST_FRAG, getContext());
        Log.d("debudlona", "i m fucked up");
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_requests);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;

    }

    @Override
    public void init() {

    }
}
