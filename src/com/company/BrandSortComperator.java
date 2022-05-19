package com.company;

import java.util.Comparator;

public class BrandSortComperator implements Comparator<Car> {
//Her i klassen BrandSortComperator laver vi en comparator. Comparator er ikke det samme som comparable.
// Comparatorer kan sammenligne på alle de forskellige attributter, som en klasse har. Denne klasse hedder Brand,
// så her sorterer vi selvfølgelig på brand attributten.
//

  @Override
  public int compare(Car o1, Car o2) { //Bemærk at metoden kun hedder compare og IKKE compareTo (compareTo() er en comparable, hvorimod compare() er en comparator)
    return o1.getBrand().compareTo(o2.getBrand());
  }


}
