package com.bridgelabz.resumeScreening;

// Resume.java
import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public void displayResumes() {
        for (T resume : resumes) {
            System.out.println("Processing Resume for: " + resume.getRoleName());
        }
    }
}
