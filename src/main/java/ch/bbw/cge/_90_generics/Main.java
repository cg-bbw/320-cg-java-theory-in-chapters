package ch.bbw.cge._90_generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Box<Tool> toolBox = new Box<>(new Tool("Hammer"));
        Box<String> textBox = new Box<>("Generics keep type information.");

        List<Tool> tools = new ArrayList<>();
        tools.add(toolBox.getValue());

        System.out.println(toolBox.getValue().getName());
        System.out.println(textBox.getValue());
        System.out.println("Tools in list: " + tools.size());
    }
}