package org.example.g1_creational.p2_Factory_Method.way1.creator;

import org.example.g1_creational.p2_Factory_Method.way1.product.VehicleCommonProduct;

// Абстрактный класс, содержащий фабричный метод
public abstract class AbstractTransportCreator {

    // Фабричный метод
    public abstract VehicleCommonProduct createProductVehicleFactoryMethod();

    // Общая логика, использующая объекты, созданные фабричным методом
    public void startTransport() {
        VehicleCommonProduct product = createProductVehicleFactoryMethod();
        product.drive();
    }
}
