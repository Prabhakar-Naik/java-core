package com.springboot.core.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author prabhakar, @Date 16-06-2025
 */

public class SortPerson {

    private static void swap(Person[] arr, int i, int j) {
        Person temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        Person[] persons = new Person[10];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
        persons[4] = new Person();
        persons[5] = new Person();
        persons[6] = new Person();
        persons[7] = new Person();
        persons[8] = new Person();
        persons[9] = new Person();
//        persons[10] = new Person();  // I O B Exception

        System.out.println(persons.length);
        persons[0].setName("prabha");
        persons[0].setAge(26);
        System.out.println(persons[0]);
        persons[1].setName("rebba");
        persons[1].setAge(27);
        System.out.println(persons[1]);
        persons[2].setName("tinku");
        persons[2].setAge(29);
        System.out.println(persons[2]);
        persons[3].setName("kiran");
        persons[3].setAge(10);
        System.out.println(persons[3]);
        persons[4].setName("chandra");
        persons[4].setAge(42);
        System.out.println(persons[4]);
        persons[5].setName("suman");
        persons[5].setAge(32);
        System.out.println(persons[5]);
        persons[6].setName("kali");
        persons[6].setAge(18);
        System.out.println(persons[6]);
        persons[7].setName("jyothi");
        persons[7].setAge(20);
        System.out.println(persons[7]);
        persons[8].setName("arun");
        persons[8].setAge(15);
        System.out.println(persons[8]);
        persons[9].setName("charan");
        persons[9].setAge(40);
        System.out.println(persons[9]);


        int size = persons.length;
        int targetYoungestCount = 5;

        int actualYoungestCount = Math.min(targetYoungestCount, size);

        for (int i = 0; i < actualYoungestCount; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                // Ensure we don't compare null elements if the array is not fully filled
                if (persons[j] != null && persons[minIndex] != null) {
                    if (persons[j].getAge() < persons[minIndex].getAge()) {
                        minIndex = j;
                    }
                } else if (persons[j] != null && persons[minIndex] == null) {
                    // If current minIndex points to null, and j is not null, then j is better
                    minIndex = j;
                }
                // If both are null, or j is null, minIndex remains the same
            }

            // Swap the found minimum element with the element at current position i
            if (minIndex != i) {
                swap(persons, i, minIndex);
            }
        }

        System.out.println("5 Younger Persons (or all if less than 5, sorted by age manually):");
        for (int i = 0; i < actualYoungestCount; i++) {
            if (persons[i] != null) { // Defensive check
                System.out.println(persons[i]);
            }
        }



        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        // Alternatively, using a lambda expression (more concise in Java 8+)
        // Arrays.sort(persons, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));


        System.out.println("5 Younger Persons (or all if less than 5):");
        int count = 0;
        for (Person person : persons) {
            if (count < 5 && person != null) { // Check for null in case array is not fully filled
                System.out.println(person);
                count++;
            } else if (count >= 5) {
                break; // We have found our 5 youngest
            }
        }



        System.out.println("Some Collection Way");

        List<Person> list  = new ArrayList<>(List.of(persons));

        list.sort(Comparator.comparing(Person::getAge));
        System.out.println(list);

        list.stream().limit(5).forEach(System.out::println);

        list.sort(Comparator.comparing(Person::getName));
        System.out.println(list);
        list.stream().limit(5).forEach(System.out::println);
    }
}
