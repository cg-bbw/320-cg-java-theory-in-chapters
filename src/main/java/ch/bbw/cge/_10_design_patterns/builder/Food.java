package ch.bbw.cge._10_design_patterns.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Food {
    private String name;
    private int carbohydrateInGram; // Unit = gram
    private int fat; // Unit = gram
    private int protein; // Unit = gram

    private List<String> ingredients = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public void addIngredients(List<String> ingredients) { // method overloading
        this.ingredients.addAll(ingredients);
    }

    public void addIngredients(String[] ingredients){ // method overloading
        for (String ingredient : ingredients) {
            this.ingredients.add(ingredient);
        }
    }


    public List<String> getIngredients(){ // not method overloading
        return this.ingredients;
    }

//    this does not work, because if you call getIngredients, it does not know which one to call. return type does not matter.

}
