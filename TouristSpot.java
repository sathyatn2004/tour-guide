package com.example.tour_guide;

public class TouristSpot {
    private String name;
    private String description;
    private String openingTime;
    private String closingTime;
    private String nearbyRestaurant;
    private String nearbyHotel;

    public TouristSpot(String name, String description, String openingTime, String closingTime,
                       String nearbyRestaurant, String nearbyHotel) {
        this.name = name;
        this.description = description;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.nearbyRestaurant = nearbyRestaurant;
        this.nearbyHotel = nearbyHotel;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getOpeningTime() { return openingTime; }
    public String getClosingTime() { return closingTime; }
    public String getNearbyRestaurant() { return nearbyRestaurant; }
    public String getNearbyHotel() { return nearbyHotel; }

    @Override
    public String toString() {
        return name;
    }
}
