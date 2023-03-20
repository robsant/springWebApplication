package pl.opole.uni.springWebApp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.opole.uni.springWebApp.models.Student;
import pl.opole.uni.springWebApp.services.StudentService;

import java.util.List;

@RestController
public class StudentController {
  @Autowired
  private StudentService studentService;
  @GetMapping("/students")
  public List<Student> getAllStudents() {
    return studentService.getAllStudents();
  }


}
