package ch.bbw.cge._02_documentation;

public class Main {

    public static void main(String[] args) {
        DocumentationExamples examples = new DocumentationExamples();

        examples.combineComments("Readable code", "useful documentation");
        System.out.println(examples.createSummary());

        try {
            System.out.println(examples.describeState(1));
            System.out.println(examples.describeState(-1));
        } catch (IllegalArgumentException exception) {
            System.out.println("Example exception: " + exception.getMessage());
        }
    }
}
