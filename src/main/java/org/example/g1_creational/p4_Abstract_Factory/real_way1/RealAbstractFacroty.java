//package org.example.g1_creational.p4_Abstract_Factory.real;
//
//// Интерфейс для базы данных
//public interface Database {
//    void connect();
//}
//
//// Конкретные реализации
//public class MySQLDatabase implements Database {
//    @Override
//    public void connect() {
//        System.out.println("Connected to MySQL Database.");
//    }
//}
//
//public class PostgresDatabase implements Database {
//    @Override
//    public void connect() {
//        System.out.println("Connected to Postgres Database.");
//    }
//}
//
//// Интерфейс для сервиса
//public interface Service {
//    void performService();
//}
//
//// Конкретные реализации
//public class UserService implements Service {
//    @Override
//    public void performService() {
//        System.out.println("Performing user service.");
//    }
//}
//
//public class ProductService implements Service {
//    @Override
//    public void performService() {
//        System.out.println("Performing product service.");
//    }
//}
//
//// Абстрактная фабрика
//public interface AppFactory {
//    Database createDatabase();
//    Service createService();
//}
//
//// Конкретные фабрики
//public class DevelopmentFactory implements AppFactory {
//    @Override
//    public Database createDatabase() {
//        return new MySQLDatabase();
//    }
//
//    @Override
//    public Service createService() {
//        return new UserService();
//    }
//}
//
//public class ProductionFactory implements AppFactory {
//    @Override
//    public Database createDatabase() {
//        return new PostgresDatabase();
//    }
//
//    @Override
//    public Service createService() {
//        return new ProductService();
//    }
//}
//
//// Использование
//public class App {
//    private Database database;
//    private Service service;
//
//    public App(AppFactory factory) {
//        database = factory.createDatabase();
//        service = factory.createService();
//    }
//
//    public void start() {
//        database.connect();
//        service.performService();
//    }
//}
//
//// В точке входа программы
//public class RealAbstractFactory {
//    public static void main(String[] args) {
//        AppFactory factory;
//
//        String environment = "development"; // Это значение может быть получено программно
//
//        if (environment.equals("development")) {
//            factory = new DevelopmentFactory();
//        } else {
//            factory = new ProductionFactory();
//        }
//
//        App app = new App(factory);
//        app.start();
//    }
//}
