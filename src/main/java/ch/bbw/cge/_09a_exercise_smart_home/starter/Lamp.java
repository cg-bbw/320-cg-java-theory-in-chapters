package ch.bbw.cge._09a_exercise_smart_home.starter;

public class Lamp extends Device implements Switchable {

    private boolean switchedOn;

    public Lamp(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        // TODO: Change the state of the lamp.
    }

    @Override
    public void turnOff() {
        // TODO: Change the state of the lamp.
    }

    @Override
    public String getStatus() {
        // TODO: Return a text such as "Desk Lamp: ON" or "Desk Lamp: OFF".
        return "";
    }
}
