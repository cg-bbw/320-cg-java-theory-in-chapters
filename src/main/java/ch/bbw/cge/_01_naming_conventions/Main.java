package ch.bbw.cge._01_naming_conventions;

public class Main {

    private static final int MAX_LOGIN_ATTEMPTS = 3;

    public static void main(String[] args) {
        String studentName = "John Wick";
        int completedExercises = 67;

        System.out.println(formatProgressMessage(studentName, completedExercises));
        System.out.println("Maximum login attempts: " + MAX_LOGIN_ATTEMPTS);
    }

    private static String formatProgressMessage(String studentName, int completedExercises) {
        return studentName + " completed " + completedExercises + " exercises.";
    }
}
