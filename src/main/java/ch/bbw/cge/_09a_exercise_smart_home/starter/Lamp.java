package ch.bbw.cge._09a_exercise_smart_home.starter;

public class Lamp extends Device implements Switchable {

    private boolean switchedOn;

    public Lamp(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        // TODO: Change the state of the lamp.
        switchedOn = true;
    }

    @Override
    public void turnOff() {
        // TODO: Change the state of the lamp.
        switchedOn = false;
    }

    @Override
    public String getStatus() {
        // TODO: Return a text such as "Desk Lamp: ON" or "Desk Lamp: OFF".
        return getName() + ": " + (switchedOn ? "ON" : "OFF");
    }
}
