package org.example.g1_creational.p5_Singleton;

import org.example.g1_creational.p5_Singleton.singleton.*;

public class SingletonApp {

    public static void call() {
        SingletonEager singletonEager = SingletonEager.getInstance();
        singletonEager.someMethod();

        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.someMethod();

        SingletonHolder singletonHolder = SingletonHolder.getInstance();
        singletonHolder.someMethod();

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        singletonLazy.someMethod();

        SingletonLazy2 singletonLazy2 = SingletonLazy2.getInstance();
        singletonLazy2.someMethod();
    }
}
