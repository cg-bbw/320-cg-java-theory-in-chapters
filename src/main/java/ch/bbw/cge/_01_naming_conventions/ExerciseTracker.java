
package ch.bbw.cge._01_naming_conventions;

public class ExerciseTracker {

    public static void main(String[] args) {
        String learnerName = "Alex Morgan";
        int solvedTasks = 7;

        System.out.println(createProgressMessage(learnerName, solvedTasks));
    }

    private static String createProgressMessage(String learnerName, int solvedTasks) {
        return learnerName + " completed " + solvedTasks + " exercises.";
    }
}
