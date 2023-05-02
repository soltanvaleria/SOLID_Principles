package org.example.dependencyinversion;

public class Client {

  public static void main(String[] args) {
    Database database = new PostgresSql();
    DataService dataService = new DataService(database);

    dataService.saveData("First data");
    dataService.saveData("Second data");
  }

}
