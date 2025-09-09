package org.example.g1_creational.p5_Singleton.singleton;

/**
 * Этот подход откладывает создание экземпляра до первого запроса.
 * Он потокобезопасный.
 * Это снижает производительность в многопоточных средах,
 * так как каждый вызов будет ждать завершения работы метода в других потоках.
 */
public final class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        // Приватный конструктор предотвращает создание экземпляров вне класса
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void someMethod() {
        System.out.println("Реализация в SingletonLazy");
    }
}
