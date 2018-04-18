package com.mark46.code.seattleplaces.View;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Presenter.MainPresenter;
import com.mark46.code.seattleplaces.R;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * PlacesRecyclerViewAdapter is the RecyclerViewAdapter.
 * It will set the Layout file for the View in RecyclerView.
 * Gives the values to views from the data received from Network response.
 */
public class PlacesRecyclerViewAdapter extends RecyclerView.Adapter<PlacesRecyclerViewHolder> {

    MainPresenter mainPresenter;
    private List<ResponseData.ResponseBean.VenuesBean> responseList;

    // Getting the Data from the Network Response.
    public PlacesRecyclerViewAdapter(List<ResponseData.ResponseBean.VenuesBean> responseList, MainPresenter mainPresenter) {
        this.responseList = responseList;
        this.mainPresenter = mainPresenter;
    }


    // Inflating the Layout for the RecyclerView
    @Override
    public PlacesRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.datalayout, parent, false);
        return new PlacesRecyclerViewHolder(view, mainPresenter);
    }


    @Override
    public void onBindViewHolder(PlacesRecyclerViewHolder holder, int position) {
        holder.name.setText(responseList.get(position).getName());
        holder.category.setText(responseList.get(position).getCategories().get(0).getName());
        holder.distance.setText(responseList.get(position).getLocation().getAddress());
        holder.id.setText(responseList.get(position).getId());
        Picasso.get()
                .load(responseList.get(position).getCategories().get(0).getIcon().getPrefix())
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
