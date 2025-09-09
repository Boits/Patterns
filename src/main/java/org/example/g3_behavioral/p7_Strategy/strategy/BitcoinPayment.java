package org.example.g3_behavioral.p7_Strategy.strategy;

import lombok.RequiredArgsConstructor;

// Оплата в биткойнах
@RequiredArgsConstructor
public class BitcoinPayment implements PaymentStrategy {

    private final String bitcoinAddress;

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin: " + bitcoinAddress);
    }
}