package com.example.enesfaruk.besiktasmobil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class maclar extends ArrayAdapter<macitem> {

    public maclar(Context context, ArrayList<macitem> macdetay) {
        super(context, 0, macdetay);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        macitem item = getItem(position); //textleri çeken kısma bağlantı

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.maclar, parent, false);

        TextView evsahibi = convertView.findViewById(R.id.evsahibi);
        TextView deplasman = convertView.findViewById(R.id.deplasman);
        TextView skor = convertView.findViewById(R.id.skor);
        TextView turnuva = convertView.findViewById(R.id.turnuva);
        TextView tarih = convertView.findViewById(R.id.tarih);

        evsahibi.setText(item.getEvsahibi());
        deplasman.setText(item.getDeplasman());
        skor.setText(item.getSkor());
        turnuva.setText(item.getTurnuva());
        tarih.setText(item.getTarih());

        return convertView;
    }
}