package org.example.g2_structural.p5_Flyweight;

import lombok.RequiredArgsConstructor;

/**
 * Класс BookFlyweight представляет общие свойства книги (название, автор, издательство).
 * Хранит внутреннее состояние. (Flyweight)
 */
@RequiredArgsConstructor
public class BookFlyweight {

    private final String title;       // Название книги
    private final String author;      // Автор книги
    private final String publisher;   // Издательство

    public void display(String shelf, int position) {
        System.out.println("Book: " + title + " by " + author + ", published by " + publisher +
                " on shelf " + shelf + " at position " + position);
    }
}

