package com.company;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class RPGInheritanceTest {

    Farmer MacDonald = new Farmer("MacDonald");
    Warrior Xena = new Warrior("Xena", 100);
    Constable Gordon = new Constable("Gordon", "Warrior");

    @Test
    public void myFarmerShouldBeAFarmer(){
        int expected = 1;
        int actual = MacDonald.getAttackPower();
        assertEquals(expected, actual);

    }

    @Test
    public void myWarriorShouldBeAPrincess(){
        int expected = 100;
        int actual = Xena.getShieldStrength();
        assertEquals(expected, actual);
    }

    @Test
    public void myConstableShouldHelpBatman(){
        String expected = "Warrior";
        String actual = Gordon.getJurisdiction();
        assertEquals(expected,actual);
    }
}
