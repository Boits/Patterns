package org.example.g2_structural.p2_Composite.letterSystem;

import java.util.List;

/**
 * 1 предложение - состоит из слов.
 * Составной компонент.(Composite)
 */
public class Sentence extends TextComponent {

    public Sentence(List<Word> words) {
        words.forEach(this::add);
    }

    @Override
    protected void printThisAfter() {
        System.out.print(".\n");
    }

}