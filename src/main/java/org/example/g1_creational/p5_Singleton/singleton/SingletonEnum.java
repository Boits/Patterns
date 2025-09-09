package org.example.g1_creational.p5_Singleton.singleton;

/**
 * Этот метод является самым безопасным и рекомендованным для большинства случаев.
 * enum в Java гарантирует, что будет только один экземпляр.
 */
public enum SingletonEnum {
    INSTANCE;

    // Добавьте методы и поля, если нужно

    public void someMethod() {
        System.out.println("Реализация в SingletonEnum");
    }
}
