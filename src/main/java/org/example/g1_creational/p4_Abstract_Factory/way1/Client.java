package org.example.g1_creational.p4_Abstract_Factory.way1;

import org.example.g1_creational.p4_Abstract_Factory.way1.factory.FurnitureAbstractFactory;
import org.example.g1_creational.p4_Abstract_Factory.way1.product.Chair;
import org.example.g1_creational.p4_Abstract_Factory.way1.product.Table;

public class Client {
    private final Chair chair;
    private final Table table;

    public Client(FurnitureAbstractFactory factory) {
        chair = factory.createChair();
        table = factory.createTable();
    }

    public void useFurniture() {
        chair.sitOn();
        table.placeItems();
    }
}
