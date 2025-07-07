package com.springboot.designpatterns;

/**
 * @author prabhakar, @Date 05-07-2025
 */

public class DesignPatternContext {

    /**
     * Design patterns in Java are established, reusable solutions to
     * common problems that arise during software design.
     * They are not direct code implementations but rather blueprints or guidelines
     * that can be adapted to specific situations, promoting code reusability,
     * maintainability, and flexibility.
     * <br>
     * The "Gang of Four" (GoF) book "Design Patterns:
     * Elements of Reusable Object-Oriented Software" categorized
     * 23 fundamental design patterns into three main types:
     * <br>
     * 1. Creational Patterns:
     * These patterns deal with object creation mechanisms, aiming to create objects
     * in a manner suitable for the situation while increasing flexibility and reuse
     * of existing code.
     * <br>
     * I) Singleton: Ensures a class has only one instance and provides a global point
     * of access to it. (e.g., managing a single configuration for an application,
     * a single database connection pool).
     * <br>
     * II) Factory Method: Defines an interface for creating an object,
     * but lets subclasses decide which class to instantiate.
     * This allows a class to defer instantiation to subclasses.
     * <br>
     * III) Abstract Factory: Provides an interface for creating families of related or
     * dependent objects without specifying their concrete classes.
     * <br>
     * IV) Builder: Separates the construction of a complex object from its representation,
     * allowing the same construction process to create different representations.
     * Useful for objects with many optional parameters.
     * <br>
     * V) Prototype: Specifies the kinds of objects to create using a prototypical
     * instance, and creates new objects by copying this prototype.
     * Useful when object creation is costly.
     */

    public void printCreationPatterns() {
        System.out.println("Printing Creation patterns");
    }

    /**
     * 2. Structural Patterns:
     * These patterns concern the composition of objects and classes into larger structures,
     * focusing on how objects are connected and organized to form larger systems.
     * <br>
     * I) Adapter: Allows objects with incompatible interfaces to collaborate.
     * It acts as a bridge between two incompatible interfaces.
     * <br>
     * II) Bridge: Decouples an abstraction from its implementation so that the two can
     * vary independently. Useful when you have interface hierarchies in both interfaces
     * and implementations.
     * <br>
     * III) Composite: Composes objects into tree structures to represent part-whole
     * hierarchies. It allows clients to treat individual objects and compositions of
     * objects uniformly.
     * <br>
     * IV) Decorator: Attaches new behaviors to objects by placing these objects inside
     * special wrapper objects that contain the behaviors. It provides a flexible
     * alternative to subclassing for extending functionality.
     * <br>
     * V) Facade: Provides a simplified interface to a complex subsystem.
     * It hides the complexities of the system from the client.
     * <br>
     * VI) Flyweight: Used to minimize memory usage or computation expenses by sharing
     * as much data as possible with similar objects. (e.g., Java's String pool).
     * <br>
     * VII) Proxy: Provides a surrogate or placeholder for another object to control access to it.
     */
    public void printStructuralPatterns() {
        System.out.println("Printing structural patterns");
    }

    /**
     * 3. Behavioral Patterns:
     * These patterns are concerned with algorithms and the assignment of responsibilities
     * between objects, focusing on the communication and interaction between objects and
     * classes.
     * <br>
     * I) Chain of Responsibility: Passes a request along a chain of handlers.
     * Each handler decides either to process the request or to pass it to the
     * next handler in the chain.
     * <br>
     * II) Command: Encapsulates a request as an object, thereby letting you parameterize
     * clients with different requests, queue or log requests, and support undoable
     * operations.
     * <br>
     * III) Interpreter: Given a language, defines a representation for its grammar
     * along with an interpreter that uses the representation to interpret sentences
     * in the language.
     * <br>
     * IV) Iterator: Provides a way to access the elements of an aggregate object
     * sequentially without exposing its underlying representation.
     * <br>
     * V) Mediator: Defines an object that encapsulates how a set of objects interact.
     * It promotes loose coupling by keeping objects from referring to each other explicitly.
     * <br>
     * VI) Memento: Captures and externalizes an object's internal state so that
     * the object can be restored to this state later.
     * <br>
     * VII) Observer: Defines a one-to-many dependency between objects so that
     * when one object changes state, all its dependents are notified and
     * updated automatically.
     * <br>
     * VIII) State: Allows an object to alter its behavior when its internal state
     * changes. The object will appear to change its class.
     * <br>
     * IX) Strategy: Defines a family of algorithms, encapsulates each one, and makes
     * them interchangeable. Strategy lets the algorithm vary independently of clients that use it.
     * <br>
     * X) Template Method: Defines the skeleton of an algorithm in an operation,
     * deferring some steps to subclasses. It lets subclasses redefine certain
     * steps of an algorithm without changing the algorithm's structure.
     * <br>
     * XI) Visitor: Represents an operation to be performed on the elements of an
     * object structure. Visitor lets you define a new operation without changing
     * the classes of the elements on which it operates.
     */
    public void printBehavioralPatterns() {
        System.out.println("Printing Behavioral patterns");
    }

    /**
     * Why are Design Patterns Important in Java?
     <br>
     * Reusability: They provide proven solutions that can be applied across different projects and contexts, reducing the need to reinvent the wheel.
     <br>
     * Maintainability: Code becomes more modular and easier to understand, modify, and extend.
     <br>
     * Flexibility and Extensibility: Patterns often promote loose coupling, making it easier to change or add new functionality without impacting existing code significantly.
     <br>
     * Common Vocabulary: They provide a shared language for developers to discuss design solutions, improving communication within development teams.
     <br>
     * Best Practices: They represent established best practices that have evolved from years of experience in software development, helping avoid common pitfalls.
     <br>
     */

    public void whyWeUserDesignPatterns() {
        System.out.println("Why we user design patterns");
    }

    public static void main(String[] args) {

        System.out.println("DesignPattern Examples presented in categorised.");
        System.out.println("These are simplified illustrations to convey the core concept." +
                " Real-world implementations might be more complex.");
    }
}
