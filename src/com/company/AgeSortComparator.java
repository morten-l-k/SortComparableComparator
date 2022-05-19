package com.company;

import java.util.Comparator;

public class AgeSortComparator implements Comparator {
  //Her har vi lavet en comparator for age-attributten fra Car klassen.

  @Override
  public int compare(Object o1, Object o2) {
    Car car1 = (Car)o1;
    Car car2 = (Car)o2;
    return (car1).getAge() - (car2).getAge();
  }
}
