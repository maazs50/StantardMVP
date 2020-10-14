package com.example.stantardmvp.task.Presenter;

import android.app.Activity;

import com.example.stantardmvp.network.BaseRetrofitHandler;
import com.example.stantardmvp.task.HeroesView;
import com.example.stantardmvp.task.model.Hero;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MarvelsPresenter {
    private Activity context;
    private HeroesView heroesView;
    public MarvelsPresenter(Activity context, HeroesView heroesView){
        this.context = context;
        this.heroesView = heroesView;
    }

    public void getHeroes(){
//        String token = SharedPrefsHelper.getInstance().get(Utilites.TOKEN, "");
    Observable<List<Hero>> response = BaseRetrofitHandler.getInstance().apiService.getHeroes();
    response.subscribeOn(Schedulers.newThread()).
            observeOn(AndroidSchedulers.mainThread())
            /*map(List<Hero> -> List<Hero>)*/.subscribe(new Observer<List<Hero>>() {
        @Override
        public void onSubscribe(Disposable d) {

        }

        @Override
        public void onNext(List<Hero> heroesList) {
            heroesView.onGetHeroesSuccess(heroesList);
        }

        @Override
        public void onError(Throwable e) {
            heroesView.onError(e.getMessage());
        }

        @Override
        public void onComplete() {

        }
    });

    }
}
