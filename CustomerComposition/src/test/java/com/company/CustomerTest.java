package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    Customer Dan = new Customer(
            "Dan",
            "Mueller",
            "PoisonFan299@gmail.com",
            5558675309L,
           null,
            null,
            false
            );

    @Test
    public void isDanABadCustomer(){
        boolean expected = false;
        boolean actual = Dan.isRewardsMember();
        assertEquals(expected, actual);

    }
}