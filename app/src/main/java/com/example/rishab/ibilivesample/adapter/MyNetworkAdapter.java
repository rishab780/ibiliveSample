package com.example.rishab.ibilivesample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rishab.ibilivesample.R;
import com.example.rishab.ibilivesample.model.MyNetwork;

import java.util.ArrayList;


/**
 * Created by Rishab on 01-05-2017.
 */

public class MyNetworkAdapter extends RecyclerView.Adapter<MyNetworkAdapter.ViewHolder> {
    private ArrayList<MyNetwork> networks;


    public MyNetworkAdapter(ArrayList<MyNetwork> networks, Context context) {
        this.networks = networks;
        this.context = context;
    }

    private Context context;

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        //context = parent.getContext();
        View itemView;
        itemView = LayoutInflater.from(context).inflate(R.layout.itemview_mynetwork, parent, false);
        //ViewHolder viewHolder = new ViewHolder(itemView);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        ViewHolder holder = (ViewHolder) viewHolder;
        MyNetwork currentLocation = networks.get(position);
        holder.name.setText(currentLocation.getName());
    }


    /**
     * @return size
     */
    @Override
    public int getItemCount() {

        return networks.size();
    }

    /**
     * abc
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;

        /**
         * @param itemView item view of recycler view
         */

        public ViewHolder(final View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.user_name);


        }
    }
}