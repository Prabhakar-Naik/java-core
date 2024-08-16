package com.springboot.advance;

import java.io.FileInputStream;

/**
 * @author prabhakar, @Date 16-08-2024
 */
public class DataStreamExample {

    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("C:\\MyProjects\\java-core\\text\\testout.txt");
            int i = fin.read();
            System.out.print((char) i);
            fin.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
