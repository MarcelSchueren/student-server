package de.neuefische.studentserver.controller;

import de.neuefische.studentserver.model.Student;
import de.neuefische.studentserver.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    StudentService studentService = new StudentService();

    @GetMapping
    public List<Student> getStudents() {
        return studentService.list();
    }

    @PostMapping
    public void postStudent(@RequestBody Student student) {
        studentService.add(student);
    }

    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }
}
