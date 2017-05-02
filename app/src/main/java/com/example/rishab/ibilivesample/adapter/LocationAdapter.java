package com.example.rishab.ibilivesample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rishab.ibilivesample.R;
import com.example.rishab.ibilivesample.model.LocationsModelClass;

import java.util.ArrayList;

/**
 * Created by Rishab on 01-05-2017.
 */

public class LocationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<LocationsModelClass> locations;

    public LocationAdapter(ArrayList<LocationsModelClass> locations, Context context) {
        this.locations = locations;
        this.context = context;
    }

    private Context context;

    @Override
    public LocationAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        //context = parent.getContext();
        View itemView;
        itemView = LayoutInflater.from(context).inflate(R.layout.itemview_discover, parent, false);
        //ViewHolder viewHolder = new ViewHolder(itemView);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        ViewHolder holder = (ViewHolder) viewHolder;
        LocationsModelClass currentLocation = locations.get(position);
        holder.info.setText(currentLocation.getInfo());
    }


    /**
     * @return size
     */
    @Override
    public int getItemCount() {

        return locations.size();
    }

    /**
     * abc
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView info;

        /**
         * @param itemView item vview of recycler view
         */

        public ViewHolder(final View itemView) {
            super(itemView);
            info = (TextView) itemView.findViewById(R.id.tv_info);


        }
    }
}
