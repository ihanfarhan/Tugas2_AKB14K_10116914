/*
Tanggal Pengerjaan  : 17 April 2019
Nama                : Muhammad Farhan Fauzan
NIM                 : 10116914
Kelas               : IF14K
*/


package com.ihanfarhan.tugas2_10116914;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void Home(View view) {
        Intent intent = new Intent(Verify.this, Home.class);
        startActivity(intent);
    }
}
