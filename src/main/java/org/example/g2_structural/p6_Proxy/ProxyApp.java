package org.example.g2_structural.p6_Proxy;

public class ProxyApp {

    public static void call() {
        Subject userProxy = new Proxy("USER");
        //Объект RealSubject НЕ создается
        userProxy.request(); // Access denied.

        Subject adminProxy = new Proxy("ADMIN");
        //Объект RealSubject создается, 1 раз
        adminProxy.request(); // Загружает и отображает RealSubject
        adminProxy.request(); // Отображает уже загруженное RealSubject
    }
}
