package org.example.g2_structural.p5_Flyweight;

public class FlyweightApp {

    public static void call() {
        // Создаем несколько книг с общими свойствами через фабрику
        Shelf book1 = new Shelf("Shelf 1", 1,
                BookFactory.getBook("Design Patterns", "Erich Gamma", "Addison-Wesley"));
        Shelf book2 = new Shelf("Shelf 1", 2,
                BookFactory.getBook("Design Patterns", "Erich Gamma", "Addison-Wesley"));
        Shelf book3 = new Shelf("Shelf 2", 3,
                BookFactory.getBook("Design Patterns", "Erich Gamma", "Addison-Wesley"));
        Shelf book4 = new Shelf("Shelf 3", 1,
                BookFactory.getBook("Clean Code", "Robert Martin", "Prentice Hall"));

        // Отображаем информацию о книгах на полках
        book1.display();
        book2.display();
        book3.display();
        book4.display();

        System.out.println("Total shared book instances: " + BookFactory.totalBooks()); //2
    }
}
