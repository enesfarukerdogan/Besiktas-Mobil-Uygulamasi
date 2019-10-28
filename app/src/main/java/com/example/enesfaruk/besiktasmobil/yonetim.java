package com.example.enesfaruk.besiktasmobil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class yonetim extends AppCompatActivity {

    private ListView yonetim;
    private yonetimler yonetimler;
    private ArrayList<yonetimitem> yonetimdetay = new ArrayList<>();
    private FirebaseDatabase db;
    private DatabaseReference dbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yonetim);

        yonetim = (ListView) findViewById(R.id.listview4);
        db = FirebaseDatabase.getInstance();

        //Şablonu Listviewe ekliyoruz
        yonetimler = new yonetimler(getApplicationContext(), yonetimdetay);
        yonetim.setAdapter(yonetimler);

        //databaseden verileri çekiyoruz
        dbref = db.getReference("yonetim/"+"/kurul");

        //çektiğimiz verileri listviewe ekliyoruz
        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                yonetimdetay.clear();
                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    yonetimitem item = ds.getValue(yonetimitem.class);
                    yonetimdetay.add(item);
                }
                yonetimler.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}