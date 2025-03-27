package com.bridgelabz.universityManagement;

// Course.java
import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (T course : courses) {
            System.out.println(course);
        }
    }
}

