package com.mark46.code.seattleplaces.View;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mark46.code.seattleplaces.R;


/**
 * PlacesRecyclerViewHolder is the RecyclerViewViewHolder.
 * It will contain the  views of Layout file used in RecyclerView.
 */

public class PlacesRecyclerViewHolder extends RecyclerView.ViewHolder {

    public  TextView name, category, distance, location, id;
    public ImageView icon, favourite;



    public PlacesRecyclerViewHolder(final View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        category = itemView.findViewById(R.id.category);
        distance = itemView.findViewById(R.id.distance);
        location = itemView.findViewById(R.id.location);
        id = itemView.findViewById(R.id.id);
        icon = itemView.findViewById(R.id.iconView);
        favourite = itemView.findViewById(R.id.favicon);


    }


}
