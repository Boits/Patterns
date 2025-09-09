package org.example.g1_creational.p2_Factory_Method.real_way2;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}