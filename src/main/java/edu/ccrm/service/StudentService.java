package edu.ccrm.service;

import edu.ccrm.domain.Student;
import java.util.List;

/**
 * Service interface to demonstrate interfaces and implementations.
 */
public interface StudentService {
    void addStudent(Student s) throws Exception;
    List<Student> listStudents();
    Student findByRegNo(String regNo);
}
