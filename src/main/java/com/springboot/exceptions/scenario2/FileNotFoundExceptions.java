package com.springboot.exceptions.scenario2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author prabhakar, @Date 26-12-2024
 */
public class FileNotFoundExceptions {

    public static void main(String[] args) throws IOException {

        try {
            FileReader fileReader = new FileReader("Exceptions.java");
            int add = fileReader.read();
        }catch (ArithmeticException | FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Finally Block");
            divide(1,0);
        }

        reader();

    }

    public static void reader(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("examplt.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("IOException caught: "+e.getMessage());
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }
            }catch (IOException e){
                System.out.println("Error closing reader: "+e.getMessage());
            }
        }
    }

    public static int divide(int a, int b){
        try {
            return a/b;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }finally {
            System.out.println("Bye");
        }
    }
}
