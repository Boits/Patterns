package org.example.g1_creational.p4_Abstract_Factory;

import org.example.g1_creational.p4_Abstract_Factory.way1.factory.ClassicFurnitureFactory;
import org.example.g1_creational.p4_Abstract_Factory.way1.Client;
import org.example.g1_creational.p4_Abstract_Factory.way1.factory.FurnitureAbstractFactory;
import org.example.g1_creational.p4_Abstract_Factory.way1.factory.ModernFurnitureFactory;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.App;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.factory.AppFactory;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.factory.DevelopmentFactory;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.factory.ProductionFactory;

public class AbstractFactoryApp {

    public static void call() {
        way1();
//        realWay2();
    }

    private static void realWay2() {
        AppFactory factory;

        String environment = "development"; // Это значение может быть получено программно

        if (environment.equals("development")) {
            factory = new DevelopmentFactory();
        } else {
            factory = new ProductionFactory();
        }

        App app = new App(factory);
        app.start();
    }

    private static void way1() {

        FurnitureAbstractFactory factory;

        // Выбор фабрики на основе какого-либо условия (например, типа стиля)
        String style = "classic"; // Или "modern"

        if (style.equals("modern")) {
            factory = new ModernFurnitureFactory();
        } else {
            factory = new ClassicFurnitureFactory();
        }

        // Создание клиента и использование мебели
        Client client = new Client(factory);
        client.useFurniture();
    }
}
