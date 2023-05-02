package org.example.interfacesegregation;

public class JustPrinter implements Printer{

  @Override
  public void print(Document d) {
    System.out.println("Printing the document"+d.getName());
  }
}
