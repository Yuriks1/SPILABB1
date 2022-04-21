package org.labb1.provide;

import org.labb1.temperature.Temperature;


public class KelvinTemperature implements Temperature {

    public KelvinTemperature() {
        System.out.println("Temperature in Kelvin :");
    }


    @Override
    public Double temperature() {

        return 50 + 273.15;
    }
}
