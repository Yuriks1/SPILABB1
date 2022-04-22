package org.labb1.provide;

import org.labb1.temperature.Temperature;


public class KelvinTemperature implements Temperature {

    public KelvinTemperature() {
        System.out.println("Temperature in Kelvin :");
    }


    @Override
    public double Temperature(double c) {
        return c + 273.15;
    }
}
