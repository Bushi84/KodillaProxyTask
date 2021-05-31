package com.kodilla.weather.db;

import java.util.Random;

public class MockWeatherReciver implements WeatherRetriever {

    private String weather;

    public MockWeatherReciver() throws InterruptedException {
        refreshData();
    }

    @Override
    public String getWeather() {
        return weather;
    }

    @Override
    public void refreshData() throws InterruptedException {

        System.out.println("Refresh data!");
        Thread.sleep(5000);
        int number = new Random().nextInt(30);
        if (number < 10) this.weather = WeatherStatus.BAD.name();
        else if (number < 20) this.weather = WeatherStatus.FINE.name();
        else this.weather = WeatherStatus.GOOD.name();
    }
}
