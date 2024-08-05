package com.springboot.core.advance;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class OpenNotePad {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        try{
            runtime.exec("notepad");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
