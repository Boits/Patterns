package org.example.g3_behavioral.p4_Observer;

import org.example.g3_behavioral.p4_Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Конкретный субъект (Concrete Subject)
 * Объект, который имеет какое-то изменяемое состояние
 * и уведомляет наблюдателей о его изменениях.
 */
public class Store implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String promotion;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(promotion));
    }

    public void newPromotion(String promotion) {
        this.promotion = promotion;
        notifyObservers();
    }
}
