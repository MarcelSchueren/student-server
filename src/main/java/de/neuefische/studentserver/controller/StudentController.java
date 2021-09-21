package de.neuefische.studentserver.controller;

import de.neuefische.studentserver.model.Student;
import de.neuefische.studentserver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    StudentService studentService = new StudentService();

//    @GetMapping
//    public List<Student> getStudents() {
//        return studentService.list();
//    }

    @PostMapping
    public void postStudent(@RequestBody Student student) {
        studentService.add(student);
    }

    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable String id) {
        return studentService.getStudent(id);
    }

    @GetMapping
    public List<Student> listStudents(@RequestParam Optional<String> search){
        if (search.isPresent()){
            return studentService.search(search.get());
        }
        return studentService.list();
    }

    @DeleteMapping(path = "{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.delete(id);
    }
}
