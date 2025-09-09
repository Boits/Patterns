package org.example.g1_creational.p3_Prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point implements Cloneable {

    private int x;
    private int y;

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    // Метод для глубокого копирования объекта Point
    public Point deepCopy() {
        return new Point(this.x, this.y);
    }
}

