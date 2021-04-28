package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Rentals extends ArrayList<Rental> {

    double totalAmount() {
      return stream().mapToDouble(Rental::amount).sum();
    }

    int totalFrequentRenterPoints() {
      return stream().mapToInt(Rental::frequentRenterPoints).sum();
    }
}
