package com.gmail.medvediev.homeworks.homework7_1;

public class Main {

    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        Corrector corrector = new Corrector();
        String output = corrector.handleData(dataProvider.getData());
        getOutput(output);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}