package org.example.g2_structural.p6_Proxy;

public class RealSubject implements Subject {

    public RealSubject() {
        System.out.println("Создание RealSubject");
    }
    @Override
    public void request() {
        System.out.println("Real subject request");
    }
}