package com.example.tour_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        // Sample data
        ArrayList<TouristSpot> spots = new ArrayList<>();
        spots.add(new TouristSpot(
                "Eiffel Tower",
                "An iconic tower in Paris.",
                "9:00 AM",
                "11:45 PM",
                "Le Jules Verne Restaurant",
                "Hotel Pullman Paris Tour Eiffel"
        ));

        spots.add(new TouristSpot(
                "Great Wall of China",
                "Ancient wall in China.",
                "7:30 AM",
                "5:30 PM",
                "The Schoolhouse Restaurant",
                "Brickyard Retreat at Mutianyu"
        ));

        spots.add(new TouristSpot(
                "Taj Mahal",
                "A famous monument in India.",
                "6:00 AM",
                "6:30 PM",
                "Pinch of Spice",
                "The Oberoi Amarvilas"
        ));

        // Adapter
        ArrayAdapter<TouristSpot> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, spots);
        listView.setAdapter(adapter);

        // OnClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TouristSpot selectedSpot = spots.get(position);

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("name", selectedSpot.getName());
                intent.putExtra("description", selectedSpot.getDescription());
                intent.putExtra("openingTime", selectedSpot.getOpeningTime());
                intent.putExtra("closingTime", selectedSpot.getClosingTime());
                intent.putExtra("nearbyRestaurant", selectedSpot.getNearbyRestaurant());
                intent.putExtra("nearbyHotel", selectedSpot.getNearbyHotel());
                startActivity(intent);
            }
        });
    }
}
