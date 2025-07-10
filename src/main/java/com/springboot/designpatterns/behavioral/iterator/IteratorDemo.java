package com.springboot.designpatterns.behavioral.iterator;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class IteratorDemo {

    public static void main(String[] args) {
        System.out.println("""
                Concept: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
                Example: Iterating over a custom collection (e.g., a BookShelf).
                """);
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("Design Patterns"));
        bookShelf.addBook(new Book("Clean Code"));
        bookShelf.addBook(new Book("Effective Java"));

        Iterator<Book> it = bookShelf.createIterator();

        while (it.hasNext()) {
            Book book = it.next();
            System.out.println("Book Title: " + book.getTitle());
        }
    }
}
