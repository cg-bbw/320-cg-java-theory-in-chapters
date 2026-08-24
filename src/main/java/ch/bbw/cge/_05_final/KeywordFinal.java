package ch.bbw.cge._05_final;

/**
 * One should only use final for constant values that aren't supposed
 * to change at any time. For instance Math.PI is such a constant
 * that is constantly holding the same value.
 */
public class KeywordFinal {
    /**
     * Mostly we use final for primitive datatypes. As for primitive datatypes
     * we can also declare final variables of complex datatype and initialize
     * their value inside the constructor.
     */
    public final FinalCalendar finalCalendar;

    public KeywordFinal(FinalCalendar finalCalendar) {
        this.finalCalendar = finalCalendar;
    }

    /**
     * Mostly we use final for primitive datatypes. With final, we CANNOT make
     * an object of any class immutable, we CAN ONLY prevent it from reassignment.
     * So the content of this method leads to a compile-time error.
     */
    public void reassignFinalCalendar() {
        //this.finalCalendar = new FinalCalendar();
    }

    public final void printWeekdays() {
        System.out.println(finalCalendar);
    }

}
