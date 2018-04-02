package com.example.priyanshzalavadiya.basicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void process(View v){
        if(v.getId()==R.id.but2)
        {
            Intent toy = new Intent("com.example.priyanshzalavadiya.basicapplication.wild1");
            startActivity(toy);
        }
        if(v.getId()==R.id.but3)
        {
            Intent toy = new Intent("com.example.priyanshzalavadiya.basicapplication.natural");
            startActivity(toy);
        }
        if(v.getId()==R.id.but4)
        {
            Intent toy = new Intent("com.example.priyanshzalavadiya.basicapplication.face1");
            startActivity(toy);
        }
        if(v.getId()==R.id.but5)
        {
            Intent toy = new Intent("com.example.priyanshzalavadiya.basicapplication.tech1");
            startActivity(toy);
        }
        if(v.getId()==R.id.but6)
        {
            Intent toy = new Intent("com.example.priyanshzalavadiya.basicapplication.celeb1");
            startActivity(toy);
        }

    }

}
