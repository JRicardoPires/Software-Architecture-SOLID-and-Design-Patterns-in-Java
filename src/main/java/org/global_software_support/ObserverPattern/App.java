package org.global_software_support.ObserverPattern;

public class App {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        WeatherObserver weatherObserver = new WeatherObserver(station);

        station.setHumidity(100);
        station.setPressure(200);
        station.setTemperature(300);

    }
}