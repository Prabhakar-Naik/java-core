package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

class Domini{
    public void getAge(){
        System.out.println("I don't know the age");
    }
}

class Riya extends Domini{
    @Override // optional
    public void getAge(){
        System.out.println("just turned 18");
    }
}

public class InheritanceHere {

    public static void main(String[] args) {
        Domini mother = new Domini();
        Riya riya = new Riya();
        mother.getAge();
        riya.getAge();
    }
}
