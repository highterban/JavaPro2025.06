package com.gmail.medvediev.homeworks.homework2_1;

public class Convertor {
    public static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("This app is using for measures converting");
        double miles = 10;
        double kilometres = convMilesToKilometres(miles);
        System.out.printf("%.2f kilometres %n", kilometres);
        kilometres = 20;
        miles = convKilometresToMiles(kilometres);
        System.out.printf("%.2f miles %n", miles);
    }

    private static double convMilesToKilometres(double miles) {
        return miles * CONV_K;
    }

    private static double convKilometresToMiles(double kilometres) {
        return kilometres / CONV_K;
    }
}
