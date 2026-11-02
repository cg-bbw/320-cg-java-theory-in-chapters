package ch.bbw.cge._08_delegation_inheritance;

public class Truck extends Vehicle {

    private final int maximumLoadKg;

    public Truck(String model, int maximumLoadKg) {
        super(model);
        this.maximumLoadKg = maximumLoadKg;
    }

    public int getMaximumLoadKg() {
        return maximumLoadKg;
    }
}