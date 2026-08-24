package ch.bbw.cge._05_final;

import java.time.Year;

public class Calendar {
    public static final int YEAR = Year.now().getValue();

    /**
     * In the following example the variable NUMBER_OF_WEEKDAYS and NUMBER_OF_MONTHS
     * are both compile-time constants and declared on class level (static).
     * That makes them independent to object instantiation therefore they
     * are required to be initialized the moment they are declared.
     * public static final int NUMBER_OF_WEEKDAYS; does not work and leads to an error.
     * Such constants are available the whole time from the start
     * of the application until the end and never change their values.
     * If you want to use the constant only inside this class, it can be declared private.
     * The naming convention for static final variables is to write them all uppercase
     * with word separation by the use of underscores.
     */
    public static final int NUMBER_OF_WEEKDAYS = 7;
    private static final int NUMBER_OF_MONTHS = 12;

    /**
     * In cases of non-static final variables, means local constants,
     * we use the same naming convention as for normal variables which is camelCase.
     * See also final int MAX_NUMBER_OF_DAYS = 31; below
     */
    private final int numberOfDaysAYear = 365;

    /**
     * One cannot use a non-static variable in a static method.
     * So static here would lead to a compile-time error (beside the fact
     * that numberOfDaysAYear should rather be a static final constant).
     * Only static data may be accessed by a static method.
     * @return number of days in a regular year
     */
    public /*static*/ int getNumberOfDaysAYear() {
        return numberOfDaysAYear;
    }

    /**
     * Here we use a local constant which can't be declared static, since
     * it is not visible on class level but only inside this method definition block.
     * @return max number of days in a month
     */
    public final int getMaxNumberOfDays() {
        final int MAX_NUMBER_OF_DAYS = 31;
        return MAX_NUMBER_OF_DAYS;
    }

    /**
     * Since we have declared the variable NUMBER_OF_MONTHS private,
     * we cannot use it directly from outside this class.
     * Since the value of NUMBER_OF_MONTHS will never change, as it is final,
     * the variable should rather be declared public, if we want to use it
     * form outside the class.
     * @return number of months in a year
     */
    public static int getNumberOfMonths() {
        return NUMBER_OF_MONTHS;
    }
}
