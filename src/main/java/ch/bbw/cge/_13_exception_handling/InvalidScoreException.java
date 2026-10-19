package ch.bbw.cge._13_exception_handling;

// Extending Exception creates a checked exception type for this domain-specific error.
public class InvalidScoreException extends Exception {

    public InvalidScoreException(String message) {
        super(message);
    }
}
