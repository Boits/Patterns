package org.example.g1_creational.p3_Prototype;

public class PrototypeApp {

    public static void call() {
        // Создаем оригинальные объекты
        Rectangle rectangle = new Rectangle(10, 20, new Point(1, 1));
        Circle circle = new Circle(15, new Point(5, 5));

        // Поверхностно клонируем объекты
        Rectangle clonedRectangle = rectangle.shallowCopy();
        Circle clonedCircle = circle.shallowCopy();

        // Изменяем параметры клонированных объектов
        clonedRectangle.setWidth(30);
        clonedRectangle.setHeight(40);
        clonedCircle.setRadius(25);

        // Выводим информацию о клонированных объектах
        System.out.println("========= Original objects:");
        rectangle.draw();  // Drawing a rectangle of width: 10 and height: 20
        circle.draw();     // Drawing a circle with radius: 15

        System.out.println("========= Shallow cloned objects:");
        clonedRectangle.draw();  // Drawing a rectangle of width: 30 and height: 40
        clonedCircle.draw();     // Drawing a circle with radius: 25

        // Клонируем объекты с глубоким копированием
        Rectangle deepClonedRectangle = rectangle.deepCopy();
        Circle deepClonedCircle = circle.deepCopy();

        // Изменяем параметры клонированных объектов
        deepClonedRectangle.getTopLeft().setX(10);
        deepClonedRectangle.getTopLeft().setY(20);
        deepClonedRectangle.setWidth(33);
        deepClonedRectangle.setHeight(44);

        deepClonedCircle.getCenter().setX(50);
        deepClonedCircle.getCenter().setY(50);
        deepClonedCircle.setRadius(26);

        System.out.println("========= Deep cloned objects:");
        deepClonedRectangle.draw();  // Drawing a rectangle at point Point(x=10, y=20) with width: 33 and height: 44
        deepClonedCircle.draw();     // Drawing a circle at center Point(x=50, y=50) with radius: 26

        // Выводим информацию о клонированных объектах
        System.out.println("========= Original objects:");
        rectangle.draw();  // Drawing a rectangle of width: 10 and height: 20
        circle.draw();     // Drawing a circle with radius: 15
    }
}
