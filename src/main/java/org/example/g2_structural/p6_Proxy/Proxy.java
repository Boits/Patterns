package org.example.g2_structural.p6_Proxy;

public class Proxy implements Subject {
    private RealSubject realSubject; // Ссылка на реальный объект
    private final String userRole;

    public Proxy(String userRole) {
        this.userRole = userRole;
        System.out.println("Создание прокси объекта с ролью: " + userRole);
    }

    @Override
    public void request() {
        if (userRole.equals("ADMIN")) {
            if (realSubject == null) {
                realSubject = new RealSubject(); // Ленивое создание реального объекта
            }
            realSubject.request();
        } else {
            System.out.println("Access denied.");
        }
    }
}
