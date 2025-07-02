package com.gmail.medvediev.homeworks.homework3_1;

public class TemperatureConvertor {
    public static void main(String[] args) {
        System.out.println("This app is using for converting temperature");
        double fahrenheit = 100;
        double celsius;
        celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f fahrenheit to celsius: %.2f %n", fahrenheit, celsius);

        celsius = 20;
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.printf("%.2f celsius to fahrenheit: %.2f %n", celsius, fahrenheit);
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

}
