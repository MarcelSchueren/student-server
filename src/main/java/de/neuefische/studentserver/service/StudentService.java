package de.neuefische.studentserver.service;

import de.neuefische.studentserver.model.Student;
import de.neuefische.studentserver.repo.StudentRepo;

import java.util.List;

public class StudentService {

    private StudentRepo studentRepo = new StudentRepo();

    public Student add(Student student) {
        studentRepo.add(student);
        return student;
    }

    public List<Student> list() {
        return studentRepo.list();
    }

    public Student getStudent(int id) {
        return studentRepo.getStudent(id);
    }
}
