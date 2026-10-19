package ch.bbw.cge._08_delegation_inheritance;

public class Vehicle {

    private final String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public void printDescription() {
        System.out.println("Vehicle: " + model);
    }
}
