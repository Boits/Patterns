package org.example.g1_creational.p3_Prototype;

import lombok.SneakyThrows;

public abstract class ShapePrototype<T> implements Cloneable {

    /**
     * Создает поверхностную копию данного объекта или возвращает null, если объект не реализует Cloneable.
     * Поверхностное копирование (shallow copy)
     */
    @SuppressWarnings("unchecked")
    @SneakyThrows
    public T shallowCopy() {
        return (T) super.clone();
    }

    /**
     * Создает глубокую копию (deep copy) данного объекта.
     */
    public abstract T deepCopy();

    public abstract void draw();
}