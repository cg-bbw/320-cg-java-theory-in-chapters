package ch.bbw.cge._09_interfaces_abstract_classes;

public class Horse extends Animal implements Trainable {
    public Horse(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Wieher");
    }

    @Override
    public void performTrick(){
        System.out.println("The horse jumps over a barrel");
    }
}
