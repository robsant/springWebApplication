package pl.opole.uni.springWebApp.models;


import javax.persistence.*;

//@MappedSuperclass
@Entity
//@Inheritance//(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="person_type",discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ID;
  private String name;
  private String surname;
  private String pesel;


  public void setID(long ID) {
    this.ID = ID;
  }
  public long getID() {
    return ID;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getPesel() {
    return pesel;
  }

  public void setPesel(String pesel) {
    this.pesel = pesel;
  }





}
