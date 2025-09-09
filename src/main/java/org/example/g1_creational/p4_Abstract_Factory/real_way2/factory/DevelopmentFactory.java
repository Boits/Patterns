package org.example.g1_creational.p4_Abstract_Factory.real_way2.factory;

import org.example.g1_creational.p4_Abstract_Factory.real_way2.database.Database;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.database.MySQLDatabase;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.service.Service;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.service.DevelopService;

public class DevelopmentFactory implements AppFactory {
    @Override
    public Database createDatabase() {
        return new MySQLDatabase();
    }

    @Override
    public Service createService() {
        return new DevelopService();
    }
}
