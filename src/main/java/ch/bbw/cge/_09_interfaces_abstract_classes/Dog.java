package ch.bbw.cge._09_interfaces_abstract_classes;

public class Dog extends Animal implements Trainable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void performTrick() {
        System.out.println("The dog sits down.");
    }
}
