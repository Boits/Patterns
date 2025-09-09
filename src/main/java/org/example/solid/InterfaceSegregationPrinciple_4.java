package org.example.solid;

public class InterfaceSegregationPrinciple_4 {
}

/**
 * Нарушение ISP:
 */
interface Worker1 {
    void work();

    void eat();
}

class Robot1 implements Worker1 {
    public void work() { /* работает */ }

    public void eat() { /* нарушение, роботы не едят */ }
}

/**
 * Решение ISP:
 */
interface Workable2 {
    void work();
}

interface Eatable2 {
    void eat();
}

class Robot2 implements Workable2 {
    public void work() { /* работает */ }
}