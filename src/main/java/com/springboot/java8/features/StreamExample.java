package com.springboot.java8.features;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class StreamExample {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        List<String> filtered = names.stream()
                .filter(n -> n.length() <= 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filtered); // [BOB]
    }
}
