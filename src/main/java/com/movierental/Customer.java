package com.movierental;

public class Customer {
  private String name;
  private Rentals rentals = new Rentals();

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
    Rentals rentals = this.rentals;
    return new TextStatement().display(getName(), rentals);
  }

  public String htmlStatement() {
    Rentals rentals = this.rentals;
    return new HtmlStatement().display(this.getName(), rentals);
  }

}
