package com.example.enesfaruk.besiktasmobil;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class anaekran extends AppCompatActivity {
    //Bu sayfadaki kodlar ana ekrandan diğer ekranlara geçişi sağlar

    Button tarihce;
    Button fikstur;
    Button puandurumu;
    Button kadro;
    Button yonetim;
    Button marslar;
    Button galeri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anaekran);

        //buton tanımlamaları
        tarihce = (Button) findViewById(R.id.button3);
        fikstur = (Button) findViewById(R.id.button4);
        puandurumu = (Button)findViewById(R.id.button5);
        kadro = (Button) findViewById(R.id.button6);
        yonetim = (Button) findViewById(R.id.button7);
        marslar = (Button) findViewById(R.id.button2);
        galeri = (Button) findViewById(R.id.button8);

        tarihce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //anaekrandan tarihçe ekranına geçişi sağlıyor
                Intent gecis = new Intent(anaekran.this, tarihce.class);
                startActivity(gecis);
            }
        });

        fikstur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //anaekrandan fikstür ekranına geçişi sağlıyor
                Intent gecis = new Intent(anaekran.this, fikstur.class);
                startActivity(gecis);
            }
        });

        puandurumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //anaekrandan puandurumu ekranına geçişi sağlıyor
                Intent gecis = new Intent(anaekran.this, puandurumu.class);
                startActivity(gecis);
            }
        });

        kadro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //anaekrandan kadro ekranına geçişi sağlar
                Intent gecis = new Intent(anaekran.this, kadro.class);
                startActivity(gecis);
            }
        });

        yonetim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //anaekrandan yonetim ekranına geçişi sağlar
                Intent gecis = new Intent(anaekran.this, yonetim.class);
                startActivity(gecis);
            }
        });

        marslar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //anaekrandan marslar ekranına geçişi sağlar
                Intent gecis = new Intent(anaekran.this,marslar.class);
                startActivity(gecis);
            }
        });

        galeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //anaekrandan galeri ekranına geçişi sağlar
                Intent gecis = new Intent(anaekran.this,galeri.class);
                startActivity(gecis);
            }
        });
    }
}