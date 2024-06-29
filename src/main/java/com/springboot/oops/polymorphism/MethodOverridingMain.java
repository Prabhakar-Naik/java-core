

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingMain {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Dog's sound() is called
    }
}
