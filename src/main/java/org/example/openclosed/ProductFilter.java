package org.example.openclosed;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter implements Filter<Product>{
  @Override
  public List<Product> filter(List<Product> items, Specification<Product> specification) {
    return items.stream()
        .filter(specification::isSatisfied)
        .collect(Collectors.toList());
  }
}
