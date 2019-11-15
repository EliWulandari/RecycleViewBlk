package com.test.oase.listvieweli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DeatilHeroActivity extends AppCompatActivity {

    private TextView nama, title;
    private ImageView image;
    int imageData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatil_hero);

        nama = findViewById(R.id.namaHero);
        title =  findViewById(R.id.titleHero);
        image = findViewById(R.id.imgHero);


        imageData = getIntent().getIntExtra("IMAGE", 0);
        image.setImageResource(imageData);
        nama.setText(getIntent().getStringExtra("NAME"));
        title.setText(getIntent().getStringExtra("DETAIL"));

    }
}
