package com.example.c4q.exam12212016.network;

import com.example.c4q.exam12212016.model.AnimalsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by C4Q on 12/21/16.
 */

public interface AnimalApi {
    @GET( "/cgi-bin/12_21_2016_exam.pl")
    Call<AnimalsResponse> getData();
}
