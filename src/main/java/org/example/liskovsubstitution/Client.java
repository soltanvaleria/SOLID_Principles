package org.example.liskovsubstitution;

import java.util.ArrayList;
import java.util.List;

public class Client {

  public static void main(String[] args) {
    List<GeometricShape> shapes = new ArrayList<>();
    shapes.add(new Square(5));
    shapes.add(new Rectangle(5, 10));

    for (GeometricShape shape : shapes) {
      System.out.println("Area: " + shape.getArea());
      System.out.println("Perimeter: " + shape.getPerimeter());
    }
  }
}
