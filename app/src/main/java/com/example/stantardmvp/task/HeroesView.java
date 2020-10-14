package com.example.stantardmvp.task;

import com.example.stantardmvp.task.model.Hero;

import java.util.List;

public interface HeroesView {
    void onGetHeroesSuccess(List<Hero> heroes);
    void onError(String error);
}
