package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterIfTest {

    @Test
    public void shouldConvertNumberToCorrespondingMonthNumber() {
        Converter converterIf = new ConverterIf();
        Assert.assertEquals("January", converterIf.convertMonth(1));
        Assert.assertEquals("February", converterIf.convertMonth(2));
        Assert.assertEquals("April", converterIf.convertMonth(4));
        Assert.assertEquals("May", converterIf.convertMonth(5));
        Assert.assertEquals("July", converterIf.convertMonth(7));
        Assert.assertEquals("September", converterIf.convertMonth(9));
        Assert.assertEquals("October", converterIf.convertMonth(10));
    }

    @Test
    public void shouldConvertNumberToCorrespondingDayNumber() {
        Converter converterIf = new ConverterIf();
        Assert.assertEquals("Sunday", converterIf.convertDay(1));
        Assert.assertEquals("Monday", converterIf.convertDay(2));
        Assert.assertEquals("Tuesday", converterIf.convertDay(3));
        Assert.assertEquals("Wednesday", converterIf.convertDay(4));


    }
}