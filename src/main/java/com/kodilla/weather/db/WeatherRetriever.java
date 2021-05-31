package com.kodilla.weather.db;

public interface WeatherRetriever {

    public String getWeather() throws InterruptedException;
    public void refreshData() throws InterruptedException;
}
