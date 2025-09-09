package org.example.g1_creational.p4_Abstract_Factory.way1.product;

public class ClassicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a classic chair.");
    }
}
