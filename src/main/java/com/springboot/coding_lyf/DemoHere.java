package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class DemoHere {

    DemoHere(){
        this(20);
    }

    DemoHere(int a){
        System.out.println("x: "+a);
    }

    public static void main(String[] args) {
        new DemoHere();
    }
}
