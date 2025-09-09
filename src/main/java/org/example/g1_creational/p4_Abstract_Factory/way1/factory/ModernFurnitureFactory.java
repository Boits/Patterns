package org.example.g1_creational.p4_Abstract_Factory.way1.factory;

import org.example.g1_creational.p4_Abstract_Factory.way1.product.Chair;
import org.example.g1_creational.p4_Abstract_Factory.way1.product.ModernChair;
import org.example.g1_creational.p4_Abstract_Factory.way1.product.ModernTable;
import org.example.g1_creational.p4_Abstract_Factory.way1.product.Table;

public class ModernFurnitureFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
