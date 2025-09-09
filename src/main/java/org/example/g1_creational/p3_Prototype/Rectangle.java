package org.example.g1_creational.p3_Prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Конкретная реализация класса Rectangle (Прямоугольник)
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class Rectangle extends ShapePrototype<Rectangle> {

    private int width;
    private int height;
    private Point topLeft;

    @Override
    public Rectangle deepCopy() {
        // Глубокое копирование всех объектов, включая вложенные объекты
        return new Rectangle(this.width, this.height, topLeft.deepCopy());
    }

    public void draw() {
        System.out.println("Drawing a rectangle at point " + topLeft +
                " with width: " + width +
                " and height: " + height);
    }
}
