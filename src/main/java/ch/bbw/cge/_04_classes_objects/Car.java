package ch.bbw.cge._04_classes_objects;

//Class declaration
public class Car {

    // These are instance fields. Every Car object has its own field values.
    // Instance field 1
    private String model;
    //Instance field 2
    private int year;
    //instance field 3
    private int speed;
    private String color;

    // A constructor initializes a newly created object. It has no return type.
    //Constructor, String model: Constructor parameter 1, int year constructor parameter 2
    public Car(String model, int year, String color) {
        // "this.model" is the instance field; "model" is the constructor parameter.
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // targetSpeed is a parameter. The value supplied at the call site is the argument.
    //int targetSpeed: Method parameter
    public void accelerate(int targetSpeed) {
        speed = targetSpeed;
    }

    public String getDescription() {
        // description is a local variable and is only in scope inside this method.
        //Local Variable
        String description = year + " " + model + " " + color;
        return description;
    }
    //Method returning a value: int speed
    public int getSpeed() {
        return speed;
    }
}
