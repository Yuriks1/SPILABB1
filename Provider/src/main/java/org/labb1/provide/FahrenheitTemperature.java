package org.labb1.provide;

import org.labb1.temperature.Temperature;


public class FahrenheitTemperature implements Temperature {

    public FahrenheitTemperature() {
        System.out.println("Temperature in Fahrenheit :");
    }


    @Override
    public Double temperature() {

        return (50 * 9.0/5.0) + 32.0;
    }
}
