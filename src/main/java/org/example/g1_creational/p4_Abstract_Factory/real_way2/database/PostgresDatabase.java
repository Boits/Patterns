package org.example.g1_creational.p4_Abstract_Factory.real_way2.database;

import org.example.g1_creational.p4_Abstract_Factory.real_way2.database.Database;

public class PostgresDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to Postgres Database.");
    }
}
