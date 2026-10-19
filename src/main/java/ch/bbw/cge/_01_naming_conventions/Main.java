package ch.bbw.cge._01_naming_conventions;

public class Main {

    public static void main(String[] args) {
        String studentName = "Alex Morgan";
        int completedExercises = 7;

        System.out.println(formatProgressMessage(studentName, completedExercises));
    }

    private static String formatProgressMessage(String studentName, int completedExercises) {
        return studentName + " completed " + completedExercises + " exercises.";
    }
}
