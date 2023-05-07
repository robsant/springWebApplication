package pl.opole.uni.springWebApp.models;

import javax.persistence.*;
import java.util.List;
@Entity
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long bookID;
  private String title;
  private String author;
  private String isbn;
  private String publisher;
  private String genre;
  private String description;
  private String language;
  private int year;
  private int pages;
  private int copies;
  private int availableCopies;
  private int reservedCopies;
  @OneToMany(mappedBy = "book")
  private List<BookCopy> bookCopyList;

}
