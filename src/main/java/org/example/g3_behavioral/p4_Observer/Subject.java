package org.example.g3_behavioral.p4_Observer;

import org.example.g3_behavioral.p4_Observer.observer.Observer;

/**
 * Субъект (Subject)
 * Объект, за которым наблюдают.
 * Он хранит список наблюдателей и уведомляет их об изменениях.
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
