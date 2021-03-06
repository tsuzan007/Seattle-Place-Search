package com.mark46.code.seattleplaces.View;


import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mark46.code.seattleplaces.Model.POJOs.ResponseDetail;
import com.mark46.code.seattleplaces.Model.RetrofitComponents.DetailApiEvent;
import com.mark46.code.seattleplaces.Presenter.MainPresenter;
import com.mark46.code.seattleplaces.R;
import com.mark46.code.seattleplaces.SearchActivity;
import com.mark46.code.seattleplaces.Utils.PresenterViewModel;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class DetailFragment extends Fragment implements View.OnClickListener {

    TextView details;
    TextView name;
    TextView weblink;
    TextView address;
    TextView phonenum;
    TextView rating;
    TextView price;
    TextView regularhours;
    TextView weekendhours;
    ImageView imageView;
    boolean isfavourite;
    int position;
    private double lat;
    private double lng;
    private PresenterViewModel presenterViewModel;
    private MainPresenter mainPresenter;
    ResponseDetail responseDetail;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        // Initialize views.
        details = view.findViewById(R.id.detail);
        name = view.findViewById(R.id.textView_detailname);
        weblink = view.findViewById(R.id.weblink);
        address = view.findViewById(R.id.address);
        phonenum = view.findViewById(R.id.phonenum);
        rating = view.findViewById(R.id.rating);
        price = view.findViewById(R.id.price);
        regularhours = view.findViewById(R.id.reghours);
        weekendhours = view.findViewById(R.id.weekendhrs);
        imageView = view.findViewById(R.id.imageView_detail);
        // Action Listener when user change favourite icon in the detail view
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isfavourite) {
                    imageView.setImageResource(R.mipmap.icons8_heart_32);
                    SearchActivity.responseData.getResponse().getVenues().get(position).setFavourite(false);
                } else {
                    imageView.setImageResource(R.mipmap.icons8_heart_40);
                    SearchActivity.responseData.getResponse().getVenues().get(position).setFavourite(true);
                }


            }
        });
        // Get arguments passed from activity
        if (getArguments() != null) {
            isfavourite = getArguments().getBoolean("isfavourite");
            position = getArguments().getInt("position");
            if (isfavourite) {
                imageView.setImageResource(R.mipmap.icons8_heart_40);

            } else {
                imageView.setImageResource(R.mipmap.icons8_heart_32);

            }
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        presenterViewModel = ViewModelProviders.of(getActivity()).get(PresenterViewModel.class);
        responseDetail=presenterViewModel.getResponseDetail();

    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        try{
            if(responseDetail.getResponse().getVenue()!=null){
                populateViews();
            }
        } catch (NullPointerException e){
            e.printStackTrace();
        }

    }


    /**
     * Invoked when place details are received with out error.
     * @param detailApiEvent Custom Event
     */
    @Subscribe
    public void onPlaceDetailReceived(DetailApiEvent detailApiEvent) {
        responseDetail=detailApiEvent.getDetailResponse();
        presenterViewModel.setResponseDetail(responseDetail);
        populateViews();



    }

    /**
     * Fill view with their respective information.
     */
    private void populateViews(){
        ResponseDetail.ResponseBean.VenueBean v = responseDetail.getResponse().getVenue();
        this.lat = v.getLocation().getLat();
        this.lng = v.getLocation().getLng();
        try {
            details.setText(v.getPage().getPageInfo().getDescription());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            name.setText(v.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            weblink.setText(v.getCanonicalUrl());
            weblink.setOnClickListener(this);

        } catch (NullPointerException e) {

            e.printStackTrace();
        }
        try {
            String number=v.getRating()!=null?v.getRating():"-";
            rating.setText("Rating " + number);

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            String street=v.getLocation().getFormattedAddress().get(0)!=null? v.getLocation().getFormattedAddress().get(0):"";
            String town=v.getLocation().getFormattedAddress().get(1)!=null?v.getLocation().getFormattedAddress().get(1):" ";
            address.setText(street + "\n" + town);

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            String phonenumber = v.getContact().getFormattedPhone() != null ? v.getContact().getFacebookName() : "";
            String facebookName = v.getContact().getFacebookName() != null ? v.getContact().getFacebookName() : "";
            String twitterName = v.getContact().getTwitter() != null ? v.getContact().getTwitter() : "";
            phonenum.setText(phonenumber + "\n" +
                    facebookName + "\n" +
                    twitterName);

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            String currency= v.getPrice().getCurrency()!=null? v.getPrice().getCurrency():"";
            String cost=v.getPrice().getMessage()!=null?v.getPrice().getMessage():"";
            price.setText("Currency:" +currency + " \t " + "Price: " + cost);

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            String days=v.getHours().getTimeframes().get(0).getDays()!=null?v.getHours().getTimeframes().get(0).getDays():"";
            String hours=v.getHours().getTimeframes().get(0).getOpen().get(0).getRenderedTime()!=null?v.getHours().getTimeframes().get(0).getOpen().get(0).getRenderedTime():"";
            regularhours.setText(days + ": " +hours);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            String days=v.getHours().getTimeframes().get(1).getDays()!=null?v.getHours().getTimeframes().get(1).getDays():"";
            String hours=v.getHours().getTimeframes().get(1).getOpen().get(0).getRenderedTime()!=null?v.getHours().getTimeframes().get(1).getOpen().get(0).getRenderedTime():"";
            weekendhours.setText(days + ": " + hours);
        } catch (Exception e) {

            e.printStackTrace();
        }

    }


    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    /**
     *  Invoked when user clicks the URL provided in detail window
     * @param v
     */
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.weblink) {
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(weblink.getText().toString()));
                startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(getActivity(), "Invalid URL.", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public double getLat() {
        return lat;
    }


    public double getLng() {
        return lng;
    }
}
