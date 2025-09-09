package org.example.g2_structural.p3_Adapter;

/**
 * Конкретная реализация американского разъема
 * (Не используется)
 */
public class AmericanSocketImpl implements AmericanSocket {
    @Override
    public void plugIn() {
        System.out.println("Device is plugged into American socket (120V).");
    }
}
