package com.springboot.generics;

/**
 * @author prabhakar, @Date 31-12-2024
 */

interface Printable{

    void print();
}

class MyNumber extends Number implements Printable{

    private final int value;

    MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("MyNumber: "+value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class Box<T extends Number & Printable>{

    private T item;

    // Generic Constructor
    public Box(T item){
        this.item = item;
    }

    public void display(){
        item.print();
    }

    public T getItem(){
        return item;
    }

}
public class Testing {

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(12);
        Box<MyNumber> box = new Box<>(myNumber);
        box.display();
        myNumber.print();
        System.out.println(myNumber.doubleValue());


    }
}
