package pl.opole.uni.springWebApp.models;

import javax.persistence.*;
import java.util.List;
@Entity
public class BookCopy {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long bookCopyID;
  @ManyToOne
  @JoinColumn(name="bookID")
  private Book book;
}
