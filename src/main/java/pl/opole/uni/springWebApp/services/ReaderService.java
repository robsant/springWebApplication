package pl.opole.uni.springWebApp.services;


import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.Reader;
import pl.opole.uni.springWebApp.repositories.ReaderRepository;

@Service
public class ReaderService extends MainService<Reader, ReaderRepository> {

/*@Autowired
  private StudentRepository studentRepository;
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }*/


}
