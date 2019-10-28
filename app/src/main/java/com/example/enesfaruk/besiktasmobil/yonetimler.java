package com.example.enesfaruk.besiktasmobil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class yonetimler extends ArrayAdapter<yonetimitem>{

    public yonetimler(Context context, ArrayList<yonetimitem> yonetimdetay){
        super(context,0, yonetimdetay);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        yonetimitem item = getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.yonetimler, parent, false);

        TextView yoneticiismi = (TextView) convertView.findViewById(R.id.yoneticiisim);
        TextView gorev = (TextView) convertView.findViewById(R.id.gorev);

        yoneticiismi.setText(item.getYoneticiismi());
        gorev.setText(item.getGorev());

        return convertView;
    }

}
