package pl.opole.uni.springWebApp.models;


import javax.persistence.*;

@Entity
//@Table(name="studenci")
//@DiscriminatorValue("b")
public class Student extends Person{




  //@transient
  private String indexNumber;

  public String getIndexNumber() {
    return indexNumber;
  }
  public void setIndexNumber(String indexNumber) {
    this.indexNumber = indexNumber;
  }
  //@ManyToOne
  //@JoinColumn
  //private StudentType type;



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
