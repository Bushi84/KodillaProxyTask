package com.kodilla.weather.db;

public class LeazyWeatherProxy implements WeatherRetriever {

    private MockWeatherReciver mockWeatherReciver;

    @Override
    public String getWeather() throws InterruptedException {
        if (mockWeatherReciver == null)
            mockWeatherReciver = new MockWeatherReciver();
        return mockWeatherReciver.getWeather();
    }

    @Override
    public void refreshData() throws InterruptedException {
        if (mockWeatherReciver == null)
            this.mockWeatherReciver = new MockWeatherReciver();
        else
            mockWeatherReciver.refreshData();
    }
}
