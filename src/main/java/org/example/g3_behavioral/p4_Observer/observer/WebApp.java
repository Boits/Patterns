package org.example.g3_behavioral.p4_Observer.observer;

/**
 * Конкретный наблюдатель (Concrete Observer)
 * Объект, который получает обновления от субъекта
 * и выполняет конкретные действия на основе этих обновлений.
 */
public class WebApp implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Web App received promotion: " + message);
    }
}
