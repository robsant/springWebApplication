package pl.opole.uni.springWebApp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.opole.uni.springWebApp.models.Student;

public interface StudentRepository  extends JpaRepository<Student, Long> {

}
