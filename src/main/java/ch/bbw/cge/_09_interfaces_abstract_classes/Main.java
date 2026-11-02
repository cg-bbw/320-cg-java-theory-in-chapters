package ch.bbw.cge._09_interfaces_abstract_classes;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        Horse horse = new Horse("Spirit");

        dog.printName();
        dog.makeSound();
        dog.performTrick();
        horse.printName();
        horse.makeSound();
        horse.performTrick();
    }
}
