package org.example.interfacesegregation;

public class Photocopier implements Printer, Scanner{

  @Override
  public void print(Document d) {
    System.out.println("Photocopier printing document" + d.getName());
  }

  @Override
  public void scan(Document d) {
    System.out.println("Photocopier scanning document" + d.getName());
  }
}
