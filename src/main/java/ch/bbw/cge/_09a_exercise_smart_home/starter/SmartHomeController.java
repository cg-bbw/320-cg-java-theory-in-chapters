package ch.bbw.cge._09a_exercise_smart_home.starter;

public class SmartHomeController {

    public void switchOn(Switchable device) {
        device.turnOn();
    }

    public void switchOff(Switchable device) {
        device.turnOff();
    }
}