package com.example.stantardmvp.network;

import com.example.stantardmvp.task.model.Hero;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {


    @Headers("Content-Type: application/json")
    @GET(ApiEndPoints.MARVEL)
    Observable<List<Hero>> getHeroes();

/*    @Headers("Content-Type: application/json")
    @GET(ApiEndPoints.RECENT_MORE)
    Observable<RecentMoreResponse> getRecentMore(@Header(Utilites.AUTH_TOKEN) String token,
                                                 @Path("categ_id") String categId,
                                                 @Query("page") String page);

    *//**
     * Get PurChaseMedia Currency  Api Call
     *//*
    @Headers("Content-Type: application/json")
    @POST(ApiEndPoints.APPLY_CURRENCY_MEDIA)
    Observable<PurchaseResponse> getPurChaseMediaCurrency(@Header(Utilites.AUTH_TOKEN) String token,
                                                          @Body PurchaseDataPayload payload);
    @Headers("Content-Type: application/json")
    @DELETE(ApiEndPoints.DEL_DEVICE)
    Observable<DeleteDeviceResponse> deleteDevice(@Header(Utilites.AUTH_TOKEN) String token,
                                                  @Path("deviceId") String deviceId);*/

}
