package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Student demonstrating encapsulation, collection of enrolled courses, and toString().
 */
public class Student extends Person {
    private String regNo;
    private boolean active;
    private final LocalDate registeredOn;
    private final List<String> enrolledCourses = new ArrayList<>();

    public Student(String id, String regNo, String fullName, String email, LocalDate registeredOn) {
        super(id, fullName, email);
        this.regNo = regNo;
        this.active = true;
        this.registeredOn = registeredOn;
    }

    public String getRegNo() { return regNo; }
    public boolean isActive() { return active; }
    public LocalDate getRegisteredOn() { return registeredOn; }
    public List<String> getEnrolledCourses() { return enrolledCourses; }

    public void deactivate() { this.active = false; }
    public void enroll(String courseCode) { enrolledCourses.add(courseCode); }
    public void unenroll(String courseCode) { enrolledCourses.remove(courseCode); }

    @Override
    public String profile() {
        return String.format("Student[%s]: %s (%s) - Registered: %s", regNo, fullName, email, registeredOn);
    }

    @Override
    public String toString() {
        return profile();
    }
}
