package com.example.gk301;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HaritaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harita);
    }


    public void HaritayaGit(View view)
    {
        Uri osmaniyeninKoordinatlari= Uri.parse("geo:37.0748,36.2466");
    }
}
