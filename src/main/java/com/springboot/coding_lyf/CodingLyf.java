package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

class Parent{
    int x = 50;
}

class Child extends Parent{
    int x = 40;
}

public class CodingLyf {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.x); // 50 bcz strict to parent object

        Child c = new Child();
        System.out.println(c.x); // 40 bcz strict to child object

        Parent p2 = new Child();
        System.out.println(p2.x); // 50 bcz reference parent
    }
}
