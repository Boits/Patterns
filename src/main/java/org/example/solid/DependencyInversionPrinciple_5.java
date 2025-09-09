package org.example.solid;

import lombok.RequiredArgsConstructor;

public class DependencyInversionPrinciple_5 {
}

/**
 * Нарушение DIP:
 */
class Database1 {
    public void save() { /* сохраняет данные в базу */ }
    public void connectToMySQL() {} //Нарушение 2)
}

class UserService1 {
    private Database1 database = new Database1();
    public void saveUser() {
        database.save(); // Прямая зависимость от класса Database
        //Нарушение 1)
    }
}

/**
 * Решение DIP:
 */

interface Storage2 {
    void save();
}

class Database2 implements Storage2 {
    public void save() { /* сохраняет данные в базу */ }
}

@RequiredArgsConstructor
class UserService_2 {
    private final Storage2 storage;

    public void saveUser() {
        storage.save();
    }
}
