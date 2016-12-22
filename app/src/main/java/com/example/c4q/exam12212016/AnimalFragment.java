package com.example.c4q.exam12212016;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.c4q.exam12212016.model.AnimalsResponse;
import com.example.c4q.exam12212016.network.AnimalApi;
import com.example.c4q.exam12212016.network.Service;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by C4Q on 12/21/16.
 */
public class AnimalFragment extends Fragment {
    private static final String TAG = "AnimalFragment";
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_layout, container, false);
        recyclerView = (RecyclerView) rootview.findViewById(R.id.animal_rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        loadDataAnimals();

        return rootview;
    }

    private void loadDataAnimals() {

        AnimalApi animalApi = Service.createService(AnimalApi.class);
        Call<AnimalsResponse> animalCall = animalApi.getData();
        animalCall.enqueue(new Callback<AnimalsResponse>() {

            @Override
            public void onResponse(Call<AnimalsResponse> call, Response<AnimalsResponse> response) {
                AnimalsResponse dataAnimals = response.body();
                //Log.d(TAG, String.valueOf(dataAnimals.getData().getRecord().size()));
            }

            @Override
            public void onFailure(Call<AnimalsResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: ", t);
                Toast.makeText(getActivity(), "Connection Fail", Toast.LENGTH_SHORT).show();
            }
        });
    }
}



