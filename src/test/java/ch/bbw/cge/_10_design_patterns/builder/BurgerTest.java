package ch.bbw.cge._10_design_patterns.builder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BurgerTest {
    @Test
    public void burgerTest() {
        BurgerDirector director = new BurgerDirector();
        Burger classicBurger = director.constructClassicBurger();
        assertArrayEquals(classicBurger.getIngredients().toArray(new String[0]), new BurgerBuilder("Cheese", true).addCheese().addLettuce().addTomato().addPatty().build().getIngredients().toArray(new String[0]));
    }

}