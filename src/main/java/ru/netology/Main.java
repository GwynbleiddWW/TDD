package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sumOf = 0;
        double percentOf = 0;
        double mouthOf = 0;
        CreditCalc creditCalc = new CreditCalc();

        Scanner scan = new Scanner(System.in);
        System.out.println("Кредитный калькулятор.\nВведите сумму кредита: ");
        sumOf = scan.nextDouble();
        System.out.println("Введите годовой процент: ");
        percentOf = scan.nextDouble();
        System.out.println("Введите количестов месяцев кредита: ");
        mouthOf = scan.nextDouble();

        creditCalc.paymentOfMonth(sumOf, percentOf, mouthOf);
    }
}
