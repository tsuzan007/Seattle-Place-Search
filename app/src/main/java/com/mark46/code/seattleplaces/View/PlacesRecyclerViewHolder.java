package com.mark46.code.seattleplaces.View;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mark46.code.seattleplaces.Presenter.MainPresenter;
import com.mark46.code.seattleplaces.R;

import org.greenrobot.eventbus.EventBus;


/**
 * PlacesRecyclerViewHolder is the RecyclerViewViewHolder.
 * It will contain the  views of Layout file used in RecyclerView.
 */

public class PlacesRecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView name, category, distance, phone, id;
    ImageView icon, favourite;


    public PlacesRecyclerViewHolder(final View itemView, final MainPresenter mainPresenter) {
        super(itemView);
        name= itemView.findViewById(R.id.name);
        category = itemView.findViewById(R.id.category);
        distance = itemView.findViewById(R.id.distance);
//        phone = itemView.findViewById(R.id.phonenum);
        id = itemView.findViewById(R.id.id);
        icon=itemView.findViewById(R.id.iconView);
        favourite=itemView.findViewById(R.id.favicon);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mainPresenter.requestDetailsAPIcall(id.getText().toString());
               EventBus.getDefault().post(true);

            }
        });
    }

}
