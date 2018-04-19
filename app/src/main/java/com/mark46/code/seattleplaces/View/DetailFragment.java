package com.mark46.code.seattleplaces.View;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mark46.code.seattleplaces.DetailActivity;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseDetail;
import com.mark46.code.seattleplaces.Model.RetrofitComponents.DetailApiEvent;
import com.mark46.code.seattleplaces.R;

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


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_detail,container,false);
        details=view.findViewById(R.id.detail);
        name=view.findViewById(R.id.textView_detailname);
        weblink=view.findViewById(R.id.weblink);
        address=view.findViewById(R.id.address);
        phonenum=view.findViewById(R.id.phonenum);
        rating=view.findViewById(R.id.rating);
        price=view.findViewById(R.id.price);
        regularhours=view.findViewById(R.id.reghours);
        weekendhours=view.findViewById(R.id.weekendhrs);
        return  view;
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        details.setText("Details");
    }

    @Subscribe
    public void onPlaceDetailReceived(DetailApiEvent detailApiEvent){
        ResponseDetail.ResponseBean.VenueBean v=detailApiEvent.getDetailResponse().getResponse().getVenue();
        details.setText(v.getPage().getPageInfo().getDescription());
        name.setText(v.getName());
        weblink.setText(v.getCanonicalUrl());
        weblink.setOnClickListener(this);
        rating.setText("Rating "+v.getRating());
        address.setText(v.getLocation().getFormattedAddress().get(0)+"\n"+
                v.getLocation().getFormattedAddress().get(1)
        );
        phonenum.setText(v.getContact().getFormattedPhone()+"\n"+
                v.getContact().getFacebookName()+"\n"+
                v.getContact().getTwitter());
        price.setText("Currency:"+v.getPrice().getCurrency()+" \t "+"Price: "+v.getPrice().getMessage());
        regularhours.setText(v.getHours().getTimeframes().get(0).getDays()+": "+v.getHours().getTimeframes().get(0).getOpen().get(0).getRenderedTime());
        weekendhours.setText(v.getHours().getTimeframes().get(1).getDays()+": "+v.getHours().getTimeframes().get(1).getOpen().get(0).getRenderedTime());
        ((DetailActivity) getActivity()).addplaceMarker(v.getLocation().getLat(),v.getLocation().getLng());

    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.weblink){
            try{
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(weblink.getText().toString()));
            startActivity(intent);}
            catch (Exception e){
                Toast.makeText(getActivity(),"Invalid URL.",Toast.LENGTH_SHORT).show();
            }
        }

    }
}
