package com.android.saket.petapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {
    private ImageView petImage;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;//kjkkkhhh
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        petImage = findViewById(R.id.petImage);
        petName = findViewById(R.id.petName);
        petBio = findViewById(R.id.petBio);
        extras = getIntent().getExtras();

        if (extras != null){
            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setup(name,bio);
        }

    }

    public void setup(String name, String bio){
        if (name.equals("Cutie")){
            petName.setText(name);
            petBio.setText(bio);
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.cat));
        }

        if (name.equals("Tommy")){
            petName.setText(name);
            petBio.setText(bio);
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.dog));
        }

    }
}
