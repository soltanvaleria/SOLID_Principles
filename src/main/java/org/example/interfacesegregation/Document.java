package org.example.interfacesegregation;

public class Document {

  protected String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Document(String name) {
    this.name = name;
  }
}
