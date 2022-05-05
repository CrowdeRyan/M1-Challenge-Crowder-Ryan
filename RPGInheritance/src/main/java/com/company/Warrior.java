package com.company;

public class Warrior extends Character{

    private int shieldStrength;

    public Warrior (String name){
        super(name,100,100,50,75,10);
        this.shieldStrength;
    }

    public void decreaseShieldStrength(){
        System.out.println(getName() + " is taking armor damage.");
    }
}
