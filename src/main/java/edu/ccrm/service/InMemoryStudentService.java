package edu.ccrm.service;

import edu.ccrm.domain.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Simple in-memory implementation (demonstrates collections, upcast/downcast).
 */
public class InMemoryStudentService implements StudentService {
    private final List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student s) throws Exception {
        if (students.stream().anyMatch(st -> st.getRegNo().equals(s.getRegNo()))) {
            throw new Exception("Duplicate regNo");
        }
        students.add(s);
    }

    @Override
    public List<Student> listStudents() {
        return List.copyOf(students);
    }

    @Override
    public Student findByRegNo(String regNo) {
        Optional<Student> o = students.stream().filter(s -> s.getRegNo().equals(regNo)).findFirst();
        return o.orElse(null);
    }
}
