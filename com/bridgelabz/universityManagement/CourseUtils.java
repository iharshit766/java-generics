package com.bridgelabz.universityManagement;

// CourseUtils.java
import java.util.List;

public class CourseUtils {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}

