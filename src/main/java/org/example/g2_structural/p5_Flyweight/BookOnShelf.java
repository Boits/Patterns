package org.example.g2_structural.p5_Flyweight;

import lombok.RequiredArgsConstructor;

/**
 * Класс BookOnShelf (полка) представляет конкретный экземпляр книги на полке.
 * Хранит внешнее состояние.
 */
@RequiredArgsConstructor
public class BookOnShelf {

    private final String shelfNumber;                   // Номер полки
    private final int position;                         // Место на полке
    private final BookFlyweight book;                   // Общие свойства книги (flyweight)

    public void display() {
        book.display(shelfNumber, position); // Отображаем информацию о книге и её месте на полке
    }
}
