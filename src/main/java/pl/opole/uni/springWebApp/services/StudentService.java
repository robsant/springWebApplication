package pl.opole.uni.springWebApp.services;


import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Student;
import pl.opole.uni.springWebApp.repositories.StudentRepository;

@Service
public class StudentService extends MainService<Student, StudentRepository> {

/*@Autowired
  private StudentRepository studentRepository;
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }*/


}
