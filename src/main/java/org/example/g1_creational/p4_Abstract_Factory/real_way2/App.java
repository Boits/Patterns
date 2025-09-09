package org.example.g1_creational.p4_Abstract_Factory.real_way2;

import org.example.g1_creational.p4_Abstract_Factory.real_way2.database.Database;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.factory.AppFactory;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.service.Service;

public class App {
    private final Database database;
    private final Service service;

    public App(AppFactory factory) {
        database = factory.createDatabase();
        service = factory.createService();
    }

    public void start() {
        database.connect();
        service.performService();
    }
}
