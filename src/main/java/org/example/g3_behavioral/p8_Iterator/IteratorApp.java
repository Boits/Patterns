package org.example.g3_behavioral.p8_Iterator;

public class IteratorApp {

    public static void call() {
        LibraryCollection library = new LibraryCollection();
        library.addBook(new Book("1984"));
        library.addBook(new Book("Brave New World"));
        library.addBook(new Book("Fahrenheit 451"));

        // Используем итератор для перебора книг
        Iterator<Book> iterator = library.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book title: " + book.title());
        }
    }
}
