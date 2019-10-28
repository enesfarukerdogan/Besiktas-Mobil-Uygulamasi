package com.example.enesfaruk.besiktasmobil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class puanlar extends ArrayAdapter<puanitem> {

    public puanlar(Context context, ArrayList<puanitem> puandetay) {
        super(context, 0, puandetay);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        puanitem item = getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.puanlar,parent,false);

        TextView sira = convertView.findViewById(R.id.sira);
        TextView takimismi = convertView.findViewById(R.id.takim);
        TextView oynananmac = convertView.findViewById(R.id.oynananmac);
        TextView averaj = convertView.findViewById(R.id.averaj);
        TextView puan = convertView.findViewById(R.id.puan);

        sira.setText(item.getSira());
        takimismi.setText(item.getTakimismi());
        oynananmac.setText(item.getOynananmac());
        averaj.setText(item.getAveraj());
        puan.setText(item.getPuan());

        return convertView;
    }
}
