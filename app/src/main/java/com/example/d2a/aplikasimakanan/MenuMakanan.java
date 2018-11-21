package com.example.d2a.aplikasimakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MenuMakanan extends AppCompatActivity {
    Integer counterlauk=0;
    Integer jmlhhrgalauk=0;
    Integer counteresteh=0;
    Integer jmlhhrgaesteh=0;
    Integer countersayur=0;
    Integer jmlhhrgasayur=0;
    Integer counternasi=0;
    Integer jmlhrgnasi=0;
    Integer grantot=0;
    TextView Textjmlnasi,Texthrgnasi,Texthargatotal;
    TextView Textjmllauk,Texthrglauk;
    TextView Textjmlesteh,Texthrgesteh;
    TextView Textjmlsayur,Texthrgsayur;
    TextView Textgrantotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);
        Textjmlnasi=(TextView)findViewById(R.id.counternasi);
        Texthrgnasi=(TextView)findViewById(R.id.counterharganasi);
        Textjmllauk=(TextView)findViewById(R.id.counterlauk);
        Texthrglauk=(TextView)findViewById(R.id.counterhargalauk);
        Textjmlesteh=(TextView)findViewById(R.id.counteresteh);
        Texthrgesteh=(TextView)findViewById(R.id.counterhargaesteh);
        Textjmlsayur=(TextView)findViewById(R.id.countersayur);
        Texthrgsayur=(TextView)findViewById(R.id.counterhargasayur);
        Textgrantotal=(TextView)findViewById(R.id.grantotal);

    }

    public void hitungnasi(View er)
    {
        counternasi++;
        jmlhrgnasi=counternasi*3000;
        Textjmlnasi.setText(counternasi.toString());
        Texthrgnasi.setText(jmlhrgnasi.toString());
        grantot=(jmlhhrgaesteh+jmlhhrgasayur+jmlhhrgalauk+jmlhrgnasi);
        Textgrantotal.setText(grantot.toString());
    }

    public void hitunglauk(View er)
    {
        counterlauk++;
        jmlhhrgalauk=counterlauk*7500;
        Textjmllauk.setText(counterlauk.toString());
        Texthrglauk.setText(jmlhhrgalauk.toString());
        grantot=(jmlhhrgaesteh+jmlhhrgasayur+jmlhhrgalauk+jmlhrgnasi);
        Textgrantotal.setText(grantot.toString());
    }

    public void hitungesteh(View er)
    {
        counteresteh++;
        jmlhhrgaesteh=counteresteh*7500;
        Textjmlesteh.setText(counteresteh.toString());
        Texthrgesteh.setText(jmlhhrgaesteh.toString());
        grantot=(jmlhhrgaesteh+jmlhhrgasayur+jmlhhrgalauk+jmlhrgnasi);
        Textgrantotal.setText(grantot.toString());
    }

    public void hitungsayur(View er)
    {
        countersayur++;
        jmlhhrgasayur=countersayur*8000;
        Textjmlsayur.setText(countersayur.toString());
        Texthrgsayur.setText(jmlhhrgasayur.toString());
        grantot=(jmlhhrgaesteh+jmlhhrgasayur+jmlhhrgalauk+jmlhrgnasi);
        Textgrantotal.setText(grantot.toString());
    }
    public void hargatotal(View er)
    {
        grantot=(jmlhhrgaesteh+jmlhhrgasayur+jmlhhrgalauk+jmlhrgnasi);
        Textgrantotal.setText(grantot.toString());

    }

}


