package ch.bbw.cge._13_exception_handling;

public class Main {

    public static void main(String[] args) {
        ScoreService scoreService = new ScoreService();

        try {
            int score = scoreService.parseScore("105");
            System.out.println("Score: " + score);
        } catch (InvalidScoreException exception) {
            System.out.println("Could not read score: " + exception.getMessage());
        } finally {
            System.out.println("Validation attempt finished.");
        }
    }
}
