package com.mark46.code.seattleplaces.Model.RetrofitComponents;

public class CustomEvent {

    boolean recyclerItemClicked;
    boolean favourite;
    int position;


    public CustomEvent(boolean recyclerItemClicked, boolean favourite, int position) {
        this.recyclerItemClicked = recyclerItemClicked;
        this.favourite = favourite;
        this.position = position;
    }

    public boolean isRecyclerItemClicked() {
        return recyclerItemClicked;
    }

    public void setRecyclerItemClicked(boolean recyclerItemClicked) {
        this.recyclerItemClicked = recyclerItemClicked;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
