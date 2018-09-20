package com.android.saket.petapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView cat,dog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cat = findViewById(R.id.catimage);
        dog = findViewById(R.id.dogimage);
        cat.setOnClickListener(this);
        dog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.catimage):
                Intent i = new Intent(MainActivity.this,BioActivity.class);
                i.putExtra("name","Cutie");
                i.putExtra("bio","Oh!! really very nice cat and very cute.");

                startActivity(i);
                break;
            case (R.id.dogimage):
                Intent j = new Intent(MainActivity.this,BioActivity.class);
                j.putExtra("name","Tommy");
                j.putExtra("bio","Very lovely dog and eats a lots");
                startActivity(j);
                break;

        }
    }
}
