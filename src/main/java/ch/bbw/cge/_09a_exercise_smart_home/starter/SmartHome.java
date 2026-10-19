package ch.bbw.cge._09a_exercise_smart_home.starter;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {

    private final String name;
    private final List<Room> rooms = new ArrayList<>();

    public SmartHome(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Room addRoom(String name) {
        // TODO:
        // 1. Create a new Room.
        // 2. Store it in rooms.
        // 3. Return the created Room.
        return null;
    }

    public List<Room> getRooms() {
        return List.copyOf(rooms);
    }
}
