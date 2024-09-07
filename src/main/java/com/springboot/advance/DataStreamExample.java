package com.springboot.advance;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author prabhakar, @Date 16-08-2024
 */
public class DataStreamExample {

    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("C:\\MyProjects\\java-core\\text\\testout.txt");
            byte[] i = fin.readAllBytes();
            System.out.print(Arrays.toString(i));
            fin.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
