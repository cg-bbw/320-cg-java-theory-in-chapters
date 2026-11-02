package ch.bbw.cge._09a_exercise_smart_home.starter;

public class Main {

    public static void main(String[] args) {

        SmartHome home = new SmartHome("My Smart Home");
        SmartHomeController controller = new SmartHomeController();

        // Create rooms
        Room livingRoom = home.addRoom("Living Room");
        Room office = home.addRoom("Office");

        // Create devices
        Lamp ceilingLamp = new Lamp("Ceiling Lamp");
        Thermostat livingThermostat =
                new Thermostat("Living Room Thermostat", 21.5);

        Lamp deskLamp = new Lamp("Desk Lamp");
        Thermostat officeThermostat =
                new Thermostat("Office Thermostat", 20.0);

        // Add devices to rooms
        livingRoom.addDevice(ceilingLamp);
        livingRoom.addDevice(livingThermostat);

        office.addDevice(deskLamp);
        office.addDevice(officeThermostat);

        // Switch on ceiling lamp
        controller.switchOn(ceilingLamp);

        // Print Smart Home
        System.out.println(home.getName());
        System.out.println();

        for (Room room : home.getRooms()) {
            System.out.println(room.getName());
            System.out.println("------------");

            for (Device device : room.getDevices()) {
                System.out.println(device.getStatus());
            }

            System.out.println();
        }
    }
}