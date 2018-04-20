package com.mark46.code.seattleplaces;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import com.mark46.code.seattleplaces.Model.DaggerComponents.MyApplicationDaggerBuild;
import com.mark46.code.seattleplaces.Model.POJOs.ResponseData;
import com.mark46.code.seattleplaces.Model.RetrofitComponents.CustomEvent;
import com.mark46.code.seattleplaces.Model.RetrofitComponents.FourSquareApiEvent;
import com.mark46.code.seattleplaces.Model.RetrofitComponents.FourSquareApiFailureEvent;
import com.mark46.code.seattleplaces.Presenter.MainPresenter;
import com.mark46.code.seattleplaces.Utils.ConnectionUtils.CheckNetwork;
import com.mark46.code.seattleplaces.Utils.IAlertDialogs;
import com.mark46.code.seattleplaces.Utils.PresenterViewModel;
import com.mark46.code.seattleplaces.View.PlacesRecyclerViewAdapter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import javax.inject.Inject;


import static android.support.v7.widget.SearchView.*;


public class SearchActivity extends AppCompatActivity implements View.OnClickListener, IAlertDialogs {


    private FloatingActionButton floatingActionButton;
    private CardView cardView;
    private PresenterViewModel presenterViewModel;
    private MainPresenter mainPresenter;
    private android.widget.SearchView mSearchView;
    private boolean network_connection = false;
    private TextView message;
    private ProgressBar progressBar;
    public static ResponseData responseData;
    public static String ACTION_INTENT_FROM_SEARCHACTIVITY=" ACTION_INTENT_FROM_SEARCHACTIVITY";






