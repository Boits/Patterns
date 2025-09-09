package org.example.g3_behavioral.p5_Memento;

import java.util.Stack;

/**
 * Caretaker (Хранитель) — объект, который управляет снимками,
 * сохраняя их и предоставляя доступ к ним для восстановления.
 */
public class Caretaker {
    private final Stack<Memento> mementos = new Stack<>(); //LIFO

    // Сохранение снимка
    public void addMemento(Memento memento) {
        mementos.push(memento);
    }

    // Восстановление последнего снимка
    public Memento undo() {
        if (!mementos.isEmpty()) {
            return mementos.pop(); //Удаляет и возращает последний
        }
        return null;
    }
}