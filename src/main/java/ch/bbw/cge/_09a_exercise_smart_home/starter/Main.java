package ch.bbw.cge._09a_exercise_smart_home.starter;

public class Main {

    public static void main(String[] args) {

        SmartHome home = new SmartHome("My Smart Home");
        SmartHomeController controller = new SmartHomeController();

        Room livingRoom = home.addRoom("Living Room");
        Room office = home.addRoom("Office");

        Lamp ceilingLamp = new Lamp("Ceiling Lamp");
        Thermostat livingRoomThermostat = new Thermostat("Living Room Thermostat", 21.5);
        livingRoom.addDevice(ceilingLamp);
        livingRoom.addDevice(livingRoomThermostat);

        Lamp deskLamp = new Lamp("Desk Lamp");
        Thermostat officeThermostat = new Thermostat("Office Thermostat", 20.0);
        office.addDevice(deskLamp);
        office.addDevice(officeThermostat);

        controller.switchOn(ceilingLamp);

        System.out.println("=== " + home.getName() + " ===");
        for (Room room : home.getRooms()) {
            System.out.println("Room: " + room.getName());
            for (Device device : room.getDevices()) {
                System.out.println("  - " + device.getStatus());
            }
        }
    }
}