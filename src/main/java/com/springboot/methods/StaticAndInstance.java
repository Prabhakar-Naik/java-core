package com.springboot.methods;

/**
 * @author prabhakar, @Date 01-08-2024
 */
public class StaticAndInstance {

    public static void main(String[] args) {
        display();  //calling without object

        StaticAndInstance t = new StaticAndInstance();
        t.show();  //calling using object
    }
    static void display() {
        System.out.println("Programming is amazing.");
    }
    void show(){
        System.out.println("Java is awesome.");
    }
}
