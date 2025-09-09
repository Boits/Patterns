package org.example.g3_behavioral.p8_Iterator;

import java.util.ArrayList;
import java.util.List;

public class LibraryCollection implements Collection<Book> {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new LibraryIterator(books);
    }
}

