package pl.opole.uni.springWebApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class MainService <E, R extends JpaRepository<E, Long>>{
  @Autowired
  private R repository;
  public List<E> getAllItems() {
    return repository.findAll();
  }

  public void addItem(E item)
  {
    repository.save(item);
  }

}
