package com.example.stantardmvp.task.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.stantardmvp.R;
import com.example.stantardmvp.task.HeroesView;
import com.example.stantardmvp.task.Presenter.MarvelsPresenter;
import com.example.stantardmvp.task.adapters.HeroesListAdapter;
import com.example.stantardmvp.task.model.Hero;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, HeroesView {
    private MarvelsPresenter presenter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view;
        recyclerView = findViewById(R.id.heroesList);
        LinearLayoutManager layoutManager = new  LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        presenter = new MarvelsPresenter(this,this);
        presenter.getHeroes();
    }


    @Override
    public void onClick(View view) {

    }

    @Override
    public void onGetHeroesSuccess(List<Hero> heroes) {
        if (heroes!=null){
            HeroesListAdapter adapter = new HeroesListAdapter(this,heroes);
            recyclerView.setAdapter(adapter);
        }

    }

    @Override
    public void onError(String error) {
        Toast.makeText(this,error,Toast.LENGTH_LONG).show();

    }
}