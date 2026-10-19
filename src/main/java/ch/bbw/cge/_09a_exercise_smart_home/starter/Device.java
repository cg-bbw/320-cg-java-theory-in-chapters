package ch.bbw.cge._09a_exercise_smart_home.starter;

public abstract class Device {

    private final String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getStatus();
}
