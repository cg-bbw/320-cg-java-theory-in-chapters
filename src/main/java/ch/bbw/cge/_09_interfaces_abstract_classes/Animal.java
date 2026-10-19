package ch.bbw.cge._09_interfaces_abstract_classes;

// An abstract class can contain shared state and shared implementation,
// but it cannot be instantiated directly.
public abstract class Animal {

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Animal: " + name);
    }

    // An abstract method declares required behavior without providing the implementation here.
    public abstract void makeSound();
}
