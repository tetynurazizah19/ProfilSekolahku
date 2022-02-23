package com.example.profilsekolahku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void Guru(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void Ekskul(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void Fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void Galeri(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }
}