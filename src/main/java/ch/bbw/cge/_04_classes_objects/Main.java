package ch.bbw.cge._04_classes_objects;

public class Main {

    public static void main(String[] args) {
        SimpleCar car = new SimpleCar("Audi A3", 2023);
        System.out.println("Current speed before starting engine is: " + car.getSpeed());
        car.startEngine();
        System.out.println("Current speed after starting engine is: " + car.getSpeed());
        int targetSpeed = 100;
        car.accelerate(targetSpeed);
        System.out.println("Current speed after accelerating is: " + car.getSpeed());


        int yearsOfExperience = 10;
        Driver driver = new Driver(yearsOfExperience);

        SimpleCar car2 = new SimpleCar("VW Golf", 2022);
        // car = new SimpleCar("Audi TT", 2010);
        // car.startEngine();
        driver.drive(car2);
    }
}
