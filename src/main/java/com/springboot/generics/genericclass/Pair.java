package com.springboot.generics.genericclass;

/**
 * @author prabhakar, @Date 31-12-2024
 */
//This class can be used to store pairs of related data (like key-value pairs).
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    //Here, the Pair<K, V> class has two type parameters K and V, and you can specify the types
    // when you create an instance of Pair.
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println("Key: " + pair.getKey());   // Prints: Key: Age
        System.out.println("Value: " + pair.getValue()); // Prints: Value: 30
    }


}