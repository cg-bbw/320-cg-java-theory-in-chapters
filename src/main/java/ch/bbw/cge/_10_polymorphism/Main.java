package ch.bbw.cge._10_polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow(),
                new Duck()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
