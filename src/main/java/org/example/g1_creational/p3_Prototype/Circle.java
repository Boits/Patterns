package org.example.g1_creational.p3_Prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Конкретная реализация класса Circle
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class Circle extends ShapePrototype<Circle> {

    private int radius;
    private Point center;

    @Override
    public Circle deepCopy() {
        // Глубокое копирование всех объектов, включая вложенные объекты
        return new Circle(this.radius, center.deepCopy());
    }

    public void draw() {
        System.out.println("Drawing a circle at center " + center + " with radius: " + radius);
    }
}
