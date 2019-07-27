package com.farid.calculator11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.ref.SoftReference;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //mengambil variable dari input//
    EditText angkapertama, angkakedua, hasil;
    Button buttonkali, buttontambah, buttonbagi, buttonminus, buttonhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //memulai aktivity//
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // mengambil layout daru activity_nain//

        angkapertama = findViewById(R.id.angkapertama);
        angkakedua = findViewById(R.id.angkakedua);
        hasil = findViewById(R.id.hasil);

        buttonbagi = findViewById(R.id.buttonbagi);
        buttonkali = findViewById(R.id.buttonkali);
        buttonminus = findViewById(R.id.buttonminus);
        buttontambah = findViewById(R.id.buttontambah);
        buttonhasil = findViewById(R.id.buttonhasil);
        // menghubungkan variable dengan id //
        buttonbagi.setOnClickListener(this);
        buttonhasil.setOnClickListener(this);
        buttonkali.setOnClickListener(this);
        buttonminus.setOnClickListener(this);
        buttontambah.setOnClickListener(this);
        //membuat aksi ketika di click//
    }

    public void onClick(View view) {
        //menambahkan aksi ketika di klik//
        switch (view.getId()) {
            case R.id.buttontambah:
                String pertama1 = angkapertama.getText().toString();
                String kedua1 = angkakedua.getText().toString();

                Double plus1 = Double.parseDouble(pertama1);
                Double plus2 = Double.parseDouble(kedua1);
                Double plushasil = plus1 + plus2;
                String plusHasilOut = String.valueOf(plushasil);
                hasil.setText(plusHasilOut);
                break;
            case R.id.buttonminus:
                String pertama = angkapertama.getText().toString();
                String kedua = angkakedua.getText().toString();

                Double minus1 = Double.parseDouble(pertama);
                Double minus2 = Double.parseDouble(kedua);
                Double minushasil = minus1 - minus2;
                String minusHasilOut = String.valueOf(minushasil);
                hasil.setText(minusHasilOut);
                break;
            case R.id.buttonkali:
                String pertama2 = angkapertama.getText().toString();
                String kedua2 = angkakedua.getText().toString();

                Double kali1 = Double.parseDouble(pertama2);
                Double kali2 = Double.parseDouble(kedua2);
                Double kalihasil = kali1 * kali2;
                String kaliHasilOut = String.valueOf(kalihasil);
                hasil.setText(kaliHasilOut);
                break;
            case R.id.buttonbagi:
                String pertama3 = angkapertama.getText().toString();
                String kedua3 = angkakedua.getText().toString();

                Double bagi1 = Double.parseDouble(pertama3);
                Double bagi2 = Double.parseDouble(kedua3);
                Double bagihasil = bagi1 / bagi2;
                String bagiHasilOut = String.valueOf(bagihasil);

                hasil.setText(bagiHasilOut);

                break;
        }

    }
}