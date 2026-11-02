package ch.bbw.cge._09a_exercise_smart_home.starter;

public class Main {

    public static void main(String[] args) {

        SmartHome home = new SmartHome("My Smart Home");
        SmartHomeController controller = new SmartHomeController();

        /*
         * TODO:
         * 1. Create "Living Room" and "Office" through home.addRoom(...).
         * 2. Create:
         *    - Ceiling Lamp
         *    - Living Room Thermostat (21.5 °C)
         *    - Desk Lamp
         *    - Office Thermostat (20.0 °C)
         * 3. Add the devices to the correct rooms.
         * 4. Use the controller to switch on the Ceiling Lamp.
         * 5. Print every room name and every device status.
         */
        Room livingRoom = home.addRoom("Living Room");
        Room office = home.addRoom("Office");
        Lamp ceilingLamp = new Lamp("Ceiling Lamp");
        Thermostat livingRoomThermostat = new Thermostat("Living Room Thermostat", 21.5);
        Lamp deskLamp = new Lamp("Desk Lamp");
        Thermostat officeThermostat = new Thermostat("Office Thermostat", 21.5);

        livingRoom.addDevice(ceilingLamp);
        livingRoom.addDevice(livingRoomThermostat);
        office.addDevice(deskLamp);
        office.addDevice(officeThermostat);

        controller.switchOn(ceilingLamp);

        System.out.println(home.getName());
        for (Room room: home.getRooms()){
            System.out.println(room.getName());
            for (Device device: room.getDevices()){
                System.out.println(device.getStatus());
            }
        }

    }
}
