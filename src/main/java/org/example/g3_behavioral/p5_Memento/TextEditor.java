package org.example.g3_behavioral.p5_Memento;

/**
 * Originator (Создатель) —
 * объект, который может создавать снимки своего состояния
 * и восстанавливать его из снимков.
 */
public class TextEditor {
    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Создание снимка состояния
    public Memento create() {
        return new Memento(this.text);
    }

    // Восстановление состояния
    public void restore(Memento memento) {
        this.text = memento.getState();
    }
}

