package ch.bbw.cge._04_classes_objects;

public class Driver {
    private int yearsOfExperience;
    public Driver(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    protected void drive(SimpleCar car) {
        car.startEngine();
    }
}
