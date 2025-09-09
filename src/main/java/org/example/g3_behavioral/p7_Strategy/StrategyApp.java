package org.example.g3_behavioral.p7_Strategy;

import org.example.g3_behavioral.p7_Strategy.strategy.BitcoinPayment;
import org.example.g3_behavioral.p7_Strategy.strategy.CreditCardPayment;
import org.example.g3_behavioral.p7_Strategy.strategy.PayPalPayment;

public class StrategyApp {

    /**
     * Предположим, у нас есть система обработки платежей,
     * которая может использовать разные способы оплаты:
     * кредитные карты, PayPal и биткойны.
     */

    public static void call() {

        Cart cart = new Cart();

        cart.addItem(new Item("Laptop", 1000));
        cart.addItem(new Item("Phone", 500));

        // Оплата через кредитную карту
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout();

        // Оплата через PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout();

        // Оплата в биткойнах
        cart.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout();
    }
}
