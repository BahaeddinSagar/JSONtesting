package com.example.jsontesting;

public class Weather {
    int temp;
    int humidity;
    int pressure;
    int temp_min;
    int temp_max;

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

    public Weather(int temp, int humidity, int pressure, int temp_min, int temp_max) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(int temp_min) {
        this.temp_min = temp_min;
    }

    public int getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(int temp_max) {
        this.temp_max = temp_max;
    }
}
