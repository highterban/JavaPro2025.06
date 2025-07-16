package com.gmail.medvediev.homeworks.homework7_1;

public class Corrector {

    public String handleData(String[] args) {
        StringBuilder stringBuilder= new StringBuilder();
        int count = 0;
        for (String str : args) {
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            count++;
            stringBuilder.append(count).append(") ").append(str).append("\n");
        }
        return stringBuilder.toString();
    }
}