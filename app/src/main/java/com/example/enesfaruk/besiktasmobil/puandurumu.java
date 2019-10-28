package com.example.enesfaruk.besiktasmobil;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class puandurumu extends AppCompatActivity {

    private ProgressDialog progressDialog;
    private WebView webviev;
    private String url="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puandurumu);

        webviev = (WebView) findViewById(R.id.puanweb);

        url="http://haber1903.com/puandurumu";

        webviev.getSettings().setJavaScriptEnabled(true);

        webviev.getSettings().setDefaultTextEncodingName("utf-8");


        new VeriCek().execute();
    }

    public class  VeriCek extends AsyncTask<Void,Void,Void>
    {

        String data = "";
        Document doc = null;
        @Override
        protected Void doInBackground(Void... params) {

            try {

                doc = Jsoup.connect(url).get();
                Element style=doc.head();
                Elements alldivs=doc.select("div[class=card col m12 s12 l12]");

                data+=style;
                Element element;
                for(int i=0;i<alldivs.size();i++) {

                    element=alldivs.get(i);
                    data += element.outerHtml();
                    data += "<br/>";
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPreExecute() {

            progressDialog = new ProgressDialog(puandurumu.this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setMessage("Yükleniyor...");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @Override
        protected void onPostExecute(Void result) {

            super.onPostExecute(result);
            if (progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            webviev.loadDataWithBaseURL(null, data, "text/html", "UTF-8",null);
        }
    }
}
