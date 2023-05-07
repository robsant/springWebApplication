package pl.opole.uni.springWebApp.models;

import javax.persistence.*;


@Entity
//@DiscriminatorValue("a")
public class Employee extends Person{



  //@transient
  private String title;
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

}
