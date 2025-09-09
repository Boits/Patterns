package org.example.g1_creational.p4_Abstract_Factory.way1.product;

public class ClassicTable implements Table {
    @Override
    public void placeItems() {
        System.out.println("Placing items on a classic table.");
    }
}