    @Inject
    CheckNetwork checkNetwork;
    private PlacesRecyclerViewAdapter placesRecyclerViewAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        cardView=findViewById(R.id.cardView_Search);
        floatingActionButton=findViewById(R.id.floatingActionButton_Map);
        floatingActionButton.setVisibility(View.GONE);
        mSearchView=findViewById(R.id.searchView);
        mSearchView.setIconified(true);
        message=findViewById(R.id.Searchmessage);
        presenterViewModel = ViewModelProviders.of(this).get(PresenterViewModel.class);
        mainPresenter = presenterViewModel.getMainPresenter();
        floatingActionButton.setOnClickListener(this);
        mainPresenter.buildDagger();
        cardView.setOnClickListener(this);
        recyclerView = findViewById(R.id.listRecyclerView);
        progressBar=findViewById(R.id.searchProgress);
        progressBar.setVisibility(INVISIBLE);
        MyApplicationDaggerBuild.getMyApplicationDaggerBuild().getMyApplicationDaggerComponent().inject(this);




    }
    @Override
    protected void onStart() {
        super.onStart();
        network_connection = checkNetwork.getNetworkConnectionStatus();
        EventBus.getDefault().register(this);

    }


    @Override
    protected void onResume() {
        super.onResume();
        if(!network_connection){
            showSnackBarAlert("No Internet Connection. Please check your connection.");
        }

        mSearchView.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                message.setText("Searching Places...");
                progressBar.setVisibility(VISIBLE);
                mainPresenter.startSearch(query);
                InputMethodManager imm = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(
                        mSearchView.getWindowToken(), 0);

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        if(placesRecyclerViewAdapter!=null){
            placesRecyclerViewAdapter.notifyDataSetChanged();
        }



    }




    @Override
    protected void onStop() {
        super.onStop();
        Log.e("...","EventBus stopped");
        EventBus.getDefault().unregister(this);
    }




    /**
     * Shows alert dialog if there is no internet connection.
     *
     * @param title   title of the alert dialog.
     * @param message message to explain that there is no internet connection.
     */
    public void showNoConnection(String title, String message) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle(title);
        dialog.setMessage(message);
        dialog.setPositiveButton(("Open Settings"), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                // TODO Auto-generated method stub
                Intent myIntent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                startActivity(myIntent);
            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                // TODO Auto-generated method stub
                Log.e("..", "Cancel button is clicked.");
                showSnackBarAlert("Internet connection is required to proceed.");

            }
        });
        dialog.show();
    }

    /**
     * SnackBar message to show that internet connection is required
     *
     * @param message message to show in the snackBar
     */
    @Override
    public void showSnackBarAlert(String message) {
        Snackbar snackbar = Snackbar
                .make(this.findViewById(R.id.coordinatorLayout), message, Snackbar.LENGTH_INDEFINITE)
                .setAction("Allow Internet", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setAction(Settings.ACTION_WIFI_SETTINGS);
                        startActivity(intent);
                    }
                });

        snackbar.show();

    }


    /**
     * This method is invoked when request is successfull.
     * Event is fired from NYCOpenDataParse.getSchoolDetailsFromAPI(final String dbn).
     *
     * @param fourSquareApiEvent Custom event
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSuccessEvent(FourSquareApiEvent fourSquareApiEvent) {
        responseData=fourSquareApiEvent.getListOfResponse();
        presenterViewModel.setVenueData(responseData.getResponse().getVenues());
        message.setVisibility(GONE);
        progressBar.setVisibility(GONE);
        recyclerView.setVisibility(View.VISIBLE);
        Log.e("###....", "size " + responseData.getResponse().getVenues().size());
        //Passing the Network Response List to RecyclerViewAdapter
        placesRecyclerViewAdapter = new PlacesRecyclerViewAdapter(responseData.getResponse().getVenues(), mainPresenter);
        //Setting the Layout to RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Setting the Adapter to RecyclerView
        recyclerView.setAdapter(placesRecyclerViewAdapter);
        floatingActionButton.setVisibility(VISIBLE);


    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRecyclerViewItemClicked(CustomEvent customEvent){
        if(customEvent.isRecyclerItemClicked()){
            Intent intent=new Intent(this,DetailActivity.class);
            intent.setAction(ACTION_INTENT_FROM_SEARCHACTIVITY);
            intent.putExtra("isfab",customEvent.isFavourite());
            intent.putExtra("position",customEvent.getPosition());
            startActivity(intent);
        }

    }


    /**
     * This method is invoked when request fails.
     *
     * @param FourSquareApiFailureEvent Custom failure event.
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFailureEvent(FourSquareApiFailureEvent FourSquareApiFailureEvent) {
        // Passing the Network Response to UI
        showSnackBarAlert("Internet connection is required to proceed.");
       // mMainFragment.onFailureOpenNotifyApiResponse(FourSquareApiFailureEvent.getOnFailureResponse());

    }




//    /**
//     * Creates RXJava observable of textinput events in the searchview.
//     * If user inputs text in search view, observables are emitted, this subscribes to the changes
//     * and notify recycler view to update.
//     *
//     * @return Observables that are text inputs in the searchview
//     */
//    private void searchTextChangeObservable() {
//        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
//            @Override
//            public void subscribe(@NonNull final ObservableEmitter<String> e) throws Exception {
//                mSearchView.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener() {
//                    @Override
//                    public boolean onQueryTextSubmit(String query) {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean onQueryTextChange(String newText) {
//                        e.onNext(newText);
//                        return true;
//                    }
//                });
//            }
//        });
//        observable.observeOn(Schedulers.io())
//                .map(new Function<String, List<SchoolsData>>() {
//                    @Override
//                    public List<SchoolsData> apply(String s) throws Exception {
//                        List<SchoolsData> searchresult = new ArrayList<>();
//                        for (SchoolsData a : presenterViewModel.getSchoolsData()) {
//                            if (a.getSchool_name().startsWith(s)) {
//                                searchresult.add(a);
//                            }
//                        }
//                        return searchresult;
//                    }
//                }).observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<List<SchoolsData>>() {
//                    @Override
//                    public void accept(List<SchoolsData> schoolsData) throws Exception {
//                        mMainFragment.onSuccessOpenNotifyApiResponse(schoolsData);
//
//                    }
//                });

   // }




    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.floatingActionButton_Map){
            Intent intent=new Intent(SearchActivity.this,MapActivity.class);
            intent.setAction(ACTION_INTENT_FROM_SEARCHACTIVITY);
            startActivity(intent);
        }else if(v.getId()==R.id.cardView_Search){
            mSearchView.setIconified(false);
        }
    }

}
