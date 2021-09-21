package de.neuefische.studentserver.service;

import de.neuefische.studentserver.model.Student;
import de.neuefische.studentserver.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo = new StudentRepo();


    public Student add(Student student) {
        studentRepo.add(student);
        return student;
    }

    public List<Student> list() {
        return studentRepo.list();
    }

    public Student getStudent(String id) {
        return studentRepo.getStudent(id);
    }

    public void delete(String id) {
        studentRepo.delete(id);
    }

    public List<Student> search(String s) {
        return studentRepo.search(s);
    }
}
