package pl.opole.uni.springWebApp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Student;
import pl.opole.uni.springWebApp.repositories.StudentRepository;

import java.util.List;
@Service
public class StudentService {
@Autowired
  private StudentRepository studentRepository;
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }


}
