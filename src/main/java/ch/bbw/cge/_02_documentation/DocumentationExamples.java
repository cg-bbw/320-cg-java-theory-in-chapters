package ch.bbw.cge._02_documentation;

/**
 * Demonstrates the most important documentation forms used in this chapter.
 *
 * @see DocumentationLinkedClass
 */
public class DocumentationExamples {

    // This text is intentionally temporary so the TODO example has a visible target.
    private String temporaryText = "Training value";

    /*
     * A block comment can explain a larger section.
     * It is not automatically part of generated API documentation.
     */
    private String documentationTopic = "Useful documentation";

    // TODO Replace this training text when the exercise is complete.

    /**
     * Combines a learner name with a short progress message.
     *
     * @param learnerName the name shown in the message
     * @param completedExercises the number of completed exercises
     * @return a readable progress message
     */
    public String createProgressMessage(String learnerName, int completedExercises) {
        return learnerName + " completed " + completedExercises + " exercises.";
    }

    /**
     * Creates a short summary of the stored documentation examples.
     *
     * @return a human-readable summary
     */
    public String createSummary() {
        return documentationTopic + " | " + temporaryText;
    }
}
