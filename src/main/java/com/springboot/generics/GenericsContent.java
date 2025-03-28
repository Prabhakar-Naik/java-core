package com.springboot.generics;

/**
 * @author prabhakar, @Date 30-12-2024
 */
public class GenericsContent {

    /*
    Generic types allow you to define a class, interface, or method with placeholders
    (type parameters) for the data types they will work with. This enables code re-usability
     and type safety, as it allows you to create classes, interfaces, or methods that can operate
     on various types without needing to rewrite the code for each type.


     A generic type is a class or interface that is parameterized over types. For example,
     a generic class can work with any type specified by the user, and that type can be enforced
     at compile time.

     The syntax for a generic type is:
     class ClassName<T> {
    // Class body
     }

     Generics help us write more flexible and reusable code. For example, without generics,
     we would have to write multiple versions of the same class to handle different data types,
     leading to code duplication.

     A generic class can have more than one type parameter.

     Type Parameter Naming Conventions

     While you can name type parameters anything, the convention is to use single letters that
     describe the purpose of the type parameter:

     T: Type
     E: Element (used in collections)
     K: Key (used in maps)
     V: Value (used in maps)
     N: Number

     For example, in the java.util.Map<K, V> interface:

     K stands for the key type
     V stands for the value type

    */


    /*
    Generic Interface
        A generic interface in Java allows you to define an interface with type parameters.
        This means that the interface can work with any type specified at the time of implementation.
        Generic interfaces are commonly used when the type of the objects that the interface deals
        with is not known until runtime.

    You declare a generic interface in the same way you would declare a generic class or method,
    using angle brackets <> to specify type parameters. Here's a basic example of a generic
    interface:

    interface Container<T> {
    void add(T item);
    T get();
    }

    In this example, T is the generic type parameter for the Container interface. The add method
    accepts an argument of type T, and the get method returns a value of type T.

    When you implement a generic interface, you need to specify the type for the generic parameter,
    or you can continue to make the implementation generic by using type parameters.

    class StringContainer implements Container<String> {
    private String item;

    @Override
    public void add(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
    }

    In this example, StringContainer implements the Container interface with String
    as the specified type parameter.

    class GenericContainer<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
    }

    In this case, the class GenericContainer remains generic and can work with any type,
    just like the Container interface.

    */

    /*

    Wildcards in Generics
        In Java Generics, wildcards (?) are a special kind of type argument that can be used in
        method arguments or class definitions to represent an unknown type. They allow for more
        flexible and dynamic code by letting the type be specified later or be more loosely defined.

        Wildcards are useful when you don’t know the exact type at the time of defining a class
        or method, or when you want to allow a range of types rather than a single specific one.
    Basic syntax
        List<?> list;

        Here, ? represents an unknown type. It means the list can contain elements of any type,
        but you cannot perform type-specific operations on the elements.

    Why Use Wildcards?

        Wildcards provide flexibility, especially when you want to write code that can work with
        different types, but you don’t want to be too specific about the types. They are often
        used when you want a method to accept arguments of generic types without tying it down
        to a particular class.

        For instance, if you need to write a method that can handle a list of any object type
        (e.g., List of Integer, List of String, etc.), wildcards allow you to do that.

    Wildcards in Method Parameters

        Wildcards are typically used as method parameters where the exact type isn’t important.
        They allow a method to accept different types of collections or generic classes.

     public void printList(List<?> list) {
    for (Object element : list) {
        System.out.println(element);
    }
    }

    In this example, List<?> can be a list of any object type, like List<String>, List<Integer>,
    etc. The method can process them all without needing to know the exact type.


    */
}
