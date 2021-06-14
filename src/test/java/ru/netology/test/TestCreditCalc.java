package ru.netology.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.CreditCalc;

import java.util.concurrent.ThreadLocalRandom;

public class TestCreditCalc {

    @Test
    public void testCreditCalc() {
        CreditCalc creditCalc = new CreditCalc();

        double sum = ThreadLocalRandom.current().nextDouble();
        double percent = ThreadLocalRandom.current().nextDouble();
        double months = ThreadLocalRandom.current().nextDouble();

        creditCalc.paymentOfMonth(sum, percent, months);
        Assertions.assertNotNull(creditCalc);
    }
}
