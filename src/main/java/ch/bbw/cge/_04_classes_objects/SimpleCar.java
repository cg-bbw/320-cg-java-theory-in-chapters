package ch.bbw.cge._04_classes_objects;

/**
 * Class declaration and definition: SimpleCar class with an access modifier (public)
 * @author chris
 * @version 1.0
 */
public class SimpleCar {
    // Class variables (static variables) with access modifier package-private (--> when there is none mentioned)
    static int numberOfCars = 0; // Class variable to keep track of the total number of cars | declared and initialized

    // Instance variables (member variables) with access modifiers private
    private String model;  // Instance variable to store the car's model | declared
    private int year;      // Instance variable to store the car's manufacturing year | declared
    private int bateryStatus = 10; // Instance variable to store the car's battery status | declared and initialized
    private int speed; // Instance variable to store the car's speed
    private Equipment equipment; // Instance variable of complex data type Equipment | declared

    // Constructor method with two parameters (String model, int year) | declaration and definition
    // The parameters themselves are also declared. Parameters are local variables and can be used only inside the defined block
    public SimpleCar(String model, int year) {
        // Initialize instance variables using parameters | assigning parameters to instance variables
        this.model = model;
        this.year = year;

        this.equipment = new Equipment(); // Initialize instance variables equipment | instantiate a new Equipment object | assign the new Equipment

        // Increment the class variable to count the number of cars
        numberOfCars++;
    }

    // Method with a return type (void) | declaration and definition
    public void startEngine() { // method signature = startEnginge() | method header = public void startEngine()
        // Local variable within the method
        boolean engineStarted = true; // local variable to store the state of the engine | declared and initialized
        engineStarted = isBatteryStatusOk(); // reassignment of engineStarted to a new value
        // 2 method calls.
        // inner method call uses engineStarted as argument
        // outer method call uses the return value from the inner method call as argument.
        // the inner method call must have the same return type as the outer method's argument. In this case int
        setSpeed(initializeSpeed(engineStarted));

        // Method call (println is a method) with an argument --> care year and model are not the arguments here.
        // the argument is only the one String "The " + year + " " + model + "'s engine is started."
        // The variables year and model get concatenated with the rest of the String to one String --> argument
        System.out.println("The " + year + " " + model + "'s engine is started.");
    }

    // This method has a parameter called targetSpeed.
    // The parameter name and the name of the argument (= value passed to the method) in the method call do NOT have to be the same.
    public void accelerate(int targetSpeed) {
        while(speed < targetSpeed) {
            speed++;
        }
    }

    // method with return type boolean | declaration and definition
    public boolean isBatteryStatusOk() { // method signature = isBatteryStatusOk() | method header = public boolean isBatteryStatusOk()
        if(bateryStatus == 0) {
            System.out.println("Battery is empty and must be recharged.");
            return false;
        }
        return true;
    }
    // method with return type int | declaration and definition
    private int initializeSpeed(boolean engineStarted) { // method signature = initializeSpeed(boolean engineStarted) | method header = private int initializeSpeed(boolean engineStarted) | method parameter boolean engineStarted
        if (engineStarted) {
            return 5;
        }
        return 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() { // method signature = getYear() | method header = public int getYear()
        return year;
    }

    public void setYear(int year) { // method signature = setYear(int year) | method header = public void setYear(int year) | method parameter = int year
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
