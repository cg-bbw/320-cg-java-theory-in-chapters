package ch.bbw.cge._04_classes_objects;

public class Car {

    private String model;
    private int year;
    private int speed;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void accelerate(int targetSpeed) {
        speed = targetSpeed;
    }

    public String getDescription() {
        String description = year + " " + model + " (" + color + ")";
        return description;
    }

    public int getSpeed() {
        return speed;
    }
}