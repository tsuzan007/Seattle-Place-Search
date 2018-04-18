package com.mark46.code.seattleplaces.View;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mark46.code.seattleplaces.Model.RetrofitComponents.DetailApiEvent;
import com.mark46.code.seattleplaces.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class DetailFragment extends Fragment {

    TextView details;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_detail,container,false);
        details=view.findViewById(R.id.detail);
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
        details.setText(detailApiEvent.getDetailResponse().getName());

    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
