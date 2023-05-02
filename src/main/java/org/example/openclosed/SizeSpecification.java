package org.example.openclosed;

public class SizeSpecification
    implements Specification<Product>{

  Size size;

  public SizeSpecification(Size size) {
    this.size = size;
  }

  @Override
  public boolean isSatisfied(Product item) {
    return item.size == size;
  }
}
