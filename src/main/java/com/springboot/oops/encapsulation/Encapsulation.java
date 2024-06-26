package com.springboot.oops.encapsulation;

/**
 * @author prabhakar, @Date 24-06-2024
 */
public class Encapsulation {

    // It contains related variables and methods
    int id;
    String name;
    double price;

    Encapsulation() {
        super();
    }

    public Encapsulation(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Abstraction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
