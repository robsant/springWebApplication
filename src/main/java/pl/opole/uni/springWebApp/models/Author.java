package pl.opole.uni.springWebApp.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long authorID;
  private String name;
  private String surname;
  @ManyToMany
  @JoinTable(name = "author_book", joinColumns = {@JoinColumn(name = "authorID")},
    inverseJoinColumns = {@JoinColumn(name = "book_ID")})
  private List<Book> bookList;


}
