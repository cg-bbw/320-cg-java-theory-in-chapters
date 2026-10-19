package ch.bbw.cge._10_polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow()
        };

        // The variable type is Animal, but the runtime object decides which overridden method executes.
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
