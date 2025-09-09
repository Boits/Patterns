package org.example.g2_structural.p5_Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Фабрика Flyweight для управления объектами BookFlyweight.
 * Класс BookFactory управляет созданием объектов BookFlyweight
 * и гарантирует, что одна и та же книга будет
 * использовать один и тот же объект для всех своих экземпляров.
 */
public class BookFactory {
    private static final Map<String, BookFlyweight> BOOK_MAP = new HashMap<>();

    public static BookFlyweight getBook(String title, String author, String publisher) {
        String key = title + "|" + author + "|" + publisher;
        BookFlyweight book = BOOK_MAP.get(key);
        if (book == null) {
            book = new BookFlyweight(title, author, publisher);
            BOOK_MAP.put(key, book);
        }
        return book;
    }

    public static int totalBooks() {
        return BOOK_MAP.size();
    }
}
