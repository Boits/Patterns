package org.example.g1_creational.p5_Singleton.singleton;

public final class SingletonLazy2 {
    private static volatile SingletonLazy2 instance;
    // Используем volatile для правильной синхронизации между потоками

    private SingletonLazy2() {
        // Приватный конструктор предотвращает создание экземпляров вне класса
    }

    public static SingletonLazy2 getInstance() {
        if (instance == null) { // Первая проверка (без синхронизации)
            synchronized (SingletonLazy2.class) {
                if (instance == null) { // Вторая проверка (с синхронизацией)
                    instance = new SingletonLazy2();
                }
            }
        }
        return instance;
    }

    public void someMethod() {
        System.out.println("Реализация в SingletonLazy2");
    }
}
