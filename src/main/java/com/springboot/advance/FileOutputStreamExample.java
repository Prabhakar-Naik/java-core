package com.springboot.advance;

import java.io.FileOutputStream;

/**
 * @author prabhakar, @Date 16-08-2024
 */
public class FileOutputStreamExample {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\MyProjects\\java-core\\text\\testout.txt");
            fout.write(65);
            fout.write(("\nHello Developers").getBytes());
            fout.close();
            System.out.println("success.. by prabhakar.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
