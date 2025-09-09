package org.example.g1_creational.p4_Abstract_Factory.real_way2.factory;

import org.example.g1_creational.p4_Abstract_Factory.real_way2.database.Database;
import org.example.g1_creational.p4_Abstract_Factory.real_way2.service.Service;

public interface AppFactory {
    Database createDatabase();
    Service createService();
}
