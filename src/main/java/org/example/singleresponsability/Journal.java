package org.example.singleresponsability;

import java.util.ArrayList;
import java.util.List;

public class Journal {
  private final List<String> lines = new ArrayList<>();
  private static int count = -1;
  public void addLine(String text) {
    lines.add("" + (++count) + ": " + text);
  }
  public void removeLine(int index) {
    lines.remove(index);
  }
  @Override
  public String toString() {
    return String.join(System.lineSeparator(), lines)+"\n";
  }
}

