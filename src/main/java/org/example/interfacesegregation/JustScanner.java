package org.example.interfacesegregation;

public class JustScanner implements Scanner{

  @Override
  public void scan(Document d) {
    System.out.println("Scanning the document "+ d.getName());
  }
}
