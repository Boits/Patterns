package org.example.g1_creational.p2_Factory_Method.real_way2;

public class PostgreSQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }
}
