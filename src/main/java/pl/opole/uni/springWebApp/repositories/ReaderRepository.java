package pl.opole.uni.springWebApp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.opole.uni.springWebApp.models.Reader;

public interface ReaderRepository extends JpaRepository<Reader, Long> {

}
