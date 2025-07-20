package com.gmail.medvediev.homeworks.homework8_1;

import java.util.Scanner;

public class Main {

    static double balance;

    public static void main(String[] args) {
        balance = getBalance();
        validateAmount(balance, getAmount());
    }

    // Повертає початковий баланс
    private static double getBalance() {
        return 1000.00; // Наявні кошти на рахунку
    }

    // Запитує у користувача суму покупки
    private static double getAmount() {
        System.out.printf("Balance is USD %.2f.%nEnter purchase amount, USD: ", balance);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // Валідує наявність достатньої кількості коштів
    private static void validateAmount(double balance, double withdrawal) {
        if (withdrawal > balance) {
            try {
                throw new FundsException("Insufficient funds!");
            } catch (FundsException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            balance = getBalanceAfterWithdrawal(balance, withdrawal);
            System.out.printf("Funds are OK. Purchase paid.%nBalance is USD %.2f", balance);
        }
    }

    // Обчислює залишок після покупки
    private static double getBalanceAfterWithdrawal(double balance, double withdrawal) {
        return balance - withdrawal;
    }
}
