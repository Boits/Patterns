package org.example.g1_creational.p2_Factory_Method;

import org.example.g1_creational.p2_Factory_Method.way1.creator.AbstractTransportCreator;
import org.example.g1_creational.p2_Factory_Method.way1.creator.CarCreator;
import org.example.g1_creational.p2_Factory_Method.way1.creator.ShipCreator;
import org.example.g1_creational.p2_Factory_Method.real_way2.DatabaseService;

public class FactoryMethodApp {

    /**
     * Предоставляет интерфейс для создания объектов некоторого класса,
     * но позволяет подклассам выбирать классы, которые должны быть созданы.
     * То есть данный шаблон делегирует ответственность за
     * создание объектов своим подклассам.
     */

    public static void call() {
//        way1();
        realWay2();
    }

    private static void realWay2() {
        //"MYSQL" or "POSTGRESQL"
        DatabaseService databaseService = new DatabaseService("POSTGRESQL");
        databaseService.connectToDatabase();
    }

    private static void way1() {
        // Используем CarTransport для создания автомобиля
        AbstractTransportCreator carCreator = new CarCreator();
        carCreator.startTransport();  // Output: Driving a car...

        // Используем ShipTransport для создания корабля
        AbstractTransportCreator shipCreator = new ShipCreator();
        shipCreator.startTransport();  // Output: Sailing a ship...
    }
}
