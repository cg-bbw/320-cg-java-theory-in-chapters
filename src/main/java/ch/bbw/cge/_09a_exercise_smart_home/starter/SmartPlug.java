package ch.bbw.cge._09a_exercise_smart_home.starter;

public class SmartPlug extends Device implements Switchable {

    private boolean switchedOn;

    public SmartPlug(String name) {
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
        if (switchedOn) {
            return getName() + ": ON";
        } else {
            return getName() + ": OFF";
        }
    }
}