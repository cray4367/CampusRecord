package edu.ccrm.domain;

public class Instructor extends Person {
    private String department;

    public Instructor(String id, String fullName, String email, String department) {
        super(id, fullName, email);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String d) { this.department = d; }

    @Override
    public String profile() {
        return String.format("Instructor: %s (%s) - Dept: %s", fullName, email, department);
    }
}
