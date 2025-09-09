package org.example.g1_creational.p2_Factory_Method.way1.product;

// Конкретная реализация автомобиля
public class CarProduct implements VehicleCommonProduct {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}
