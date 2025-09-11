package org.example.solid;

import lombok.RequiredArgsConstructor;

public class DependencyInversionPrinciple_5 {
}

/**
 * Нарушение DIP:
 */
class Database1 {
    public void save() { /* сохраняет данные в БД */ }
    public void connectToMySQL() {} //Нарушение!
}

class UserService1 {
    private Database1 database = new Database1();
    public void saveUser() {
        database.save();
        // Прямая зависимость от класса Database (от деталей) - Нарушение!
    }
}

/**
 * Решение DIP:
 */

interface Storage {
    void save();
    void connect();
}

class MySQLDatabase implements Storage {
    public void save() { /* сохраняет данные в БД */ }
    public void connect() {}
}

@RequiredArgsConstructor
class UserService_2 {
    private final Storage storage;

    public void saveUser() {
        storage.connect();
        storage.save();
    }
}
