package org.example.dependencyinversion;

public class PostgresSql implements Database{

  @Override
  public void saveData(String data) {
    System.out.println("Saving"+data+" in postgres SQL");
  }
}
