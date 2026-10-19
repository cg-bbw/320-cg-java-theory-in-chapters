package ch.bbw.cge._09a_exercise_smart_home.starter;

public class Thermostat extends Device {

    private double temperature;

    public Thermostat(String name, double temperature) {
        super(name);
        this.temperature = temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getStatus() {
        // TODO: Return a text such as "Living Room Thermostat: 21.5 °C".
        return "";
    }
}
