package com.springboot.coding_lyf;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author prabhakar, @Date 12-11-2025
 */

public class StreamsHere {

    public static void main(String[] args) {

        //Java Streams & Functional Programming

        List<String> names = List.of("alex","bob","carol");
        Map<Character, Long> counts = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));

    }
}
