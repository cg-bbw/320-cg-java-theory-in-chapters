package ch.bbw.cge._09a_exercise_smart_home.starter;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private final String name;
    private final List<Device> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDevice(Device device) {
        // TODO: Add the existing device to this room.
    }

    public List<Device> getDevices() {
        return List.copyOf(devices);
    }
}
