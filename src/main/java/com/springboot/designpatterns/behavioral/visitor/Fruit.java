package com.springboot.designpatterns.behavioral.visitor;

/**
 * @author prabhakar, @Date 05-07-2025
 */
// Concrete Element 2
public class Fruit implements ItemElement{

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ShoppingCartVisitor visitor) {
        visitor.visit(this);
    }
}
