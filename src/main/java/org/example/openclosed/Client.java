package org.example.openclosed;

import java.util.List;

public class Client {

  public static void main(String[] args) {
    Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
    Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
    Product house = new Product("House", Color.BLUE, Size.LARGE);

    List<Product> products = List.of(apple, tree, house);
    ProductFilter bf = new ProductFilter();
    System.out.println("Green products:");
    bf.filter(products, new ColorSpecification(Color.GREEN))
        .forEach(p -> System.out.println(" - " + p.name ));

    System.out.println("Large products:");
    bf.filter(products, new SizeSpecification(Size.LARGE))
        .forEach(p -> System.out.println(" - " + p.name ));

    System.out.println("Large blue items:");
    bf.filter(products,
            new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE)
            ))
        .forEach(p -> System.out.println(" - " + p.name ));
  }
}
