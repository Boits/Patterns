package org.example.g1_creational.p2_Factory_Method.way1.creator;

import org.example.g1_creational.p2_Factory_Method.way1.product.VehicleCommonProduct;
import org.example.g1_creational.p2_Factory_Method.way1.product.CarProduct;

// Подкласс для создания автомобилей
public class CarCreator extends AbstractTransportCreator {
    @Override
    public VehicleCommonProduct createProductVehicleFactoryMethod() {
        return new CarProduct();
    }
}
