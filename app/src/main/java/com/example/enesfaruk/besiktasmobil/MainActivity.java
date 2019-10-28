package com.example.enesfaruk.besiktasmobil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Buradaki kodların tamamı sadece girişdeki hoşgeldiniz ekranından ana ekrana geçişi sağlar.

    Button buton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buton =(Button) findViewById(R.id.button);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //giriş ekranından ana ekrana geçişi sağlıyor
                Intent gecis = new Intent(MainActivity.this, anaekran.class);
                startActivity(gecis);
            }
        });
    }
}
