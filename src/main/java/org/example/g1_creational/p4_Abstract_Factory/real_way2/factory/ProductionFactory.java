package org.example.g1_creational.p4_Abstract_Factory.real_way2.factory;

import org.example.g1_creational.p4_Abstract_Factory.real_way2.database.Database;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.database.PostgresDatabase;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.service.ProductService;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.service.Service;

public class ProductionFactory implements AppFactory {
    @Override
    public Database createDatabase() {
        return new PostgresDatabase();
    }

    @Override
    public Service createService() {
        return new ProductService();
    }
}
