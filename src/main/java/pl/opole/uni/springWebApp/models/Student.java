package pl.opole.uni.springWebApp.models;


import javax.persistence.*;

@Entity
//@Table(name="studenci")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ID;
//@transient
  private String name;

  //@ManyToOne
  //@JoinColumn
  //private StudentType type;
  public void setID(long ID) {
    this.ID = ID;
  }
  public long getID() {
    return ID;
  }


  /*
  @Override
  public boolean equals(Object obj) {
  if(this==obj)
    return true;
  if(obj == null)
  return false;
  if(getClass)
    return super.equals(obj);
  }
  */

}
