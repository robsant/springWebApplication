package pl.opole.uni.springWebApp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.opole.uni.springWebApp.models.Reader;
import pl.opole.uni.springWebApp.services.ReaderService;

import java.util.List;

@RestController
public class ReaderController {
  @Autowired
  private ReaderService readerService;
  @GetMapping("/readers")
  public List<Reader> getAllStudents() {
    return readerService.getAllItems();
  }


}
