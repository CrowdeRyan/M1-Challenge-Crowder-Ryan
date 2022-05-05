package com.company;

public class Warrior extends Character{

    private int shieldStrength;

    public Warrior (String name, int shieldStrength){
        super(name,100,100,50,75,10);
        this.shieldStrength = shieldStrength;
    }

    public void decreaseShieldStrength(){
        System.out.println(getName() + " is taking armor damage.");
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
