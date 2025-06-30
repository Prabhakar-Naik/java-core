package com.springboot.java8.features;

import java.util.Optional;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> maybe = Optional.ofNullable(getName());
        System.out.println(maybe.orElse("Unknown"));
    }

    static String getName() {
        return null;
    }
}
