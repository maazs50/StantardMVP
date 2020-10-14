package com.example.stantardmvp.network;

import com.example.stantardmvp.task.model.Hero;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiService {


    @Headers("Content-Type: application/json")
    @GET(ApiEndPoints.MARVEL)
    Observable<List<Hero>> getHeroes();
}
