package com.gmail.medvediev.homeworks.homework5_1;

public class CalcCostDelivery extends CalcCostBase {

    // Вартість доставки
    private final static double deliveryPrice = 7.0;

    // Розрахунок вартості товару,
    // з урахуванням вартості доставки
    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + deliveryPrice;
    }
}