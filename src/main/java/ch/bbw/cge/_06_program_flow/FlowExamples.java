package ch.bbw.cge._06_program_flow;

public class FlowExamples {

    public String describeScore(int score) {
        if (score >= 60) {
            return "Passed";
        } else {
            return "Not passed";
        }
    }

    public String describeLevel(int level) {
        return switch (level) {
            case 1 -> "Beginner";
            case 2 -> "Intermediate";
            case 3 -> "Advanced";
            default -> "Other level";
        };
    }

    public void printSelectedNumbers() {
        for (int i = 0; i < 10; i++) {
            if (i == 1) {
                continue;
            }

            if (i == 6) {
                break;
            }

            System.out.println("for: " + i);
        }
    }

    public void printNames() {
        String[] names = {"Alex", "Sam", "Lee"};

        for (String name : names) {
            System.out.println("name: " + name);
        }
    }

    public void countWithWhile() {
        int counter = 0;

        while (counter < 3) {
            System.out.println("while: " + counter);
            counter++;
        }
    }

    public void countWithDoWhile() {
        int counter = 0;

        do {
            System.out.println("do/while: " + counter);
            counter++;
        } while (counter < 2);
    }
}