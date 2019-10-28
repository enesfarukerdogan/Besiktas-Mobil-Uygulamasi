package com.example.enesfaruk.besiktasmobil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class kadrolar extends ArrayAdapter<kadroitem> {

    public kadrolar(Context context, ArrayList<kadroitem> kadrodetay) {
        super(context,0, kadrodetay);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        kadroitem item = getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.kadrolar, parent, false);

        TextView mevki = convertView.findViewById(R.id.mevki);
        TextView oyuncuismi = convertView.findViewById(R.id.oyuncuismi);
        TextView formano = convertView.findViewById(R.id.formano);

        mevki.setText(item.getMevki());
        oyuncuismi.setText(item.getOyuncuismi());
        formano.setText(item.getFormano());

        return convertView;
    }
}
