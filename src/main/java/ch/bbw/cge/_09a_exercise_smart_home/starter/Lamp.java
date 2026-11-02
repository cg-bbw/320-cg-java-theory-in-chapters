package ch.bbw.cge._09a_exercise_smart_home.starter;

public class Lamp extends Device implements Switchable {

    private boolean switchedOn;

    public Lamp(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        switchedOn = true;
    }

    @Override
    public void turnOff() {
        switchedOn = false;
    }

    @Override
    public String getStatus() {
        var status = switchedOn
                ? "ON"
                : "OFF";

        return getName() + ": " + status;
    }
}
