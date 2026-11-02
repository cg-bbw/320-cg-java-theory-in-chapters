package ch.bbw.cge._01_naming_conventions;

public class ExerciseProgress {

    public static void main(String[] programArguments) {
        String learnerName = "Alex Morgan";
        int finishedExerciseCount = 7;

        System.out.println(
                createProgressMessage(learnerName, finishedExerciseCount)
        );
    }

    private static String createProgressMessage(
            String participantName,
            int solvedExerciseCount) {

        return participantName + " completed "
                + solvedExerciseCount + " exercises.";
    }
}