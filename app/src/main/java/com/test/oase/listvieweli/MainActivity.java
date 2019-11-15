package com.test.oase.listvieweli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHeroes = findViewById(R.id.hero);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        HeroAdapter heroAdapter= new HeroAdapter(list);
        rvHeroes.setAdapter(heroAdapter);
        heroAdapter.setOnItemClickCallBack(new HeroAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(int img, String detail, String name) {
                Intent intent = new Intent(MainActivity.this, DeatilHeroActivity.class);
                intent.putExtra("IMAGE", img);
                intent.putExtra("DETAIL", detail);
                intent.putExtra("NAME", name);
                startActivity(intent);
            }
        });

    }
}
