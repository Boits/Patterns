package org.example.g3_behavioral.p8_Iterator;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class LibraryIterator implements Iterator<Book> {

    private final List<Book> books;
    private int currentIndex = 0;

    @Override
    public boolean hasNext() {
        return currentIndex < books.size();
    }

    @Override
    public Book next() {
        return books.get(currentIndex++);
    }
}
