package org.labb1.provide;

import org.labb1.temperature.Temperature;


public class KelvinTemperature implements Temperature {

    public KelvinTemperature() {System.out.println("Temperature in Kelvin :");}

    @Override
    public double transform(double c) {
        return c + 273.15;
    }

    @Override
    public String getSymbol() {return "K";}
}
