package org.example.g3_behavioral.p4_Observer.observer;

/**
 * Наблюдатель (Observer)
 * Объект, который подписывается на изменения субъекта и реагирует на них.
 */
public interface Observer {
    void update(String message);
}
