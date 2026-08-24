package ch.bbw.cge._10_design_patterns.builder;

public class BurgerDirector {
    public Burger constructClassicBurger() {
        return new BurgerBuilder("Classic", true) // boolean true wouldn't be required as argument since we always add bread
                .addPatty()
                .addLettuce()
                .addSauce()
                .build();
    }
    public Burger constructChickenBurger() {
        return new BurgerBuilder("Chicken", true)
                .addLettuce()
                .addPatty()
                .addTomato()
                .addChickenPatty()
                .build();
    }

    public Burger constructCheeseBurger() {
        return new BurgerBuilder("Cheese", true)
                .addCheese()
                .addLettuce()
                .addTomato()
                .addPatty()
                .build();
    }

    public Burger constructDoubeCheeseBurger() {
        return new BurgerBuilder("Double Cheese", true)
                .addLettuce()
                .addPatty()
                .addCheese()
                .addExtraPatty()
                .addTomato()
                .build();
    }
}
