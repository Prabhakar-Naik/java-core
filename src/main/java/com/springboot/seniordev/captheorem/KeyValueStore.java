package com.springboot.seniordev.captheorem;

import java.util.Optional;

interface KeyValueStore {
    void put(String key, String value);
    Optional<String> get(String key);
}

