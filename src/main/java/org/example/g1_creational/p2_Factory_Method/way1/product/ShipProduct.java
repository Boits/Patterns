package org.example.g1_creational.p2_Factory_Method.way1.product;

// Конкретная реализация корабля
public class ShipProduct implements VehicleCommonProduct {
    @Override
    public void drive() {
        System.out.println("Sailing a ship...");
    }
}
