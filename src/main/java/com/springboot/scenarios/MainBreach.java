package com.springboot.scenarios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * @author prabhakar, @Date 18-06-2025
 */

public class MainBreach {

    public static void main(String[] args) {

        Person person1 = new Person(1,"prabhakar",27, LocalDate.now());
        Person person2 = new Person(2,"kiran",34, LocalDate.now());
        Person person3 = new Person(3,"suresh",35,LocalDate.now());
        Person person4 = new Person(4,"naresh",36, LocalDate.now());
        Person person5 = new Person(5, "praveen",30, LocalDate.now());
        Person person6 = new Person(6,"mustak",45,LocalDate.now());
        Person person7 = new Person(7,"anil",33,LocalDate.now());

        Person iam  = new Person(10,"Nawaz",29,LocalDate.now());
        List<Person> friends = List.of(person1, person2, person3, person4, person5, person6, person7);
        iam.setFriends(friends);
        System.out.println(iam);

        Person person8 = new Person(1,"prabhakar",27, LocalDate.now());
        Person person9 = new Person(2,"kiran",34, LocalDate.now());
        Person person10 = new Person(3,"charan",35,LocalDate.now());
        Person person11 = new Person(4,"naresh",36, LocalDate.now());
        Person person12 = new Person(5, "pavan",30, LocalDate.now());
        Person person13 = new Person(6,"mustak",45,LocalDate.now());
        Person person14 = new Person(10,"Nawaz",29,LocalDate.now());

        List<Person> suggestFriends = List.of(person8, person9, person10, person11, person12, person13,person14);

        List<Person> suggest = iam.suggestFriends(suggestFriends);
        System.out.println(suggest);

    }
}
