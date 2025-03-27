package com.bridgelabz.resumeScreening;

// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating job role instances
        SoftwareEngineer se = new SoftwareEngineer();
        DataScientist ds = new DataScientist();
        ProductManager pm = new ProductManager();

        // Managing resumes using generic Resume class
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.addResume(se);

        Resume<DataScientist> dsResumes = new Resume<>();
        dsResumes.addResume(ds);

        // Displaying individual resumes
        System.out.println("📄 Software Engineer Resumes:");
        seResumes.displayResumes();

        System.out.println("\n📄 Data Scientist Resumes:");
        dsResumes.displayResumes();

        // Using wildcard method for screening multiple resumes
        System.out.println("\n Screening All Resumes:");
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(se);
        allResumes.add(pm);
        ResumeUtils.screenResumes(allResumes);
    }
}
