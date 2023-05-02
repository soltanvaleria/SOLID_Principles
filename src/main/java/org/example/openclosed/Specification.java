package org.example.openclosed;

public interface Specification<T> {
  boolean isSatisfied(T item);

}
