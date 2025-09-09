package org.example.g3_behavioral.p5_Memento;

public class MementoApp {

    public static void call() {
        TextEditor object = new TextEditor("Initial Text");
        Caretaker caretaker = new Caretaker();

        System.out.println("Text: " + object.getText()); //Text: Initial Text

        // Сохраняем начальное состояние
        caretaker.addMemento(object.create());

        // Изменяем текст
        object.setText("First change");
        System.out.println("Text after first change: " + object.getText()); //Text after first change: First change

        // Сохраняем текущее состояние
        caretaker.addMemento(object.create());

        // Еще одно изменение
        object.setText("Second change");
        System.out.println("Text after second change: " + object.getText()); //Text after second change: Second change

        // Восстановление к первому состоянию
        object.restore(caretaker.undo());
        System.out.println("Text after undo: " + object.getText()); //Text after undo: First change

        // Восстановление к начальному состоянию
        object.restore(caretaker.undo());
        System.out.println("Text after undo: " + object.getText()); //Text after undo: Initial Text

    }
}
