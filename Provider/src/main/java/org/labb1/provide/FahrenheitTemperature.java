package org.labb1.provide;

import org.labb1.temperature.Temperature;


public class FahrenheitTemperature implements Temperature {

    public FahrenheitTemperature() {
        System.out.println("Temperature in Fahrenheit :");
    }

    @Override
    public double transform(double c) {
        return (c * 9 / 5) + 32;
    }

    @Override
    public String getSymbol() {
        return "°F";
    }
}
