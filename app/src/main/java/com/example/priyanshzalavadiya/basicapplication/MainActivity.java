package com.example.priyanshzalavadiya.basicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toast(View view){
        Toast toast=Toast.makeText(this,"Welcome To Gallery!!!", Toast.LENGTH_SHORT);
        toast.show();
        Intent toy = new Intent("com.example.priyanshzalavadiya.basicapplication.second");
        startActivity(toy);
    }
}
