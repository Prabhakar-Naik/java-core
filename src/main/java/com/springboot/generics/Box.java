package com.springboot.generics;
/**
 * @author prabhakar, @Date 30-12-2024
 */
public class Box<T> {//  one or more type parameters
    //  These type parameters are placeholders that are replaced with specific types when the class is instantiated.
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    //Here, Box<T> is a generic class. The type parameter T will be replaced with a specific
    // type when an object of Box is created. Now, the Box class is type-safe, and we will not
    // encounter the ClassCastException because the types are enforced at compile time.

    /*
    So, In simpler terms, generics allow you to write code that can work with any object
    type while ensuring type safety at compile time.
    */

}


/*
class Box {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
*/
