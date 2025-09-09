package org.example.g1_creational.p2_Factory_Method.real_way2;

public class DatabaseFactory {

    /**
     * Фабричный метод
     * P.S.: есть нарущение OCP (Open/Closed Principal 2). Лушче сделать абстрактным фабричный методом
     * и вынести создание объектов в отдельные классы.
     */
    public static Database createDatabase(String type) {
        if (type.equalsIgnoreCase("MYSQL")) {
            return new MySQLDatabase();
        } else if (type.equalsIgnoreCase("POSTGRESQL")) {
            return new PostgreSQLDatabase();
        }
        throw new IllegalArgumentException("Unknown database type");
    }
}
