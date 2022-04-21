package org.labb1.consumer;

import org.labb1.temperature.Temperature;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        ServiceLoader<Temperature> serviceLoader = ServiceLoader.load(Temperature.class);

        System.out.println("Please enter temperature in Celsius :");
        int celsius = scanner.nextInt();
        System.out.println("Temperature in Celsius is " + celsius + ".");


        for(Temperature temperature: serviceLoader){
            if (temperature.getClass().getSimpleName().startsWith("Kelvin"))
            System.out.println(temperature.temperature() + celsius);

            else if(temperature.getClass().getSimpleName().startsWith("Fahrenheit"))
                System.out.println(temperature.temperature() + (celsius * 9.0/5.0));
        }
    }
}