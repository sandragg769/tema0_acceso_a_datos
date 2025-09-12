package org.example;

public class ConversorTemperatura {
    public static void main(String[] args) {

        double temperaturaCelsius = 20.5;
        System.out.println(celsiusFahrenheit(temperaturaCelsius));

        System.out.println(fahrenheitCelsius(68.9));
    }

    public static double celsiusFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}