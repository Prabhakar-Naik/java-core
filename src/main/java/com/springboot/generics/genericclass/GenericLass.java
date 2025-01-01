package com.springboot.generics.genericclass;
/**
 * @author prabhakar, @Date 30-12-2024
 */
public class GenericLass<T> {//  one or more type parameters
    //  These type parameters are placeholders that are replaced with specific types when the class is instantiated.
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    //Here, GenericLass<T> is a generic class. The type parameter T will be replaced with a specific
    // type when an object of GenericLass is created. Now, the GenericLass class is type-safe, and we will not
    // encounter the ClassCastException because the types are enforced at compile time.

    /*
    So, In simpler terms, generics allow you to write code that can work with any object
    type while ensuring type safety at compile time.
    */

}