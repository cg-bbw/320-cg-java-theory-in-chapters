package ch.bbw.cge._09a_exercise_smart_home.starter;

public class Main {

    public static void main(String[] args) {
        SmartHome home = new SmartHome("My Smart Home");
        SmartHomeController controller = new SmartHomeController();

        Room livingRoom = home.addRoom("Living Room");
        Room office = home.addRoom("Office");

        Lamp ceilingLamp = new Lamp("Ceiling Lamp");
        Thermostat livingRoomThermostat =
                new Thermostat("Living Room Thermostat", 21.5);

        Lamp deskLamp = new Lamp("Desk Lamp");
        Thermostat officeThermostat =
                new Thermostat("Office Thermostat", 20.0);

        livingRoom.addDevice(ceilingLamp);
        livingRoom.addDevice(livingRoomThermostat);

        office.addDevice(deskLamp);
        office.addDevice(officeThermostat);

        controller.switchOn(ceilingLamp);

        // Beide Schaltoperationen ausprobieren.
        controller.switchOn(deskLamp);
        controller.switchOff(deskLamp);

        System.out.println(home.getName());

        for (Room room : home.getRooms()) {
            System.out.println();
            System.out.println(room.getName());
            System.out.println("------------");

            for (Device device : room.getDevices()) {
                System.out.println(device.getStatus());
            }
        }

        // Optionale Erweiterung mit unverändertem Controller.
        SmartPlug smartPlug = new SmartPlug("Office Smart Plug");
        office.addDevice(smartPlug);

        System.out.println();
        System.out.println("Optional extension:");

        controller.switchOn(smartPlug);
        System.out.println(smartPlug.getStatus());

        controller.switchOff(smartPlug);
        System.out.println(smartPlug.getStatus());
    }
}