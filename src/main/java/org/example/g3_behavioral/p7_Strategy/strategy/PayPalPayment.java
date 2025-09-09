package org.example.g3_behavioral.p7_Strategy.strategy;

import lombok.RequiredArgsConstructor;

// Оплата через PayPal
@RequiredArgsConstructor
public class PayPalPayment implements PaymentStrategy {

    private final String email;

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}
