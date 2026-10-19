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

        System.out.println(home.getName());
    }
}
