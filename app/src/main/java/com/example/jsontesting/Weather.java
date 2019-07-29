package com.example.jsontesting;

public class Weather {
    int temp;
    int humidity;
    int pressure;
    int temp_min;
    int temp_max;
    int noExists;


    @Override
    public String toString() {
        return "Weather{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", temp_min=" + temp_min +
                ", temp_max=" + temp_max +
                '}';
    }

    public Weather(int temp, int humidity, int pressure, int temp_min, int temp_max, int noExists) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.noExists = noExists;
    }

    public Weather(int temp, int humidity, int pressure, int temp_min, int temp_max) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }
}
