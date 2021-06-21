package ru.netology.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.CreditCalc;

import java.util.concurrent.ThreadLocalRandom;

public class TestCreditCalc {

    @Test
    public void testCreditCalc() {
        CreditCalc creditCalc = new CreditCalc();

        double sum = Math.ceil(ThreadLocalRandom.current().nextDouble(1000, 100000));
        double percent = Math.ceil(ThreadLocalRandom.current().nextDouble(5, 50));
        double months = Math.ceil(ThreadLocalRandom.current().nextDouble(6, 60));

        double payment = creditCalc.paymentOfMonth(sum, percent, months);
        double totalAmount = creditCalc.totalAmount(payment, months);
        double overpayment = creditCalc.overpayment(totalAmount, sum);
        System.out.println(totalAmount + ">" + sum);
        Assertions.assertTrue(totalAmount > sum);
    }
}
