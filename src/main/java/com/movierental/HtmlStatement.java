package com.movierental;

class HtmlStatement {
    public String display(String customerName, Rentals rentals) {
        String result = "<h1>Rental Record for <b>" + customerName + "</b></h1><br/>";
        for (Rental rental : rentals) {
            result += rental.getMovie().getTitle() + " " + rental.amount() + "<br/>";
        }
        result += "Amount owed is <b>" + rentals.totalAmount() + "</b><br/>";
        result += "You earned <b>" + rentals.totalFrequentRenterPoints() + "</b> frequent renter points";
        return result;
    }
}
