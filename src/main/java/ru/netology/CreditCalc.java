package ru.netology;

public class CreditCalc {
    private double sumOfCredit;
    private double amountOfMonths;
    private double interestRate;

    public void paymentOfMonth(double sumOfCredit, double interestRate, double amountOfMonths) {
        double rate = (interestRate / 100) / 12;
        double payment = sumOfCredit * ((rate * (Math.pow(1 + rate, amountOfMonths)))
                / (Math.pow(1 + rate, amountOfMonths) - 1));
        double totalAmount = payment * amountOfMonths;
        double overpayment = totalAmount - sumOfCredit;

        double paymentRound = Math.ceil(payment);
        double totalAmountRound = Math.ceil(totalAmount);
        double overpaymentRound = Math.ceil(overpayment);

        System.out.println("Месячная сумма платежа: " + paymentRound +
                "\nОбщая сумма к возрату в банк: " + totalAmountRound +
                "\nПереплата за весь период: " + overpaymentRound);
    }
}