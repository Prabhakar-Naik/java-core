package com.springboot.collections.advancelevel;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author prabhakar, @Date 02-02-2026
 */
// LRU Cache implementation using LinkedHashMap
// Implement LRU cache with get/put O(1).
public class LRUCache<K,V> {
    private final int capacity;
    private final LinkedHashMap<K,V> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public synchronized V get(K key) {
        return map.getOrDefault(key, null);
    }

    public synchronized void put(K key, V value) {
        map.put(key, value);
    }
}

