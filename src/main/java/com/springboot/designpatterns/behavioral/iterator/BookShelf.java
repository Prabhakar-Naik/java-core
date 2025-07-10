package com.springboot.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Aggregate
public class BookShelf implements Aggregate<Book>{

    private List<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookShelfIterator(this);
    }
}
