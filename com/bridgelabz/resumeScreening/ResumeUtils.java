package com.bridgelabz.resumeScreening;

// ResumeUtils.java
import java.util.List;

public class ResumeUtils {
    public static void screenResumes(List<? extends JobRole> resumes) {
        if (resumes.isEmpty()) {
            System.out.println("❌ No resumes available for screening.");
            return;
        }
        System.out.println("✅ Screening resumes for multiple job roles:");
        for (JobRole resume : resumes) {
            System.out.println("- Screening resume for: " + resume.getRoleName());
        }
    }
}

