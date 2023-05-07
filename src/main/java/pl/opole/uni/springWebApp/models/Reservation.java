package pl.opole.uni.springWebApp.models;

import javax.persistence.*;
import java.util.List;
@Entity
public class Reservation {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long reservationID;
  @ManyToOne
  @JoinColumn(name="personID")
  private Reader reader;

  @ManyToMany
  @JoinTable(name = "reservation_book", joinColumns = {@JoinColumn(name = "reservationID")},
    inverseJoinColumns = {@JoinColumn(name = "book_ID")})
  private List<Book> bookList;

  public List<Book> getBookList() {
    return bookList;
  }

  public void setBookList(List<Book> bookList) {
    this.bookList = bookList;
  }

  public Long getReservationID() {
    return reservationID;
  }

  public void setReservationID(Long reservationID) {
    this.reservationID = reservationID;
  }

  public Reader getReader() {
    return reader;
  }

  public void setReader(Reader reader) {
    this.reader = reader;
  }
}
