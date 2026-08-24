package ch.bbw.cge._05_final;

import java.io.Serializable;

/**
 * final classes can extend another class and implement interfaces like every other class.
 */
public final class FinalCalendar extends Calendar implements Serializable {
    /**
     * The following method from the super class cannot be overridden. It doesn't
     * matter if we use the @Override annotation or not.
     *
     * public int getMaxNumberOfDays() {
     *     return 365;
     * }
     */
}
