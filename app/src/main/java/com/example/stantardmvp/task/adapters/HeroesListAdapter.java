package com.example.stantardmvp.task.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.bumptech.glide.Glide;
import com.example.stantardmvp.R;
import com.example.stantardmvp.task.model.Hero;

import java.util.List;

public class HeroesListAdapter extends RecyclerView.Adapter<HeroesListAdapter.ViewHolder> {
    private Context context;
    private List<Hero> heroes;
    public HeroesListAdapter(Context context, List<Hero> heroList){
        this.context = context;
        this.heroes = heroList;
    }
    @Override
    public HeroesListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HeroesListAdapter.ViewHolder holder, int position) {
        Hero hero = heroes.get(position);
        holder.name.setText(hero.getRealname());
        holder.nickName.setText(hero.getName());
        Glide.with(context).load(hero.getImageurl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView name,nickName;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            nickName = itemView.findViewById(R.id.nick_name);
        }
    }
}
