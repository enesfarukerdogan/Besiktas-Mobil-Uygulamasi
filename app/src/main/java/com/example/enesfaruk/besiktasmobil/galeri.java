package com.example.enesfaruk.besiktasmobil;

import android.app.AlertDialog;
import android.app.WallpaperManager;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class galeri extends AppCompatActivity {

    ImageView res,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
    ScrollView scroll;
    Button geri,wall;
    WallpaperManager wallpaperManager;
    Bitmap bm1,bm2;
    DisplayMetrics dpmetrics;
    int en,boy;
    BitmapDrawable bmdrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeri);

        res = (ImageView) findViewById(R.id.bresim);
        scroll = (ScrollView) findViewById(R.id.scrollView2);
        geri = (Button) findViewById(R.id.button12);
        wall = (Button) findViewById(R.id.button13);
        wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        r1 = (ImageView) findViewById(R.id.imageView6);
        r2 = (ImageView) findViewById(R.id.imageView7);
        r3 = (ImageView) findViewById(R.id.imageView8);
        r4 = (ImageView) findViewById(R.id.imageView9);
        r5 = (ImageView) findViewById(R.id.imageView3);
        r6 = (ImageView) findViewById(R.id.imageView11);
        r7 = (ImageView) findViewById(R.id.imageView12);
        r8 = (ImageView) findViewById(R.id.imageView13);
        r9 = (ImageView) findViewById(R.id.imageView14);
        r10 = (ImageView) findViewById(R.id.imageView15);


        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.VISIBLE);
                res.setVisibility(View.INVISIBLE);
                geri.setVisibility(View.INVISIBLE);
                wall.setVisibility(View.INVISIBLE);
            }
        });

        wall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bmdrawable = (BitmapDrawable) res.getDrawable();
                bm1 = bmdrawable.getBitmap();
                GetScreenEnBoy();
                SetBitmapSize();
                wallpaperManager = WallpaperManager.getInstance(galeri.this);

                AlertDialog.Builder build = new AlertDialog.Builder(galeri.this);
                build.setMessage("Seçilen Fotoğraf Wallpaper Yapılacak.");
                build.setNegativeButton("Ana Ekran", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try{
                            wallpaperManager.setBitmap(bm2);
                            wallpaperManager.suggestDesiredDimensions(en,boy);
                            Toast.makeText(galeri.this,"Wallpaper Ana Ekrana Ayarlandı",Toast.LENGTH_LONG).show();
                        }
                        catch (IOException e) {
                            Toast.makeText(galeri.this,"Wallpaper Ayarlanamadı",Toast.LENGTH_LONG).show();
                        }
                    }
                });
                build.setPositiveButton("Kilit Ekranı", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try{
                            wallpaperManager.setBitmap(bm2,null,true,WallpaperManager.FLAG_LOCK);
                            wallpaperManager.suggestDesiredDimensions(en,boy);
                            Toast.makeText(galeri.this,"Wallpaper Kilit Ekranına Ayarlandı",Toast.LENGTH_LONG).show();
                        }
                        catch (IOException e) {
                            Toast.makeText(galeri.this,"Wallpaper Ayarlanamadı",Toast.LENGTH_LONG).show();
                        }
                    }
                });
                build.setNeutralButton("Her İkisi", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try{
                            wallpaperManager.setBitmap(bm2);
                            wallpaperManager.setBitmap(bm2,null,true,WallpaperManager.FLAG_LOCK);
                            wallpaperManager.suggestDesiredDimensions(en,boy);
                            Toast.makeText(galeri.this,"Wallpaper Her İkisine de Ayarlandı",Toast.LENGTH_LONG).show();
                        }
                        catch (IOException e) {
                            Toast.makeText(galeri.this,"Wallpaper Ayarlanamadı",Toast.LENGTH_LONG).show();
                        }
                    }
                });
                build.show();
            }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setImageResource(R.mipmap.galeri4);
                scroll.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                geri.setVisibility(View.VISIBLE);
                wall.setVisibility(View.VISIBLE);
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setImageResource(R.mipmap.galeri1);
                scroll.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                geri.setVisibility(View.VISIBLE);
                wall.setVisibility(View.VISIBLE);
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setImageResource(R.mipmap.galeri2);
                scroll.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                geri.setVisibility(View.VISIBLE);
                wall.setVisibility(View.VISIBLE);
            }
        });

        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setImageResource(R.mipmap.galeri3);
                scroll.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                geri.setVisibility(View.VISIBLE);
                wall.setVisibility(View.VISIBLE);
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setImageResource(R.mipmap.galeri5);
                scroll.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                geri.setVisibility(View.VISIBLE);
                wall.setVisibility(View.VISIBLE);
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setImageResource(R.mipmap.galeri6);
                scroll.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                geri.setVisibility(View.VISIBLE);
                wall.setVisibility(View.VISIBLE);
            }
        });
        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setImageResource(R.mipmap.galeri7);
                scroll.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                geri.setVisibility(View.VISIBLE);
                wall.setVisibility(View.VISIBLE);
            }
        });
        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setImageResource(R.mipmap.galeri8);
                scroll.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                geri.setVisibility(View.VISIBLE);
                wall.setVisibility(View.VISIBLE);
            }
        });
        r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setImageResource(R.mipmap.galeri9);
                scroll.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                geri.setVisibility(View.VISIBLE);
                wall.setVisibility(View.VISIBLE);
            }
        });
        r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setImageResource(R.mipmap.galeri10);
                scroll.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                geri.setVisibility(View.VISIBLE);
                wall.setVisibility(View.VISIBLE);
            }
        });
    }

    public void GetScreenEnBoy() {
        dpmetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dpmetrics);
        en = dpmetrics.widthPixels;
        boy = dpmetrics.heightPixels;
    }

    public void SetBitmapSize () {
        bm2 = Bitmap.createScaledBitmap(bm1,en,boy,false);
    }
}