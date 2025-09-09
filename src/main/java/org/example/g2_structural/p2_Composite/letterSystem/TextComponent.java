package org.example.g2_structural.p2_Composite.letterSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Базовый интерфейс или абстрактный класс.
 */
public abstract class TextComponent {
    private final List<TextComponent> components = new ArrayList<>();

    public void add(TextComponent component) {
        components.add(component);
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    /**
     * Print.
     */
    public void print() {
        printThisBefore();
        components.forEach(TextComponent::print);
        printThisAfter();
    }
}
