package com.springboot.designpatterns.behavioral.visitor;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Element 1
public class Book implements ItemElement{
    private int price;
    private String isbnNumber;

    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public void accept(ShoppingCartVisitor visitor) {
        visitor.visit(this);
    }
}
