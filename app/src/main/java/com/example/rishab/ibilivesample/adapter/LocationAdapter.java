package com.example.rishab.ibilivesample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.rishab.ibilivesample.R;
import com.example.rishab.ibilivesample.constants.Constants;
import com.example.rishab.ibilivesample.model.LocationsModelClass;

import java.util.ArrayList;

/**
 * Created by Rishab on 01-05-2017.
 */

public class LocationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<LocationsModelClass> locations;
    private int mode;
    private Context context;

    /**
     * @param locations arraylist
     * @param context   context
     * @param mode      mode of the adapter
     */
    public LocationAdapter(final ArrayList<LocationsModelClass> locations, final Context context, final int mode) {
        this.locations = locations;
        this.context = context;
        this.mode = mode;
    }


    @Override
    public LocationAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        //context = parent.getContext();
        View itemView;
        itemView = LayoutInflater.from(context).inflate(R.layout.itemview_discover, parent, false);
        //ViewHolder viewHolder = new ViewHolder(itemView);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int position) {
        ViewHolder holder = (ViewHolder) viewHolder;
        LocationsModelClass currentLocation = locations.get(position);
        if (mode == Constants.DISC_FRAG) {
            holder.info.setText(currentLocation.getInfo());

            holder.toggle.setVisibility(View.GONE);

            holder.trash.setVisibility(View.GONE);
            holder.edit.setVisibility(View.GONE);
        } else {
            holder.info.setText(currentLocation.getInfo());
            holder.location.setVisibility(View.GONE);
            holder.tvlocation.setVisibility(View.GONE);
            holder.name.setVisibility(View.INVISIBLE);
            holder.star.setVisibility(View.INVISIBLE);
            holder.display.setVisibility(View.INVISIBLE);

        }

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
        private ImageView display;
        private ImageView toggle;
        private TextView name;
        private RatingBar star;
        private ImageView trash;
        private ImageView edit;
        private ImageView location;
        private TextView tvlocation;

        /**
         * @param itemView item vview of recycler view
         */

        public ViewHolder(final View itemView) {
            super(itemView);
            info = (TextView) itemView.findViewById(R.id.tv_info);
            display = (ImageView) itemView.findViewById(R.id.pic_image_view);
            toggle = (ImageView) itemView.findViewById(R.id.toggle);
            name = (TextView) itemView.findViewById(R.id.tv_name);
            star = (RatingBar) itemView.findViewById(R.id.discover_rating);
            trash = (ImageView) itemView.findViewById(R.id.icon_trash);
            edit = (ImageView) itemView.findViewById(R.id.edit_btn);
            location = (ImageView) itemView.findViewById(R.id.image_location);
            tvlocation = (TextView) itemView.findViewById(R.id.text_location);




        }
    }
}
