package org.example.singleresponsability;

import java.io.FileWriter;
import java.io.IOException;

public class FileConvertor {

  public void saveToFile(Journal journal, String filename, boolean append) {
    try {

      if (!append) {
        FileWriter fw = new FileWriter(filename, append);
        fw.write(journal.toString());
        fw.close();
      } else {
        FileWriter fw = new FileWriter(filename, append);
        fw.write(journal.toString());
        fw.close();
      }

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
