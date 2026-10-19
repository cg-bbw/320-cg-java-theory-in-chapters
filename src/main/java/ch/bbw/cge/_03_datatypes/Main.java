package ch.bbw.cge._03_datatypes;

public class Main {

    public static void main(String[] args) {
        // These variables demonstrate Java's primitive types used in typical examples.
        int age = 18;
        double temperature = 21.5;
        boolean courseFinished = false;
        char grade = 'A';

        // String is a class, so this variable has a reference type.
        String courseName = "Java Fundamentals";

        // Widening can happen automatically for this conversion.
        double ageAsDouble = age;

        // Narrowing requires an explicit cast and may lose information.
        int wholeTemperature = (int) temperature;

        // Integer is the wrapper class for int.
        Integer boxedAge = age;
        int unboxedAge = boxedAge;

        System.out.println(courseName);
        System.out.println(ageAsDouble);
        System.out.println(wholeTemperature);
        System.out.println(courseFinished);
        System.out.println(grade);
        System.out.println(unboxedAge);
    }
}
