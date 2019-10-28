package com.example.enesfaruk.besiktasmobil;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.view.KeyEvent;

import java.util.concurrent.TimeUnit;

public class marslar extends AppCompatActivity {

    MediaPlayer marscalar;
    ListView marslar;
    Button durdur;
    Button baslat;
    TextView time,son;
    double starttime = 0;
    double endtime = 0;
    Handler hand = new Handler();
    SeekBar sure;
    int onetimeonly = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marslar);

        marslar = (ListView) findViewById(R.id.muzikler);
        durdur = (Button) findViewById(R.id.button10);
        baslat = (Button) findViewById(R.id.button9);
        time = (TextView) findViewById(R.id.textView);
        son = (TextView) findViewById(R.id.textView2);
        sure = (SeekBar) findViewById(R.id.seekBar);

        sure.setClickable(false);

        final String[] isimler = {"Gururlan","Gücüne Güç Katmaya Geldik","Haydi Kalk Ayağa","Sen Benim","Sevmeyi Bir De Bize Sor","Gidilecek Çok Deplasman Var","Kalbim Beşiktaş",
                                    "Yangın","Hadi Hisset","Sen İste","Sevinmek İçin Sevmedik","Senden Başka"};
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, isimler);
        marslar.setAdapter(adapter);

        marslar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long adi) {

                if(adapter.getItem(i).toString()=="Gururlan"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.gururlan);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Gururlan Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.gururlan);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Gururlan Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
                else if(adapter.getItem(i).toString()=="Gücüne Güç Katmaya Geldik"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.gucune_guc_katmaya_geldik);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Gücüne Güç Katmaya Geldik Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.gucune_guc_katmaya_geldik);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Gücüne Güç Katmaya Geldik Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
                else if(adapter.getItem(i).toString()=="Haydi Kalk Ayağa"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.haydi_kalk_ayaga);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Haydi Kalk Ayağa Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.haydi_kalk_ayaga);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Haydi Kalk Ayağa Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
                else if(adapter.getItem(i).toString()=="Sen Benim"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.sen_benim);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Sen Benim Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.sen_benim);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Sen Benim Çalıyor",Toast.LENGTH_LONG).show();
                    }

                }
                else if(adapter.getItem(i).toString()=="Sevmeyi Bir De Bize Sor"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.sevmeyi_bir_de_bize_sor);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Sevmeyi Bir De Bize Sor Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.sevmeyi_bir_de_bize_sor);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Sevmeyi Bir De Bize Sor Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
                else if(adapter.getItem(i).toString()=="Gidilecek Çok Deplasman Var"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.gidilecek_cok_deplasman_var);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Gidilecek Çok Deplasman Var Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.gidilecek_cok_deplasman_var);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Gidilecek Çok Deplasman Var Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
                else if(adapter.getItem(i).toString()=="Kalbim Beşiktaş"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.kalbim_besiktas);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Kalbim Beşiktaş Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.kalbim_besiktas);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Kalbim Beşiktaş Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
                else if(adapter.getItem(i).toString()=="Yangın"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.yangin);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Yangın Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.yangin);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Yangın Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
                else if(adapter.getItem(i).toString()=="Hadi Hisset"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.hadi_hisset);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Hadi Hisset Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.hadi_hisset);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Hadi Hisset Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
                else if(adapter.getItem(i).toString()=="Sen İste"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.sen_iste);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Sen İste Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.sen_iste);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Sen İste Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
                else if(adapter.getItem(i).toString()=="Sevinmek İçin Sevmedik"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.sevinmek_icin_sevmedik);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Sevinmek İçin Sevmedik Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.sevinmek_icin_sevmedik);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Sevinmek İçin Sevmedik Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
                else if(adapter.getItem(i).toString()=="Senden Başka"){
                    onetimeonly = 0;
                    if(marscalar==null){
                        marscalar = MediaPlayer.create(marslar.this, R.raw.senden_baska);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Senden Başka Çalıyor",Toast.LENGTH_LONG).show();
                    }
                    else{
                        marscalar.reset();
                        marscalar = MediaPlayer.create(marslar.this, R.raw.senden_baska);
                        marscalar.start();

                        endtime = marscalar.getDuration();
                        starttime = marscalar.getCurrentPosition();
                        if(onetimeonly == 0){
                            sure.setMax((int) endtime);
                            onetimeonly = 1;
                        }
                        son.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) endtime),TimeUnit.MILLISECONDS.toSeconds((long) endtime)- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) endtime))));
                        time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
                        sure.setProgress((int) starttime);
                        hand.postDelayed(UpdateSongTime, 100);

                        Toast.makeText(getApplicationContext(),"Senden Başka Çalıyor",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(marscalar==null){
                    Toast.makeText(getApplicationContext(),"Bir Şarkı Seçin",Toast.LENGTH_LONG).show();
                }
                else {
                    marscalar.start();
                }
            }
        });

        durdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(marscalar==null){
                    Toast.makeText(getApplicationContext(),"Bir Şarkı Seçin",Toast.LENGTH_LONG).show();
                }
                else{
                    marscalar.pause();
                }
            }
        });
    }

    private Runnable UpdateSongTime = new Runnable() {
        public void run() {
            starttime = marscalar.getCurrentPosition();
            time.setText(String.format("%d:%d", TimeUnit.MILLISECONDS.toMinutes((long) starttime), TimeUnit.MILLISECONDS.toSeconds((long) starttime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) starttime))));
            sure.setProgress((int)starttime);
            hand.postDelayed(this, 100);
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            if(marscalar==null){
                finish();
            }
            else{
                marscalar.stop();
                marscalar.reset();
                finish();
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}