package ch.bbw.cge._05_final;

public class Course {

    public static final int MAX_STUDENTS = 30;

    private static int renameCount = 0;

    private final String courseCode;
    private String name;

    public Course(String courseCode, String name) {
        this.courseCode = courseCode;
        this.name = name;
    }

    public void rename(String newName) {
        name = newName;
        renameCount++;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getName() {
        return name;
    }

    public static int getRenameCount() {
        return renameCount;
    }
}