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

public class kadro extends AppCompatActivity {

    private ListView kadro;
    private kadrolar kadrolar;
    private ArrayList<kadroitem> kadrodetay = new ArrayList<>();
    private FirebaseDatabase db;
    private DatabaseReference dbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kadro);

        kadro = (ListView) findViewById(R.id.listview3);
        db = FirebaseDatabase.getInstance();

        //şablonu listviewe bağlıyoruz
        kadrolar = new kadrolar(getApplicationContext(), kadrodetay);
        kadro.setAdapter(kadrolar);

        //databaseden kadroyu çekiyoruz
        dbref = db.getReference("oyuncular/"+"/kadro");

        //çekilen kadroyu listviewe ekliyoruz
        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                kadrodetay.clear();
                for(DataSnapshot ds : dataSnapshot.getChildren()){
                    kadroitem item = ds.getValue(kadroitem.class);
                    kadrodetay.add(item);
                }
                kadrolar.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}