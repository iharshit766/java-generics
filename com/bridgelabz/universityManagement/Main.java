package com.bridgelabz.universityManagement;

// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating courses
        ExamCourse math101 = new ExamCourse("Mathematics 101", "Science");
        AssignmentCourse literature202 = new AssignmentCourse("Literature 202", "Arts");
        ResearchCourse aiResearch = new ResearchCourse("AI Research", "Computer Science");

        // Managing courses in generic Course class
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        examCourses.addCourse(math101);
        assignmentCourses.addCourse(literature202);
        researchCourses.addCourse(aiResearch);

        // Display specific course types
        System.out.println(" Exam Courses:");
        examCourses.displayCourses();
        System.out.println("\n Assignment Courses:");
        assignmentCourses.displayCourses();
        System.out.println("\n Research Courses:");
        researchCourses.displayCourses();

        // Using wildcard to display all courses
        System.out.println("\n All Courses (Using Wildcards):");
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(math101);
        allCourses.add(literature202);
        allCourses.add(aiResearch);
        CourseUtils.displayAllCourses(allCourses);
    }
}
