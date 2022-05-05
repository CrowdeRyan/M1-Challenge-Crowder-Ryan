package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

public class CalculationTest {
    Calculation calculation;

    @Before
    public void setUp() throws Exception {
        calculation = new Calculation();
    }

    @Test
    public void TestCalculation() {
        Assert.assertEquals(2, calculation.add(1, 1), 0.01);
        Assert.assertEquals(5.6f, calculation.add(3.3f, 2.3f), 0.001);
        Assert.assertEquals(75, calculation.add(23,52),0.01);
        Assert.assertEquals(68, calculation.multiply(34,2),0.01);
        Assert.assertEquals(4, calculation.divide(12,3),0.01);
        Assert.assertEquals(1.71f, calculation.divide(12.0f, 7.0f),0.01);
        Assert.assertEquals(5.7f, calculation.add(3.4f, 2.3f),0.01);
        Assert.assertEquals(29.48f, calculation.multiply(6.7f,4.4f),0.01);
        Assert.assertEquals(5,calculation.subtract(5.5f, 0.5f),0.01);
        Assert.assertEquals(4.9f, calculation.divide(10.8f, 2.2f),0.01);
    }


}