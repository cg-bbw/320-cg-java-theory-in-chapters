package ch.bbw.cge._08_delegation_inheritance;

public class Truck extends Vehicle {
    public Truck(String model, int maximumLoadKg) {
        super(model);

        this.maximumLoadKg = maximumLoadKg;
    }

    private int maximumLoadKg;
}
