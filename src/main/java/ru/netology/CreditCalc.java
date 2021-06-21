package ru.netology;

public class CreditCalc {
    private double sumOfCredit;
    private double amountOfMonths;
    private double interestRate;

    public double paymentOfMonth(double sumOfCredit, double interestRate, double amountOfMonths) {
        double rate = (interestRate / 100) / 12;
        double payment = sumOfCredit * ((rate * (Math.pow(1 + rate, amountOfMonths)))
                / (Math.pow(1 + rate, amountOfMonths) - 1));
        return Math.ceil(payment);
    }

    public double totalAmount(double payment, double amountOfMonths) {
        double totalAmount = payment * amountOfMonths;
        return Math.ceil(totalAmount);
    }

    public double overpayment(double totalAmount, double sumOfCredit) {
        double overpayment = totalAmount - sumOfCredit;
        return Math.ceil(overpayment);
    }
}