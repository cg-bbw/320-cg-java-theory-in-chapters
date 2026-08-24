package ch.bbw.cge._10_design_patterns.builder;

public class Burger extends Food {
    private String type;
    private boolean hasBread;
    private boolean hasPatty;
    private boolean hasSauce;
    private boolean hasLettuce;
    private boolean hasCheese;
    private boolean hasBacon;
    private boolean hasCucumber;
    private boolean hasTomato;
    private boolean hasPineapple;
    private boolean hasHam;
    private boolean hasExtraPatty;
    private boolean hasChickenPatty;
    private boolean hasVeganPatty;
    private boolean hasFishPatty;
    public Burger(BurgerBuilder burgerBuilder) {
        this.type = burgerBuilder.getType();
        this.hasBread = burgerBuilder.getBread();
        this.hasPatty = burgerBuilder.getPatty();
        this.hasSauce = burgerBuilder.getSauce();
        this.hasLettuce = burgerBuilder.getLettuce();
        this.hasCheese = burgerBuilder.getCheese();
        this.hasBacon = burgerBuilder.getBacon();
        this.hasCucumber = burgerBuilder.getCucumber();
        this.hasTomato = burgerBuilder.getTomato();
        this.hasPineapple = burgerBuilder.getPineapple();
        this.hasHam = burgerBuilder.getHam();
        this.hasExtraPatty = burgerBuilder.getExtraPatty();
        this.hasChickenPatty = burgerBuilder.getChickenPatty();
        this.hasVeganPatty = burgerBuilder.getVeganPatty();
        this.hasFishPatty = burgerBuilder.getFishPatty();
    }

    @Override
    public void addIngredient(String ingredient) {
        super.addIngredient(ingredient);
    }

    public void describeBurger() {
        System.out.println("Your burger is a " + this.type + " burger and contains:");
        if (this.hasBread) {
            System.out.println("Bread");
        }
        if (this.hasPatty) {
            System.out.println("Patty");
        }
        if (this.hasSauce) {
            System.out.println("Sauce");
        }
        if (this.hasLettuce) {
            System.out.println("Lettuce");
        }
        if (this.hasCheese) {
            System.out.println("Cheese");
        }
        if (this.hasBacon) {
            System.out.println("Bacon");
        }
        if (this.hasCucumber) {
            System.out.println("Cucumber");
        }
        if (this.hasTomato) {
            System.out.println("Tomato");
        }
        if (this.hasPineapple) {
            System.out.println("Pineapple");
        }
        if (this.hasHam) {
            System.out.println("Ham");
        }
        if (this.hasExtraPatty) {
            System.out.println("Extra Patty");
        }
        if (this.hasChickenPatty) {
            System.out.println("Chicken Patty");
        }
        if (this.hasVeganPatty) {
            System.out.println("Vegan Patty");
        }
        if (this.hasFishPatty) {
            System.out.println("Fish Patty");
        }
    }
}
