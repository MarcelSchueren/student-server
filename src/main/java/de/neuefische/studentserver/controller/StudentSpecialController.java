package de.neuefische.studentserver.controller;

import de.neuefische.studentserver.model.Student;
import de.neuefische.studentserver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("special")
public class StudentSpecialController {

    private final StudentService studentService;

    @Autowired
    public StudentSpecialController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> list() {
        return studentService.list();
    }
}

