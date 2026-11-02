package ch.bbw.cge._05_final;

public class Main {

    public static void main(String[] args) {
        Course javaCourse = new Course("JAVA", "Java Basics");
        Course databaseCourse = new Course("DB", "Database Basics");

        final Course selectedCourse = javaCourse;

        selectedCourse.rename("Java Fundamentals");
        databaseCourse.rename("SQL Fundamentals");
        javaCourse.rename("Advanced Java");

        // Nicht erlaubt, weil selectedCourse final ist:
        // selectedCourse = databaseCourse;

        System.out.println("Selected course: " + selectedCourse.getName());
        System.out.println("Database course: " + databaseCourse.getName());
        System.out.println("Maximum students: " + Course.MAX_STUDENTS);
        System.out.println("Rename calls: " + Course.getRenameCount());
    }
}