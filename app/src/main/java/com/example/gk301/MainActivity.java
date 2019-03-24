package com.example.gk301;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fotografVideoCek(View view)
    {
        Intent i=new Intent(MainActivity.this,FotografVideoActivity.class);
        startActivity(i);
    }

    public void smsGonder(View view)
    {
        Intent i=new Intent(MainActivity.this,SmsActivity.class);
        startActivity(i);
    }

    public void aramaYap(View view)
    {
        Intent i=new Intent(MainActivity.this,AramaActivity.class);
        startActivity(i);
    }

    public void Web(View view)
    {
        Intent i=new Intent(MainActivity.this,WebActivity.class);
        startActivity(i);
    }

    public void voice(View view)
    {
        Intent i=new Intent(MainActivity.this,VoiceActivity.class);
        startActivity(i);
    }
}
