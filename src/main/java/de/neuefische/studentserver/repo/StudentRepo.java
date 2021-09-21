package de.neuefische.studentserver.repo;

import de.neuefische.studentserver.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    private final List<Student> students = new ArrayList<>();

    public List<Student> list() {
        return this.students;
    }

    public Student add(Student student) {
        students.add(student);
        return student;
    }

    public Student getStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student not found");
    }

//    public void delete(String id) {
//        if (!students.removeIf(student -> student.getId().equals(id))) {
//            throw new IllegalArgumentException("Student not found");
//        }
//    }

    public void delete(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                return;
            }
            throw new IllegalArgumentException("Student not found");
        }
    }

    public List<Student> search(String s) {
        List<Student> searchResult = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(s.toLowerCase())) {
                searchResult.add(student);
            }
        }
        return searchResult;
    }
}
