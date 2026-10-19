package ch.bbw.cge._13_exception_handling;

public class ScoreService {

    // throws declares that callers must deal with this checked exception.
    public int parseScore(String text) throws InvalidScoreException {
        int score;

        try {
            score = Integer.parseInt(text);
        } catch (NumberFormatException exception) {
            // throw creates the exceptional control flow for one specific exception object.
            throw new InvalidScoreException("Score must be a whole number.");
        }

        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score must be between 0 and 100.");
        }

        return score;
    }
}
