package com.kodilla.weather;

import com.kodilla.weather.db.LeazyWeatherProxy;
import com.kodilla.weather.db.MockWeatherReciver;
import com.kodilla.weather.db.WeatherRetriever;
import java.util.Random;

public class WeatherApp {

    public static void main(String[] args) throws InterruptedException {

        long begin = System.currentTimeMillis();
        for (int n = 0; n < 10; n++) {

//            WeatherRetriever weatherRetriever = new MockWeatherReciver();
            WeatherRetriever weatherRetriever = new LeazyWeatherProxy();

            int number = new Random().nextInt(100);
            if (number < 20)
                weatherRetriever.refreshData();

            //System.out.println("Weather:  " + weatherRetriever.getWeather());
            System.out.println("Execution #" + n + " just finished");
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }
}
