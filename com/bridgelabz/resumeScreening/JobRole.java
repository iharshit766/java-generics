package com.bridgelabz.resumeScreening;

// JobRole.java
public abstract class JobRole {
    public abstract String getRoleName();
}

// Software Engineer Role
class SoftwareEngineer extends JobRole {
    @Override
    public String getRoleName() {
        return "Software Engineer";
    }
}

// Data Scientist Role
class DataScientist extends JobRole {
    @Override
    public String getRoleName() {
        return "Data Scientist";
    }
}

// Product Manager Role
class ProductManager extends JobRole {
    @Override
    public String getRoleName() {
        return "Product Manager";
    }
}
