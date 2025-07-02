package com.gmail.medvediev.homeworks.homework3_1;

public class TemperatureConvertor {
    public static void main(String[] args) {
        System.out.println("This app is using for converting temperature");
        double fahrenheit = 100;
        double celsius;
        celsius = convFahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f fahrenheit to celsius: %.2f %n", fahrenheit, celsius);
    }

    public static double convFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
