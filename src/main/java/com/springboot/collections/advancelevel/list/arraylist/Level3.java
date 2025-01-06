package com.springboot.collections.advancelevel.list.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level3 {

    public static void main(String[] args) {

        // Default constructor, creates an empty ArrayList with an initial capacity 10
        ArrayList<String> arrayList = new ArrayList<>();

        // creating an arraylist with a specified initial capacity
        ArrayList<String> listWithCapacity = new ArrayList<>(20);

        // creating an ArrayList from another collection
        List<String> anotherList = Arrays.asList("Apple","Banana","Carrot","Orange");
        ArrayList<String> listFromCollection = new ArrayList<>(anotherList);

        List<String> list = new ArrayList<>();

        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");

        System.out.println(list1.getClass().getName());

        list1.set(1, "Wednesday");
        System.out.println(list1.get(1));

        String[] array = {"Apple", "Banana", "Cherry"};

        List<String> list2 = Arrays.asList(array);

        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);


        List<Integer> list3 = List.of(1, 2, 3, 4);
        //list3.set(1, 33);

    }
}
