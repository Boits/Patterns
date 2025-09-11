package org.example.g1_creational.p4_Abstract_Factory.real_way2.database;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database.");
    }
}
