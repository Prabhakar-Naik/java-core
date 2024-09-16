package com.springboot.core.datatypes;

/**
 * @author prabhakar, @Date 13-09-2024
 */
public class CharProgram {

    public static void main(String[] args) {

        // Store single value type data type
        char a=10,b=20,c=30;
        System.out.println(" Store single value type data type  "+a+" "+b+" "+c);

        //store multiple values type same data type
        //Array creation
        char arr[];

        //Array declaration
        arr=new char[5];

        //Array initialization
        //Arrays are index based starts from 0(zero)
        arr[0]='A';
        arr[1]='Z';
        arr[2]='X';
        arr[3]='e';
        arr[4]='j';

        //Array Access using indexes...
        System.out.println("Approach 1 for printing: ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("Approach 2 for printing using for loop: ");

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

        System.out.println("Approach 3 for printing using forEach loop: ");
        for(int ar:arr)
            System.out.println(ar);

        System.out.println("Appraoch 4 for printing using while loop: ");
        int i=0;
        while(i<arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }
        System.out.println("Approach 5 for printing using do while loop: ");
        i=0;
        do {
            System.out.println(arr[i]);
            i++;
        }while(i<arr.length);


    }
}
