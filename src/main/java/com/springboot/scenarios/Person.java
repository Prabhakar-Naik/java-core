package com.springboot.scenarios;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author prabhakar, @Date 18-06-2025
 */

public class Person {
    private int id;
    private String name;
    private int age;
    private LocalDate birthday;
    private List<Person> friends = new ArrayList<>();

    public Person() {

    }

    public Person(int id, String name, int age, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public List<Person> getFriends() {
        return friends;
    }
    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + birthday+" "+friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person that = (Person) o;
        return this.id == that.id
                && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

// my code
    public List<Person> suggestFriends(List<Person> friendsList) {
        List<String> names = this.friends.stream()
                .map(Person::getName).toList();
        List<Person> suggestedFriends = friendsList.stream().filter(
                person -> !names.contains(person.getName())).toList();
        return suggestedFriends;
    }

    // gpt
//    public List<Person> suggestFriends(List<Person> candidates) {
//        Set<String> friendNames = this.friends.stream()
//                .map(Person::getName)
//                .collect(Collectors.toSet());
//
//        return candidates.stream()
//                .filter(p -> !p.equals(this))                       // not yourself
//                .filter(p -> !friendNames.contains(p.getName()))     // name not already a friend
//                .distinct()                                          // remove exact dupes
//                .collect(Collectors.toList());
//    }


}
