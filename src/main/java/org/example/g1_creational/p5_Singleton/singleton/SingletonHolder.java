package org.example.g1_creational.p5_Singleton.singleton;

/**
 * Инициализация при загрузке класса (Initialization-on-demand holder idiom)
 * <p>
 * Этот подход использует вложенный статический класс для ленивой инициализации.
 * Это потокобезопасно и не требует явной синхронизации.
 */
public final class SingletonHolder {
    private SingletonHolder() {
        // Приватный конструктор предотвращает создание экземпляров вне класса
    }

    private static class Holder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return Holder.INSTANCE;
    }

    public void someMethod() {
        System.out.println("Реализация в SingletonHolder");
    }
}
