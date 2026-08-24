package ch.bbw.cge._06_inheritance;

public class Driver {
    private int yearsOfExperience;
    public Driver(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    protected void drive(SimpleCar car) {
        car.startEngine();
    }

    public static void main(String[] args) {
        int yearsOfExperience = 10;
        Driver driver = new Driver(yearsOfExperience);

        SimpleCar car = new SimpleCar("VW Golf", 2022);
        // car = new SimpleCar("Audi TT", 2010);
        // car.startEngine();
        driver.drive(car);
    }
}
