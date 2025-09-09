package org.example.g1_creational.p4_Abstract_Factory.way1.factory;

import org.example.g1_creational.p4_Abstract_Factory.way1.product.Chair;
import org.example.g1_creational.p4_Abstract_Factory.way1.product.ClassicChair;
import org.example.g1_creational.p4_Abstract_Factory.way1.product.ClassicTable;
import org.example.g1_creational.p4_Abstract_Factory.way1.product.Table;

public class ClassicFurnitureFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
