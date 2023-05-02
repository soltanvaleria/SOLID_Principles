package org.example.singleresponsability;

public class Client {

  public static void main(String[] args) {
    Journal j = new Journal();
    j.addLine("It was a hard day");
    j.addLine("I cried");
    System.out.println(j);

    FileConvertor fileConvertor = new FileConvertor();
    String filename = "C:\\UTM\\Anul3\\TMPS\\laborator_4\\src\\main\\java\\org\\example\\singleResponsability\\journal.txt";
    fileConvertor.saveToFile(j, filename, true);

  }
}
