package com.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void shouldCheckTheStatementForMultipleRentals() {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new Movie("Abc", 2), 5));
        customer.addRental(new Rental(new Movie("Def", 1), 3));
        customer.addRental(new Rental(new Movie("Ghi", 0), 2));
        assertEquals("Rental Record for Test\n" +
                "\tAbc\t4.5\n" +
                "\tDef\t9.0\n" +
                "\tGhi\t2.0\n" +
                "Amount owed is 15.5\n" +
                "You earned 4 frequent renter points", customer.statement());
    }

}