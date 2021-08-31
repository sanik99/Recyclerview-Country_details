package com.example.recyclerview_country_details;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class country_details extends AppCompatActivity {

    TextView countryID, areaID, religionID, populationID, detailsArea, animalsID, birdsID, returnHome;
    ImageView flagID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);
        setTitle("Countries");

        countryID = findViewById(R.id.countryID);
        areaID = findViewById(R.id.areaID);
        religionID = findViewById(R.id.religionID);
        populationID = findViewById(R.id.populationID);
        detailsArea = findViewById(R.id.detailsArea);
        animalsID = findViewById(R.id.animalsID);
        birdsID = findViewById(R.id.birdsID);
        flagID = findViewById(R.id.flagID);

        flagID.setImageResource(getIntent().getIntExtra("flag", 0));
        countryID.setText(getIntent().getStringExtra("countryname"));
        areaID.setText(getIntent().getStringExtra("area"));
        religionID.setText(getIntent().getStringExtra("religion"));
        populationID.setText(getIntent().getStringExtra("population"));
        detailsArea.setText(getIntent().getStringExtra("detailsarea"));
        animalsID.setText(getIntent().getStringExtra("animals"));
        birdsID.setText(getIntent().getStringExtra("birds"));



        returnHome = findViewById(R.id.returnHome);

        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(country_details.this, MainActivity.class));
            }
        });

    }
}