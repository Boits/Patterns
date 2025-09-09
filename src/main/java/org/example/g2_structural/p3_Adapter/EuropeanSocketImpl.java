package org.example.g2_structural.p3_Adapter;

/**
 * Конкретная реализация европейского разъема
 */
public class EuropeanSocketImpl implements EuropeanSocket {
    @Override
    public void connect() {
        System.out.println("Device is connected to European socket (220V).");
    }
}
