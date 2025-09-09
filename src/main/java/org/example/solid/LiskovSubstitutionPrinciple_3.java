package org.example.solid;

public class LiskovSubstitutionPrinciple_3 {
}

/**
 * Нарушение LSP
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
 * Решение
 */

abstract class Bird2 {
    public abstract void move();
}

class FlyingBird extends Bird2 {
    @Override
    public void move() {
        fly();
    }

    public void fly() {
        System.out.println("The bird is flying");
    }
}

class Penguin2 extends Bird2 {
    @Override
    public void move() {
        swim();
    }

    public void swim() {
        System.out.println("The penguin is swimming");
    }
}
/**
 * Или такое решение:
 */

interface Flyable {
    void fly();
}

class Bird3 {
    // Основные свойства и методы для всех птиц
}

class Sparrow extends Bird3 implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin3 extends Bird3 {
    // Пингвин не реализует Flyable, потому что он не может летать
}
