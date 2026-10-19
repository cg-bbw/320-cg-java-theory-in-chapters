package ch.bbw.cge._07_object_relationships;

public class Car {

    private final String model;
    private final Engine engine;

    public Car(String model) {
        this.model = model;

        // The Car creates and owns its Engine. This models composition in this example.
        this.engine = new Engine();
    }

    public void start() {
        System.out.println("Starting " + model);
        engine.start();
    }
}
