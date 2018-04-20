package com.mark46.code.seattleplaces.View;

import android.location.Location;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Model.RetrofitComponents.CustomEvent;
import com.mark46.code.seattleplaces.Presenter.MainPresenter;
import com.mark46.code.seattleplaces.R;
import com.mark46.code.seattleplaces.SearchActivity;
import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;

import java.util.List;


/**
 * PlacesRecyclerViewAdapter is the RecyclerViewAdapter.
 * It will set the Layout file for the View in RecyclerView.
 * Gives the values to views from the data received from Network response.
 */
public class PlacesRecyclerViewAdapter extends RecyclerView.Adapter<PlacesRecyclerViewHolder> {

    MainPresenter mainPresenter;
    Location loc1;
    private List<ResponseData.ResponseBean.VenuesBean> responseList;
    private boolean isFab;


    // Getting the Data from the Network Response.
    public PlacesRecyclerViewAdapter(List<ResponseData.ResponseBean.VenuesBean> responseList, MainPresenter mainPresenter) {
        this.responseList = responseList;
        this.mainPresenter = mainPresenter;
        loc1 = new Location("");
        loc1.setLatitude(47.608013);
        loc1.setLongitude(-122.335167);
    }


    // Inflating the Layout for the RecyclerView
    @Override
    public PlacesRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.datalayout, parent, false);
        final PlacesRecyclerViewHolder holder = new PlacesRecyclerViewHolder(view);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("...", holder.getAdapterPosition() + "");
                int position = holder.getAdapterPosition();
                mainPresenter.requestDetailsAPIcall(SearchActivity.responseData.getResponse().getVenues().get(position).getId());
                EventBus.getDefault().post(new CustomEvent(true, SearchActivity.responseData.getResponse().getVenues().get(position).isFavourite(), position));
            }
        });
        holder.favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Log.e("##...", position + "");
                isFab = SearchActivity.responseData.getResponse().getVenues().get(position).isFavourite();
                if (isFab) {
                    ((ImageView) v).setImageResource(R.mipmap.icons8_heart_32);
                    SearchActivity.responseData.getResponse().getVenues().get(position).setFavourite(false);

                } else {
                    ((ImageView) v).setImageResource(R.mipmap.icons8_heart_40);
                    SearchActivity.responseData.getResponse().getVenues().get(position).setFavourite(true);

                }
            }
        });

        return holder;
    }


    @Override
    public void onBindViewHolder(PlacesRecyclerViewHolder holder, int position) {
        holder.name.setText(responseList.get(position).getName());
        holder.category.setText(responseList.get(position).getCategories().get(0).getName());
        Location loc2 = new Location("");
        loc2.setLatitude(responseList.get(position).getLocation().getLat());
        loc2.setLongitude(responseList.get(position).getLocation().getLng());
        float distanceInMeters = loc1.distanceTo(loc2);
        holder.distance.setText("Distance from Seattle Center: " + distanceInMeters + " meters");
        holder.location.setText(responseList.get(position).getLocation().getFormattedAddress().toString());
        holder.id.setText(responseList.get(position).getId());
        if (SearchActivity.responseData.getResponse().getVenues().get(position).isFavourite()) {
            Picasso.get().load(R.mipmap.icons8_heart_40).into(holder.favourite);

        } else {
            Picasso.get().load(R.mipmap.icons8_heart_32).into(holder.favourite);

        }
        Picasso.get()
                .load("http://community.fmca.com/uploads/monthly_2018_04/S.png.2e1729558cca9308d3a80e066f8ad640.png")
                .placeholder(android.R.drawable.ic_lock_idle_lock)
                .error(android.R.drawable.stat_notify_error)
                .into(holder.icon);


    }


    // Passing the Required number of views for the RecyclerView
    @Override
    public int getItemCount() {
        return responseList.size();

    }


}
