package com.springboot.collections;

/**
 * @author prabhakar, @Date 01-01-2025
 */
public class CollectionContent {

    /*
    What is Collection:
        A Collection is simply an object that represents a group of objects, known as its elements

    Before Introduction of Collection framework in jdk 1.2, java used to rely on a variety of classes
    like Vector, Stack, HashTable and Arrays to store and manipulate group of objects.

    However, these classes had several drawbacks
    1. Inconsistency:
        Each class or program had a different way of managing collections, leading to
        confusion and a steep learning curves.

    2. Lack of interoperability:
        These classes were not designed to work together seamlessly.

    3. No Common Interface:
        There was no common interface for all these classes, which meant you couldn't write generic
        algorithms that could operate on different types of collections

    To solve these problems, the collection framework was introduced in java 1.2(2).

    Unified architecture:
        A consistent set of interfaces for all collections.
    Interoperability:
        Collections can be easily interchanged and manipulated in uniform way.
    Re-usability:
        Generic algorithms can be written that work with any collection.
    Efficiency:
        The framework providers efficient algorithms for basic operations like searching, sorting
        and manipulation.

    Key Interfaces in Collection Framework
        The Collection Framework is primarily built around a set of interfaces. Important ones are:

        Collection:
                The root interface for all the other collection types.
        List      :
                An ordered collection that can contain duplicate elements (e.g.,ArrayList, LinkedList).
        Set       :
                A collection that cannot contain duplicate elements (e.g.,HashSet, TreeSet).
        Queue     :
                A collection designed for holding elements prior to processing (e.g.,PriorityQueue,
                LinkedList when used as a queue).
        Deque     :
                A double-ended queue that allows insertion and removal from both ends (e.g.,ArrayDeque).
        Map       :
                An interface that represents a collection of key-value pairs (e.g.,HashMap, TreeMap).

    Collection Hierarchy:
        The Collection Framework is organized into a hierarchy where the core interfaces are at the
        top, and the specific implementations extend the interfaces.

    Collection Interface:
        The Collection interface is the root interface of the Java Collection Framework.
        It is the most basic interface that defines a group of objects known as elements.
        The collection interface is a part of the java.util package, and It is a parent
        interface that is extended by other collection interfaces like List, Set and Queue.

    Since Collection is an interface, it cannot be instantiated directly. rather, it provides a
    blueprint for basic operations that are common to all collections.

    The Collection interfaces defines a set of core methods that are implemented by all classes
    that implement the interface. These methods allow for basic operations such as adding, removing,
    and checking the existence of elements in a collection.

    List Interface:
        The List interface in java is a part of the java.util package and is a sub interface of
        the collection interface. It provides a way to store an ordered collection of elements
        (known as sequence). Lists allow for precise control over where elements are inserted
        and can contain duplicate elements.

    The List interface is implemented by several classes in the Java Collection Framework, such as
    ArrayList, LinkedList, Vector and Stack.

    Key Features of the List Interface
        1. Order Preservation
        2. Index Based Access
        3. Allow Duplicates

    ArrayList:
        An ArrayList is a resizable array implementation of the List interface.
        Unlike arrays in java, which have a fixed size, an ArrayList can change
        its size dynamically as elements are added or removed. This flexibility
        makes it a popular choice when the number of elements in a list isn't known
        in advance.
    more about advance level/ list/ arraylist

    Internal Working:
        Unlike a regular array, which has fixed size, an arraylist can grow and shrink
        as elements are added or removed. This dynamic resizing is achieved by creating
        a new array when the current array is full and copying the elements to the new
        array.
    Internally, the arraylist is implemented as an array of object references. When you
    add elements to an arraylist, you are essentially storing these elements in this
    internal array.

    when you create an arraylist, it has an initial capacity (default is 10).
    The capacity refers to the size of the internal array that can hold elements
    before needing to resize.

             =================ADDING ELEMENTS=============
    When we add elements in ArrayList, the following steps occurs

    Checking Capacity:
        Before adding the new element, arraylist checks if there is enough space in the
        internal array (elementData). if the array is full, it needs to be resized.

    Resize If Necessary:
        the internal array is full, the arraylist will create a new array with a larger
        capacity (usually 1.5 times the current capacity) and copy the elements from the
        old array to the new array.

    Add the Element:
        The new element is then added to the internal array at the appropriate index, and
        the size is incremented.

             =================RESIZING THE ARRAY=============

    Initial Capacity:
        By Default, the initial capacity is 10. This means the internal array can hold 10
        elements before it needs to grow.

    Grow Factor:
        When the initial array is full, a new array is created with a size 1.5 times the
        old array. This growth factor balances memory efficiency and resizing cost.

    Copying Elements:
        When resizing occurs, all elements from the old array are copied to the new array,
        which is an O(n) operation, where n is the number of elements in the ArrayList.

             =================RESIZING THE ARRAY=============
    Check Bounds:
        The ArrayList first checks if the index is within the valid range.

    Removing the Element:
        The element is removed, and all elements to the right of the removed element are
        shifted position to the left to fill the gap.

    Reduce Size:
        The size is decremented by 1.






    */
}
