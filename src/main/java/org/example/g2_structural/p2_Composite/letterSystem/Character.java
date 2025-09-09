package org.example.g2_structural.p2_Composite.letterSystem;

import lombok.RequiredArgsConstructor;

/**
 * 1 символ/буква.
 * Лист.(Leaf)
 */
@RequiredArgsConstructor
public class Character extends TextComponent {

    private final char character;

    @Override
    protected void printThisBefore() {
        System.out.print(character);
    }
}
