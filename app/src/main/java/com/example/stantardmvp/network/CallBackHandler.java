package com.example.stantardmvp.network;

import com.example.stantardmvp.task.model.Hero;

import java.util.List;

import io.reactivex.Observable;

public class CallBackHandler implements ApiService {

    private static CallBackHandler instance = null;

    private CallBackHandler() {

    }

    public static CallBackHandler getInstance() {
        if (instance == null) {
            synchronized (BaseRetrofitHandler.class) {
                if (instance == null) {
                    instance = new CallBackHandler();
                }
            }
        }
        return instance;
    }

    @Override
    public Observable<List<Hero>> getHeroes() {
        return null;
    }
}
