package org.example.g3_behavioral.p8_Iterator;

/**
 * Aggregate - интерфейс для создания итератора
 */
public interface Collection<T> {
    Iterator<T> createIterator();
}

