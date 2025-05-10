package com.example.tour_guide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Retrieve data from Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String description = intent.getStringExtra("description");
        String openingTime = intent.getStringExtra("openingTime");
        String closingTime = intent.getStringExtra("closingTime");
        String nearbyRestaurant = intent.getStringExtra("nearbyRestaurant");
        String nearbyHotel = intent.getStringExtra("nearbyHotel");

        // Link TextViews
        TextView nameTextView = findViewById(R.id.detailName);
        TextView descriptionTextView = findViewById(R.id.detailDescription);
        TextView openingTimeTextView = findViewById(R.id.detailOpeningTime);
        TextView closingTimeTextView = findViewById(R.id.detailClosingTime);
        TextView restaurantTextView = findViewById(R.id.detailNearbyRestaurant);
        TextView hotelTextView = findViewById(R.id.detailNearbyHotel);

        // Set values
        nameTextView.setText("Name: " + name);
        descriptionTextView.setText("Description: " + description);
        openingTimeTextView.setText("Opening Time: " + openingTime);
        closingTimeTextView.setText("Closing Time: " + closingTime);
        restaurantTextView.setText("Nearby Restaurant: " + nearbyRestaurant);
        hotelTextView.setText("Nearby Hotel: " + nearbyHotel);
    }
}
