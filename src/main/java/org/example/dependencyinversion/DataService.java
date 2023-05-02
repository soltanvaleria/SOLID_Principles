package org.example.dependencyinversion;

public class DataService {
  private final Database database;

  public DataService(Database database) {
    this.database = database;
  }

  public void saveData(String data) {
    database.saveData(data);
  }
}
