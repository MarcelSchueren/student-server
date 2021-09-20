package de.neuefische.studentserver.repo;

import de.neuefische.studentserver.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    private List<Student> students = new ArrayList<>();

    public List<Student> list() {
        return this.students;
    }

    public Student add(Student student) {
        students.add(student);
        return student;
    }

    public Student getStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student not found");
    }
}
