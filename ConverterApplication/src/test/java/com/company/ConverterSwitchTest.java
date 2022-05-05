package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterSwitchTest {

    @Test
    public void shouldConvertNumberToCorrespondingMonth() {
        Converter converterSwitch = new ConverterSwitch();
        Assert.assertEquals("January", converterSwitch.convertMonth(1));
        Assert.assertEquals("March", converterSwitch.convertMonth(3));
        Assert.assertEquals("June", converterSwitch.convertMonth(6));
        Assert.assertEquals("August", converterSwitch.convertMonth(8));
        Assert.assertEquals("November", converterSwitch.convertMonth(11));
    }

    @Test
    public void shouldConvertNumberToCorrespondingDay() {
        Converter converterSwitch = new ConverterSwitch();
        Assert.assertEquals("Sunday", converterSwitch.convertDay(1));
        Assert.assertEquals("Thursday", converterSwitch.convertDay(5));
        Assert.assertEquals("Friday", converterSwitch.convertDay(6));
        Assert.assertEquals("Saturday", converterSwitch.convertDay(7));

    }
}