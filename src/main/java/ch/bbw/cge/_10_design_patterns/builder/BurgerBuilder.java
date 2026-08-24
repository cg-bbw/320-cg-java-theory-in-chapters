package ch.bbw.cge._10_design_patterns.builder;

public class BurgerBuilder implements Builder {
    //required fields
    private String type;
    private boolean hasBread;

    //optional fields
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
    // ... other properties

    public BurgerBuilder(String type, boolean hasBread) {
        this.type = type;
        this.hasBread = hasBread; // in our Case we have a boolean and could just type this.hasBread = true;
    }

//    addBread is actually not needed, because it is not optional but required
//    public BurgerBuilder addBread() {
//        this.hasBread = true;
//        return this;
//    }
    
    public BurgerBuilder addPatty() {
        // normally we pass a parameter and set this.hasBread = hasBread. Same reason as in the constructor. Valid for every add method.
        this.hasPatty = true;
        return this;
    }
    public BurgerBuilder addSauce() {
        this.hasSauce = true;
        return this;
    }
    public BurgerBuilder addLettuce() {
        this.hasLettuce = true;
        return this;
    }
    public BurgerBuilder addCheese() {
        this.hasCheese = true;
        return this;
    }
    public BurgerBuilder addBacon() {
        this.hasBacon = true;
        return this;
    }
    public BurgerBuilder addCucumber() {
        this.hasCucumber = true;
        return this;
    }
    public BurgerBuilder addTomato() {
        this.hasTomato = true;
        return this;
    }
    public BurgerBuilder addHam() {
        this.hasHam = true;
        return this;
    }
    public BurgerBuilder addExtraPatty() {
        this.hasExtraPatty = true;
        return this;
    }
    public BurgerBuilder addChickenPatty() {
        this.hasChickenPatty = true;
        return this;
    }
    public BurgerBuilder addVeganPatty() {
        this.hasVeganPatty = true;
        return this;
    }
    public BurgerBuilder addFishPatty() {
        this.hasFishPatty = true;
        return this;
    }
    // ... methods for other properties
    
    public Burger build() {
        return new Burger(this);
    }

    public String getType() {
        return type;
    }

    public boolean getBread() {
        return hasBread;
    }

    public boolean getPatty() {
        return hasPatty;
    }

    public boolean getSauce() {
        return hasSauce;
    }

    public boolean getLettuce() {
        return hasLettuce;
    }

    public boolean getCheese() {
        return hasCheese;
    }

    public boolean getBacon() {
        return hasBacon;
    }

    public boolean getCucumber() {
        return hasCucumber;
    }

    public boolean getTomato() {
        return hasTomato;
    }

    public boolean getPineapple() {
        return hasPineapple;
    }

    public boolean getHam() {
        return hasHam;
    }

    public boolean getExtraPatty() {
        return hasExtraPatty;
    }

    public boolean getChickenPatty() {
        return hasChickenPatty;
    }

    public boolean getVeganPatty() {
        return hasVeganPatty;
    }

    public boolean getFishPatty() {
        return hasFishPatty;
    }
    // ... methods for other properties
}
