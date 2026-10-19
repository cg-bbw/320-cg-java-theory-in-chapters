package ch.bbw.cge._14_unit_testing;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // This tiny test harness demonstrates the testing idea without an external library.
        // JUnit will later replace this manual infrastructure with a standard test framework.
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(-2, 2), "-2 + 2 should equal 0");

        System.out.println("All manual tests passed.");
    }

    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + ". Expected " + expected + " but got " + actual + ".");
        }
    }
}
