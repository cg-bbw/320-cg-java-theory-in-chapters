package ch.bbw.cge._10_design_patterns.builder;

public class Application {
    public static void main(String[] args) {

        new Pizza();
        BurgerDirector director = new BurgerDirector();

        Burger classicBurger = director.constructClassicBurger();
        Burger cheeseBurger = director.constructCheeseBurger();
        Burger chickenBurger = director.constructChickenBurger();
        Burger doubleCheeseBurger = director.constructDoubeCheeseBurger();

        // Other solution could be without director.
        // So instantiate new BurgerBuilder here and then call the add() methods and at last the build method.

        System.out.println("Your orders were: ");
        classicBurger.describeBurger();
        cheeseBurger.describeBurger();
        chickenBurger.describeBurger();
        doubleCheeseBurger.describeBurger();
    }
}
