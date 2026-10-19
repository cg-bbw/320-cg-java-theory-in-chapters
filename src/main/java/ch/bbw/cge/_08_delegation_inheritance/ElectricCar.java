package ch.bbw.cge._08_delegation_inheritance;

// ElectricCar is-a Vehicle. The extends keyword creates an inheritance relationship.
public class ElectricCar extends Vehicle {

    private final int batteryCapacityKwh;

    public ElectricCar(String model, int batteryCapacityKwh) {
        // super(...) invokes the constructor of the direct superclass.
        super(model);
        this.batteryCapacityKwh = batteryCapacityKwh;
    }

    public void charge() {
        System.out.println("Charging " + batteryCapacityKwh + " kWh battery.");
    }
}
