package org.example.solid;

public class SingleResponsibilityPrinciple_1 {
}

/**
 * Нарушение SRP:
 */
class UserService {
    public void createUser() { /* создание пользователя */ }

    public void sendEmail() { /* отправка email */ } // Нарушение SRP
}

/**
 * Решение: Лучше разделить на отдельные классы
 */

class UserService2 {
    public void createUser() { /* создание пользователя */ }
}

class EmailService2 {
    public void sendEmail() { /* отправка email */ }
}
