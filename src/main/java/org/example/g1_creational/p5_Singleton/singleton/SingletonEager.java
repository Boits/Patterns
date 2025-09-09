package org.example.g1_creational.p5_Singleton.singleton;

//Eager - жаждующий

/**
 * Экземпляр создается сразу при загрузке класса.
 * Этот метод гарантирует потокобезопасность и простоту,
 * но может быть неэффективным, если экземпляр создается, даже если он не используется.
 */
public final class SingletonEager {
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
        // Приватный конструктор предотвращает создание экземпляров вне класса
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    public void someMethod() {
        System.out.println("Реализация в SingletonEager");
    }
}
