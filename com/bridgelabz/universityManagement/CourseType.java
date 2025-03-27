package com.bridgelabz.universityManagement;


public abstract class CourseType {
    private String courseName;
    private String department;

    public CourseType(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    public String getCourseName() { return courseName; }
    public String getDepartment() { return department; }

    public abstract String getEvaluationMethod();

    @Override
    public String toString() {
        return courseName + " (" + department + ") - " + getEvaluationMethod();
    }
}

// Exam-Based Course
class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public String getEvaluationMethod() {
        return "Exam-Based Evaluation";
    }
}

// Assignment-Based Course
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based Evaluation";
    }
}

// Research-Based Course
class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public String getEvaluationMethod() {
        return "Research-Based Evaluation";
    }
}
