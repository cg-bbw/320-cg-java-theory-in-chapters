package ch.bbw.cge._06_program_flow;

public class FlowExamples {

    public String describeScore(int score) {
        // if/else selects one of two branches based on a boolean condition.
        if (score >= 60) {
            return "Passed";
        } else {
            return "Not passed";
        }
    }

    public String describeLevel(int level) {
        // switch selects one matching case; default handles every other value.
        return switch (level) {
            case 1 -> "Beginner";
            case 2 -> "Intermediate";
            default -> "Other level";
        };
    }

    public void printSelectedNumbers() {
        // A traditional for loop is useful when the counter itself matters.
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                // continue skips the rest of this iteration.
                continue;
            }

            if (i == 5) {
                // break ends the loop immediately.
                break;
            }

            System.out.println("for: " + i);
        }
    }

    public void printNames() {
        String[] names = {"Alex", "Sam", "Lee"};

        // The enhanced for loop processes each element directly.
        for (String name : names) {
            System.out.println("name: " + name);
        }
    }

    public void countWithWhile() {
        int counter = 0;

        // while checks its condition before each iteration.
        while (counter < 3) {
            System.out.println("while: " + counter);
            counter++;
        }
    }

    public void countWithDoWhile() {
        int counter = 0;

        // do/while executes the body once before checking the condition.
        do {
            System.out.println("do/while: " + counter);
            counter++;
        } while (counter < 2);
    }
}
