package org.example.g2_structural.p2_Composite.letterSystem;

/**
 * 1 слово - состоит из букв.
 * Составной компонент. (Composite)
 */
public class Word extends TextComponent {

    public Word(char... characters) {
        for (char character : characters) {
            this.add(new Character(character));
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}