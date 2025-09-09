package org.example.g1_creational.p2_Factory_Method.way1.creator;

import org.example.g1_creational.p2_Factory_Method.way1.product.VehicleCommonProduct;
import org.example.g1_creational.p2_Factory_Method.way1.product.ShipProduct;

import java.io.Serializable;

// Подкласс для создания кораблей
public class ShipCreator extends AbstractTransportCreator {
    @Override
    public VehicleCommonProduct createProductVehicleFactoryMethod() {
        return new ShipProduct();
    }
}
