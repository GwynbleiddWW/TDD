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

        double payment = creditCalc.paymentOfMonth(sumOf, percentOf, mouthOf);
        double totalAmountRound = creditCalc.totalAmount(payment, mouthOf);
        double overpaymentRound = creditCalc.overpayment(totalAmountRound, sumOf);

        System.out.println("Месячная сумма платежа: " + payment +
                "\nОбщая сумма к возрату в банк: " + totalAmountRound +
                "\nПереплата за весь период: " + overpaymentRound);
    }
}
