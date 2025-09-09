package org.example.g3_behavioral.p4_Observer.observer;

/**
 * Конкретный наблюдатель (Concrete Observer)
 * Объект, который получает обновления от субъекта
 * и выполняет конкретные действия на основе этих обновлений.
 */
public class MobileApp implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Mobile App received promotion: " + message);
    }
}
