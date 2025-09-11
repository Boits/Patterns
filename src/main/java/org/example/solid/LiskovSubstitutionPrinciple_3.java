package org.example.solid;

public class LiskovSubstitutionPrinciple_3 {
}

/**
 * Нарушение LSP:
 */
class Bird {
    public void fly() {
        System.out.println("The bird is flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}

/**
 * Решение LSP:
 */

interface Flyable {
    void fly();
}

class Bird2 {
    // Основные свойства и методы для всех птиц
}

class Sparrow extends Bird2 implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin2 extends Bird2 {
    // Пингвин не реализует Flyable, потому что он не может летать
}
