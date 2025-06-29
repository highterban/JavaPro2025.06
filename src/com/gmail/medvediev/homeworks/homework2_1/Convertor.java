package com.gmail.medvediev.homeworks.homework2_1;

public class Convertor {
    public static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("This app is using for measures converting");
        double miles = 10;
        double kilometres = 12;
        kilometres= convMilesToKilometres(miles);
        System.out.println(kilometres + " kilometres");
    }
    private static double convMilesToKilometres(double miles) {
        return miles * CONV_K;
    }

}
