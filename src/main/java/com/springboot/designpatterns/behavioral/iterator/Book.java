package com.springboot.designpatterns.behavioral.iterator;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// Usage
// public class IteratorDemo {
//     public static void main(String[] args) {
//         BookShelf bookShelf = new BookShelf();
//         bookShelf.addBook(new Book("Design Patterns"));
//         bookShelf.addBook(new Book("Clean Code"));
//         bookShelf.addBook(new Book("Effective Java"));
//
//         Iterator<Book> it = bookShelf.createIterator();
//
//         while (it.hasNext()) {
//             Book book = it.next();
//             System.out.println("Book Title: " + book.getTitle());
//         }
//     }
// }
