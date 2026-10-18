package ch.bbw.cge._03_datatypes;

public class Main {

    public static void main(String[] args) {
        // Primitive datatype variables store primitive values.
        int age = 18;
        double temperature = 21.5;
        boolean courseFinished = false;
        char grade = 'A';

        // String is a class, so String variables have a reference type.
        String courseName = "Java Fundamentals";

        // A widening primitive conversion can happen automatically.
        double ageAsDouble = age;

        // A narrowing conversion requires an explicit cast and may lose information.
        int roundedDownTemperature = (int) temperature;

        // Wrapper classes provide object types for primitive values.
        Integer boxedAge = age;
        int unboxedAge = boxedAge;

        System.out.println(courseName);
        System.out.println(ageAsDouble);
        System.out.println(roundedDownTemperature);
        System.out.println(courseFinished);
        System.out.println(grade);
        System.out.println(unboxedAge);
    }
}
