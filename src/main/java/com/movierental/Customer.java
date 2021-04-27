package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private String name;
  private List<Rental> rentals = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    String result = "Rental Record for " + getName() + "\n";
    for (Rental each : rentals) {
      //show figures for this rental
      result += "\t" + each.getMovie().getTitle() + "\t" +
              each.amount() + "\n";
    }

    //add footer lines result
    result += "Amount owed is " + totalAmount() + "\n";
    result += "You earned " + totalFrequentRenterPoints()
        + " frequent renter points";
    return result;
  }

  public String htmlStatement() {
    String result = "<h1>Rental Record for <b>" + getName() + "</b></h1><br/>";
    for(Rental rental: rentals) {
      result += rental.getMovie().getTitle() + " " + rental.amount() + "<br/>";
    }
    result += "Amount owed is <b>" + totalAmount() + "</b><br/>";
    result += "You earned <b>" + totalFrequentRenterPoints() + "</b> frequent renter points";
    return result;
  }

  private int totalFrequentRenterPoints() {
    return rentals.stream().mapToInt(Rental::frequentRenterPoints).sum();
  }

  private double totalAmount() {
    return rentals.stream().mapToDouble(Rental::amount).sum();
  }

}
