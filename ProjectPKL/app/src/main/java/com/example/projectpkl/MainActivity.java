package com.example.projectpkl;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.projectpkl.Layanan.Layanan;

public class MainActivity extends AppCompatActivity {
    Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView btnwisata = findViewById(R.id.wisata);
        ImageView btnpenginapan = findViewById(R.id.penginapan);
        ImageView btnkuliner = findViewById(R.id.kuliner);
        ImageView btntempatibadah = findViewById(R.id.tempatibadah);
        ImageView btnusahamikro = findViewById(R.id.usahamikro);
        ImageView btnlayanan = findViewById(R.id.layanan);

        btnwisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WisataActivity.class));
            }
        });

        btnpenginapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Penginapan.class));
            }
        });

        btnkuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Kuliner.class));
            }
        });

        btntempatibadah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TempatIbadah.class));
            }
        });

        btnusahamikro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, UsahaMikro.class));
            }
        });

        btnlayanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Layanan.class));
            }
        });

    }
    }
