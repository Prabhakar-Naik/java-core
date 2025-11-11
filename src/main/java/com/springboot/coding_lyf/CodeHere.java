package com.springboot.coding_lyf;

/**
 * @author prabhakar, @Date 11-11-2025
 */

public class CodeHere {
    int x;

    public CodeHere(int x) {
        x = x;
    }

    public void display() {
        System.out.println("x: "+x);
    }

    public static void main(String[] args) {
        CodeHere codeHere = new CodeHere(5);
        codeHere.display();
    }
}
