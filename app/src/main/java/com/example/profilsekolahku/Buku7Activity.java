package com.example.profilsekolahku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Buku7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku7);
    }

    public void mtk7(View view) {
        goToUrl("https://drive.google.com/file/d/17zaH5O0YRtMNueKxCKeNv2U1_An7QOiK/view?usp=drivesdk");
    }

    public void bi7(View view) {
        goToUrl("https://drive.google.com/file/d/17i5FpSXODOm_j3SBltygrub5mRmlCLS1/view?usp=drivesdk");
    }

    public void bing7(View view) {
        goToUrl("https://drive.google.com/file/d/17ohLAJooXRxPksCppQPFyVcmzS0v64xS/view?usp=drivesdk");
    }
    private void  goToUrl(String url){
        Uri uriUrl  = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(launchBrowser);
    }
}