package ch.bbw.cge._04_classes_objects;

public class Main {

    public static void main(String[] args) {
        Car firstCar = new Car("Audi A3", 2023, "blue");
        Car secondCar = new Car("VW Golf", 2022,"Orange");

        firstCar.accelerate(50);

        System.out.println(firstCar.getDescription());
        System.out.println("Current speed: " + firstCar.getSpeed());
        System.out.println(secondCar.getDescription());
    }
}
