package org.labb1.provide;

import org.labb1.temperature.Temperature;

public class RankineTemperature implements Temperature {

    public RankineTemperature() {
        System.out.println("Temperature in Rankin :");
    }
    @Override
    public double Temperature(double c) {
      return (c * 9 / 5) + 491.67;
    }
}
