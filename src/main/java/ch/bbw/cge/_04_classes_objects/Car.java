package ch.bbw.cge._04_classes_objects;

public class Car {

    // These are instance fields. Every Car object has its own field values.
    private String model;
    private int year;
    private int speed;

    // A constructor initializes a newly created object. It has no return type.
    public Car(String model, int year) {
        // "this.model" is the instance field; "model" is the constructor parameter.
        this.model = model;
        this.year = year;
    }

    // targetSpeed is a parameter. The value supplied at the call site is the argument.
    public void accelerate(int targetSpeed) {
        speed = targetSpeed;
    }

    public String getDescription() {
        // description is a local variable and is only in scope inside this method.
        String description = year + " " + model;
        return description;
    }

    public int getSpeed() {
        return speed;
    }
}
