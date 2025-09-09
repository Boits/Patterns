package org.example.g3_behavioral.p7_Strategy;

import org.example.g3_behavioral.p7_Strategy.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Context (Контекст), который использует стратегию
 */
public class Cart {
    private final List<Item> items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public void addItem(Item item) {
        items.add(item);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        int total = items.stream()
                .mapToInt(Item::price)
                .sum();
        paymentStrategy.pay(total);
    }
}
