package org.example.g3_behavioral.p7_Strategy.strategy;

import lombok.RequiredArgsConstructor;

// Оплата кредитной картой
@RequiredArgsConstructor
public class CreditCardPayment implements PaymentStrategy {

    private final String cardNumber;

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}
