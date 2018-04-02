package com.example.priyanshzalavadiya.basicapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class natural extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural);

    }
    public void process(View v){
        if(v.getId()==R.id.but1) {
            Intent toy = new Intent("com.example.priyanshzalavadiya.basicapplication.natural2");
            startActivity(toy);
        }
        Intent intent=null,chooser=null;
        if(v.getId()==R.id.s1) {
            intent= new Intent(Intent.ACTION_SEND);
            Uri p= Uri.parse("android.resource://com.example.priyanshzalavadiya.basicapplication/drawable/"+R.drawable.natural);
            intent.setType("image/*");
            intent.putExtra(Intent.EXTRA_STREAM,p);
            chooser = Intent.createChooser(intent,"SHARE");
            startActivity(chooser);
        }

    }
}
