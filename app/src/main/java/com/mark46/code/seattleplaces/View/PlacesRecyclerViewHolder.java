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

    TextView name, category, distance, location, id;
    ImageView icon, favourite;
    boolean isFab;


    public PlacesRecyclerViewHolder(final View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        category = itemView.findViewById(R.id.category);
        distance = itemView.findViewById(R.id.distance);
        location = itemView.findViewById(R.id.location);
        id = itemView.findViewById(R.id.id);
        icon = itemView.findViewById(R.id.iconView);
        favourite = itemView.findViewById(R.id.favicon);
        if (isFab) {
            favourite.setImageResource(R.mipmap.icons8_heart_40);
        } else {
            favourite.setImageResource(R.mipmap.icons8_heart_32);
        }

    }


}
