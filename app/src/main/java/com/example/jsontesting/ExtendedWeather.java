package com.example.jsontesting;

public class ExtendedWeather {
    float temp,lat,lon;
    String description, name;

    public ExtendedWeather(float temp, float lat, float lon, String description, String name) {
        this.temp = temp;
        this.lat = lat;
        this.lon = lon;
        this.description = description;
        this.name = name;
    }

    @Override
    public String toString() {
        return "The cuurent weather at " +name + "is " + temp + " "+ description;


    }
}
