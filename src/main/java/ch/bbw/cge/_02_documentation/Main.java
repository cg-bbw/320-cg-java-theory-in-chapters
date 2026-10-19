package ch.bbw.cge._02_documentation;

public class Main {

    public static void main(String[] args) {
        DocumentationExamples examples = new DocumentationExamples();

        System.out.println(examples.createProgressMessage("Alex", 7));
        System.out.println(examples.createSummary());
    }
}
