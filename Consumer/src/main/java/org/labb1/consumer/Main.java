package org.labb1.consumer;

import org.labb1.temperature.Temperature;

import java.util.ServiceLoader;

public class Main {


    public static void main(String[] args) {


        ServiceLoader<Temperature> serviceLoader = ServiceLoader.load(Temperature.class);

        int celsius = 50;
        System.out.println("Temperature in Celsius is " + celsius + ".");

        for(Temperature temperature: serviceLoader){
            System.out.println(temperature.temperature());
        }
    }
}