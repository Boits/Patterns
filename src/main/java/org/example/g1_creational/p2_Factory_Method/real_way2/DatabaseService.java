package org.example.g1_creational.p2_Factory_Method.real_way2;

public class DatabaseService {
    private final Database database;

    public DatabaseService(String dbType) {
        this.database = DatabaseFactory.createDatabase(dbType);
    }

    public void connectToDatabase() {
        database.connect();
    }
}
